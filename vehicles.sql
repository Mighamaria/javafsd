#create database Vehicle
#use vehicle
/*create table Rentals
(
rental_id varchar(10) ,
customer_id varchar(10) ,
car_id varchar(10),
pickup_date Date Null,
return_date Date NUll,
km_driven INT NULL,
fare_amount double(10,2) null,
primary key(rental_id),
foreign key(customer_id) REFERENCES Customers(customer_id),
foreign key(car_id) REFERENCES Cars(car_id)
);*/
#SET SQL_SAFE_UPDATES=0;
#SET GLOBAL FOREIGN_KEY_CHECKS=0;

/*create table Customers
(
customer_id varchar(10) ,
customer_name varchar(20),
address varchar(20),
phone_no bigint,
email varchar(20),
primary key(customer_id)
);*/

/*create table Owners
(
owner_id varchar(10) ,
owner_name varchar(20),
address varchar(20),
phone_no bigint,
email varchar(20),
primary key(owner_id)
);*/
/*create table Cars
(
car_id varchar(10) ,
car_name varchar(20) null,
car_type varchar(20) null,
owner_id varchar(10) null,
primary key(car_id),
foreign key(owner_id) REFERENCES Owners(owner_id)
);*/

#select * from customers;
#select * from cars;
#select * from owners;
#select * from rentals;

insert into Owners
(owner_id,owner_name ,address,phone_no,email)
values("O001","Anu","Kottayam",7890668899,"anu@gmail.com"),
("O002","Ajith","TVM",8890668899,"ajith@gmail.com"),
("O003","Ram","EKM",6890668899,"ram09@gmail.com"),
("O004","Rajith","TN",9890668899,"anu@gmail.com"),
("O005","Ramesh","KN",9080668899,"ramesh88@gmail.com"),
("O006","Allu","Kollam",8590668899,"allu@gmail.com");


insert into customers
values("C001","Anusha","Chengannur",9032541845,"anu@gmail.com"),
("C007","Annu","Kottayam",6765230098,"annu@gmail.com"),
("C004","Malu","Pathanamthitta",7346281098,"malu@gmail.com"),
("C008","Fayas","Thrissur",9523991678,"fayas@gmail.com"),
("C003","Sunil","Ernakulam",7945632711,"sunil@gmail.com"),
("C005","Kajal","Paravur",9996123677,"kajal@gmail.com");
INSERT INTO Cars
(car_id,car_name,car_type,owner_id)
values("V001","Innova","XL","O001"),
("V002","Volvo","GO","O002"),
("V003","Swift Deluxe","GO","O003"),
("V004","SUV","X4","O004"),
("V005","Nexo","X5","O005"),
("V006","Swift","X6","O005");


insert into Rentals
(rental_id,customer_id ,car_id,pickup_date,return_date,km_driven,fare_amount )
values
("R001","C007","V004",'2018-03-10','2018-03-10',800,9000),
("R002","C001","V007",'2018-03-11','2018-03-12',200,3000),
("R003","C007","V003",'2018-04-15','2018-04-15',100,1500),
("R004","C007","V001",'2018-05-16','2018-05-18',1000,10000),
("R005","C004","V005",'2018-05-10','2018-05-12',900,11000),
("R006","C004","V006",'2018-05-20','2018-05-21',200,2500);

select car_id,car_type from cars where pickup_date=0000-00-00