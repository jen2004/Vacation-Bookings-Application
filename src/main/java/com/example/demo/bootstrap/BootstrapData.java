package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootstrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootstrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {;

        // create divisions for sample customers
        Division sueDiv = divisionRepository.findById(Long.valueOf(29)).orElse(null);
        Division billyDiv = divisionRepository.findById(Long.valueOf(30)).orElse(null);
        Division kevinDiv = divisionRepository.findById(Long.valueOf(31)).orElse(null);
        Division chrissyDiv = divisionRepository.findById(Long.valueOf(32)).orElse(null);
        Division gwenDiv = divisionRepository.findById(Long.valueOf(33)).orElse(null);

        // Create 5 sample customers
        Customer sue = new Customer(Long.valueOf(2), "Sue", "Short", "45 Main St", "08109", "(555)555-5555", null, null, sueDiv);
        Customer billy = new Customer(Long.valueOf(3), "Billy", "Bahm", "45 Apple St", "08109", "(555)555-5555", null, null, billyDiv);
        Customer kevin = new Customer(Long.valueOf(4), "Kevin", "Gatti", "45 Maple St", "08109", "(555)555-5555", null, null, kevinDiv);
        Customer chrissy = new Customer(Long.valueOf(5), "Chrissy", "Short", "45 Dogwood St", "08109", "(555)555-5555", null, null, chrissyDiv);
        Customer gwen = new Customer(Long.valueOf(6), "Gwen", "Penick", "45 Orlando St", "08109", "(555)555-5555", null, null, gwenDiv);

        // Save customers to customer repository
        customerRepository.save(sue);
        customerRepository.save(billy);
        customerRepository.save(kevin);
        customerRepository.save(chrissy);
        customerRepository.save(gwen);


        List<Customer> customerList = customerRepository.findAll();

    }

}


