# javafsd


SQL CAR RENTAL

1)Car rental system - Create Table
Refer to the given schema.
Write a query to create the Owners table with the specified columns and constraints.
Note: Letters in bold represents the table name
Note: Maintain the same sequence of column order, as specified in the question description

----------------------------------------------------------------------------------
Cars not taken for rent
Write a query to display car id, car name, car type of cars which was not taken for rent. Sort the result based on car id.
HINT: Use Cars and Rentals tables to retrieve records.
NOTE: Maintain the same sequence of column order, as specified in the question description

-------------------------------------------------------------------------
Car & owner details based on car type
Write a query to display car id, car name and owner id of all the cars whose car type is 'Hatchback' or 'SUV'. Sort the result based on car id.
(Hint: Use CARS tables to retrieve records. Data is case-sensitive. E.g: Car_type='Hatchback'. Use IN operator)
NOTE: Maintain the same sequence of column order, as specified in the question description
------------------------------------------------------------------------------------------

Car rental system - add new column
Refer to the given schema. Assume, CARS table has been already created. Write an appropriate query for the given requirement.
Requirement 1: Add a new column Car_Regno VARCHAR(10) to the Cars table.
Note: Letters in the bold represents the attribute name.
------------------------------------------------------------------------------------------
Car details based on type and name
Write a query to display car id, car name and car type of Maruthi company 'Sedan' type cars. Sort the result based on car id.
(HINT : Use Cars table to retrieve records.car name='Maruthi Swift'.car type='Sedan'.Data is case sensitive.)
NOTE: Maintain the same sequence of column order, as specified in the question description
--------------------------------------------------------------------------------------
Maruthi car owner details
Write a query to display distinct owner id, owner name, address, and phone no of owners who owns 'Maruthi' company car. Sort the result based on owner id.
Note: If car_name contains a string 'Maruthi' it is a Maruthi company car.
Example: 'Maruthi swift','Maruthi 800'
HINT: Use Owners and Cars tables to retrieve records.
NOTE: Maintain the same sequence of column order, as specified in the question description
------------------------------------------------------------------------------------------
car rental system - Insert values
Refer to the given schema diagram. Insert the below records into Rentals Table. Assume the rentals table has been already created.
 
Note: Letters in bold represent the attributes.
NOTE: Maintain the same sequence of column order, as specified in the question description
----------------------------------------------------------------------------------------

Rental details based on date
Write a query to display rental id, car id, customer id and km driven of rentals taken during 'AUGUST 2019'. Sort the result based on rental id.
(HINT : Use Rentals table to retrieve records. Eg: return date: 2019-08-12 )
NOTE: Maintain the same sequence of column order, as specified in the question description

-------------------------------------------------------------------------------------------

No of time rented by each car
Write a query to display car id and number of times car taken for rental. Give an alias name to the number of times car taken for rental as 'NO_OF_TRIPS'. Sort the records based on car id in ascending order.
(HINT: Use Rentals table to retrieve records.)



2.SQL-EMPLOYEE DEPARTMENT 

1)create a employeed table and department table 

CREATE TABLE Employee (
    employee_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    hire_date DATE NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    department_id INT NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);
CREATE TABLE Department (
    department_id INT NOT NULL AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location VARCHAR(100),
    PRIMARY KEY (department_id)
);
Write a query to fetch the first_name from the Employee table in the upper case and use the ALIAS name as EmpName.
Write a query to fetch the number of employees working in the department ‘HR’.
Write a query to get the current date.
Write a query to retrieve the first four characters of  EmpLname from the EmployeeInfo table.
Write a query to fetch only the place name(string before brackets) from the Address column of EmployeeInfo table.
Write a query to create a new table that consists of data and structure copied from the other table.
Write q query to find all the employees whose salary is between 50000 to 100000.
Write a query to find the names of employees that begin with ‘S’
Write a query to fetch top N records.
Write a query to retrieve the EmpFname and EmpLname in a single column as “FullName”. The first name and the last name must be separated with space.

3.SRC PROGRAMS

NOTE: All the source code for below questions are in this folder
1)Write a java program to implement the basic banking funcitons.

2)Write a program to calculate the total mark of student and sort it via bubble sort.

3)Find the common elements of the array.

4)Find the middle node of linked list.

5)Find the two digits in an array with maxsum of 25.

6)Write the java program to retrieve the customer details

7)Write a demo program to implement the interfaces in java.

8)Write a program to modify the salary of the employee.

9)Find the total number of words in a text file using fileinputoutput stream.

10)Write a program to get the food order details from an employee given his employee_id in an organization.

11)Write a demo program to implement a hash table in java.

12)Write a java program to book a hotel in a given location and the user should be able to set the minimum and maximum price for searching.

13)Write a java program to find the list of cities which starts with letter 'H' using java 8 features

14)Write a java program using java 8 features to find the squares of elements in a list

15)Find the unique words and count of unique words in a list using java 8 features.

16)Write a java program to find the account maintainance charge for the savings/current account.

17)Write a java program to filter the price of products above a certain amount.


4.TestNG
1)Employee(testngmain)-Create name,age,department for an employee using java and test using testing.

2)SalesMaterial,Main(TestNGmain)-Vishwasamudhra is a construction company.They need a software to develop the application for the sales team to communicate with the customers.
There are 2 types of category for price ranging with material 1 sq ft=2000/-,without material 900/-,these prices are for hyderabad location.
CITY                     PRICE WITH MATERIAL                   PRICE WITHOUT MATERIAL
Tvm                        1600                                   800
Chennai                    1800                                   1000
Mumbai                     2500                                   1200
Kochi                      1800                                   1200
When a customer type his city and square feet he need to get total amount for construction.write a java8 pgrm & implement the testNG for testing and write its SQ query.

5.Junit
1)App-Write a java pgrm to check whether a num is odd or even and do testing.

2)Countvowels-Write a java pgrm to count vowels of a given string and do testing.

3)Getgoldcoins-The employee who joined in the organization within 80 days will recieve 5 gold coins ,who joined in 172 days will recieve 3 gold coins,employee who joined in 266 days will receive 1 gold coin,after that will receive 0 coins.
write a test case.

4)Industry-Consider there is a textile industry.Mr kevin is the CEO of the industry.Mr sagar is the architecture for the organization.During the discussion abt company profit/loss tehy wanted to design an application.if they gave the date,it should display the total tshirt,garments,counts,time.
Implement with java8 or 7 or 17 with TDD approach.

5)RegDetails-Find the state and district of a reg vehicle and check whether vehicle no is in proper order like TS3223N where TS-Telengana state.

6)Wordcount-Count the no of times a particular word repeated on a list. 
