#1
select car_id,car_name,car_type from cars where  car_id not in (select car_id from rentals) order by car_id;

#2
select car_id,car_name,owner_id from cars  where car_type in ('XL','GO') order by car_id;

#3
alter table cars
add column car_regno varchar(10);
select * from cars;

#4
select car_id,car_name,car_type from cars where car_name="SUV" and car_type="X4" order by car_id ;

#5
select distinct o.owner_id,o.owner_name,o.address,o.phone_no from owners o join cars c on o.owner_id=c.owner_id
where c.car_name like "swift%" order by o.owner_id;

#6
select rental_id,customer_id,car_id,km_driven from rentals
where pickup_date between '2002-09-12' and '2013-07-15' order by rental_id;

#7
select distinct car_id,count(car_id) as count from rentals
group by car_id ORDER BY car_id asc;