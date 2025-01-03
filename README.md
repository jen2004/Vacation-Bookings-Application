# Vacation Bookings Application
I completed this project during my 5th semester at WGU as a part of the class, Back-end Programming D288.
For the complete project requirements, please refer to the “Rubric.pdf” file. Additional project details can be found in these files: ERD.pdf and UML.jpg.

Instructions on how to run this program:
1.	Start the database in MySQL Workbench.
2.	Start the front end.
3.	Run the application in IntelliJ.

Instructions on how to start the database:
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

Instructions on how to start the front-end:
1.	Save the folder “D288 Front End” on your local machine.
2.	Right click Windows PowerShell and run as administrator.
3.	Type “cd”, then the location of the D288 Front End folder, then press Enter.  Example: 

cd “C:\Users\jenic\OneDrive\Documents\WGU\FILES FROM LAB ENVIRO\D288 Front End”

4.	Type “npm run start”, then press Enter.
5.	If this was successful you will get the message “Compiled successfully” in the PowerShell window.
6.	The front-end application will now be running on http://localhost:4200/.
If you need to stop the front-end, press CTRL + C in the PowerShell window. 


Instructions on how to run the program in IntelliJ:
1.	Open this GitHub project in IntelliJ IntelliJ IDEA 2024.2.0.1.
2.	 Click the green arrow to run the application.
3.	The application will now be running on http://localhost:4200/.
