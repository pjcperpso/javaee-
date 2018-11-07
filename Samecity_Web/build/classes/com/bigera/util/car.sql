/*
 * 车行信息表
 * */
create table car_company(
	id varchar2(10) constraint cc_id_pk primary key,
	name varchar2(15) constraint cc_name_nn not null,
	city varchar2(15) constraint cc_city_nn not null
);


/*
 * 车辆信息表
 * */
create table car(
	id varchar2(12) constraint c_id_pk primary key,
	name varchar2(10) constraint c_name_nn not null,
	pro_date date,
	price number(5),
	orsell char(5),
	cc_id varchar2(10) references car_company(id)
);


//
insert into car_company values('GZ_001','国荣车行','广州');
insert into car values('粤A-5888','奥迪Audi',to_date('2017-02-03','yyyy-mm-dd'),400,'是','GZ_001')
