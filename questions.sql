#create  database industry
#use industry
/*create table DepartmenT
  (
    department_id INT NOT NULL AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location VARCHAR(100),
    PRIMARY KEY (department_id)  
);*/
/*INSERT INTO Department
(department_id,department_name,manager_id ,location )
values (1,"CSE",4,"MUMBAI"),(2,"ME",6,"KOLKATA"),(3,"ES",7,"CHENNAI"),(4,"CE",8,"TVM"),(5,"EC",9,"PUNE");*/



/*CREATE TABLE Employee (
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
    FOREIGN KEY (department_id) REFERENCESpersonspersons Department(department_id)
);*/

/*insert into Employee
(employee_id,first_name ,last_name ,email ,phone ,hire_date ,job_title ,department_id ,salary )
values(555,"ram","raju","ram@gamil.com","9078565567",'2020-09-17',"manager",1,"100000"),
(667,"rani","ranu","rani@gamil.com","8078565567",'2022-04-18',"marketing",5,"1000000"),
(767,"manju","ramesh","manju@gamil.com","6078565567",'2019-09-22',"sales",3,"200000"),
(367,"Sunil","suresh","sunil02@gamil.com","6278565567",'2020-09-17"',"hr",2,200000),
(467,"megha","raman","megha@gamil.com","907856583",'2010-08-10',"hr",4,"800000");*/
#(557,"elsa","sumesh","elsa@gamil.com","9063565567",'2016-09-10',"hr",4,"300000");

#select * from employee;
#select upper(first_name) as Empname from employee;
#select count(*) from Employee where job_title="hr";
#select current_date() ;
#select substr(first_name,1,4) from employee;
#SELECT SUBSTRING_INDEX (location,'(',1) FROM department;

#create table db as select * from department;
#select * from db;
#CREATE TABLE new_table LIKE employee;
#INSERT INTO new_table SELECT * FROM employee;
#select * from new_table

#select count(*) from employee  where salary >50000 and salary<100000;
#SELECT * FROM employee WHERE first_name LIKE 'S%';
/*SELECT * FROM employee
LIMIT 5;*/
#select concat(first_name, ' ', last_name) as FullName from employee;
