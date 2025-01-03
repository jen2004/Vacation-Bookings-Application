package com.example.demo.services;

import com.example.demo.dao.CartItemRepository;
import com.example.demo.dao.CartRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Customer;
import com.example.demo.entities.StatusType;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;
    private CartRepository cartRepository;
    private CartItemRepository cartItemRepository;

    public CheckoutServiceImpl(
            CustomerRepository customerRepository,
            CartRepository cartRepository,
            CartItemRepository cartItemRepository
    ) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        try {

            // retrieve the cart info from dto
            Cart cart = purchase.getCart();

            // generate tracking number
            String orderTrackingNumber = generateOrderTrackingNumber();
            cart.setOrderTrackingNumber(orderTrackingNumber);

            // populate cart with cart items
            Set<CartItem> cartItems = purchase.getCartItems();
            cartItems.forEach(item -> cart.add(item));

            // set cart status to ordered
            cart.setStatus(StatusType.ordered);

            // save cart to the cart repository
            cartRepository.save(cart);

            //populate customer with cart
            Customer customer = purchase.getCustomer();
            customer.add(cart);

            return new PurchaseResponse(orderTrackingNumber);
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Cart is empty");
        }

    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();

    }
}
