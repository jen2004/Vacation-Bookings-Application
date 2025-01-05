# Vacation Bookings Application
I completed this project during my 5th semester at WGU as a part of the class, Back-end Programming D288.

This application is an ecommerce application with a Spring Framework, Angular frontend, and a MySQL database.

During this project, I :

•	Created a functional e-commerce backend using Spring Boot, following detailed specifications.<br>
•	Implemented features including a customer shopping cart, a checkout service, and an order tracking system.<br>
•	Utilized the MVC architecture and develop RESTful APIs, integrating data validation and sample customer data.<br>

For the complete project requirements, please refer to the “Rubric.pdf” file. Additional project details can be found in these files: ERD.pdf and UML.jpg.

For instructions on how to run this application, scroll to the bottom of this page.

Here are some images of the vacation bookings application:

![1](https://github.com/user-attachments/assets/906edd5c-0081-4c01-894b-51a85db7051c)

![2](https://github.com/user-attachments/assets/a1e9b30c-2736-405b-8811-458270c4bd3d)

![3](https://github.com/user-attachments/assets/836af858-d0d6-4c0c-805f-a0dc5435f7fb)

![33](https://github.com/user-attachments/assets/58fa3bd7-c5a4-4468-adfd-bbdd39ffb00a)

![44](https://github.com/user-attachments/assets/a1756661-a96b-4492-a960-da99695de801)

![4](https://github.com/user-attachments/assets/8717e15c-b7e2-4277-9124-b8de72d2d406)

![6](https://github.com/user-attachments/assets/dae42a01-db36-4a1c-9356-9e40614b94a5)

<strong>Instructions on how to run this program:</strong>
1.	Start the database in MySQL Workbench.
2.	Start the front end.
3.	Run the application in IntelliJ.

<strong>Instructions on how to start the database:</strong>
1.	Save the file “create_and_populate_db.sql” to your local machine.
2.	Open MySQL Workbench 8.0 CE
3.	Click on the 'Local instance MySQL80` connection.
4.	Go to File > Open SQL Script.  Then, select “create_and_populate_db.sq” and click “Open”.
5.	Click the lightning bolt to execute the script.

The script 'resets' the database state in 3 steps:
•	Drops the database and recreates it.
•	Inserts a demo customer and cart, and all other data.
•	Creates a user `ecommerceapp` and grants permissions as needed.
•	Tip: Always reset the database after testing to ensure a clean slate.

<strong>Instructions on how to start the front-end:</strong>
1.	Save the folder “D288 Front End” on your local machine.
2.	Right click Windows PowerShell and run as administrator.
3.	Type “cd”, then the location of the D288 Front End folder, then press Enter.  Example: 

cd “C:\Users\jenic\OneDrive\Documents\WGU\FILES FROM LAB ENVIRO\D288 Front End”

4.	Type “npm run start”, then press Enter.
5.	If this was successful you will get the message “Compiled successfully” in the PowerShell window.
6.	The front-end application will now be running on http://localhost:4200/.
If you need to stop the front-end, press CTRL + C in the PowerShell window. 


<strong>Instructions on how to run the program in IntelliJ:</strong>
1.	Open this GitHub project in IntelliJ IntelliJ IDEA 2024.2.0.1.
2.	 Click the green arrow to run the application.
3.	The application will now be running on http://localhost:4200/.


