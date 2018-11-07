create table hotel(
	id varchar2(10) constraint h_id_pk primary key,
	name varchar2(25) constraint h_name_nn not null,
	roomnum number(3) constraint h_rn_nn not null,
	isparking char(5),
	start_date date constraint h_sd_nn not null,
	city varchar2(15) constraint h_city_nn not null
);


create table room(
	id number(10),
	name varchar2(15),
	price number(10) constraint r_p_nn not null,
	iswindow char(5),
	isbedroom char(5),
	isairc char(5),
	isnull char(5) constraint r_in_nn not null,
	bednum number(3),
	c_id varchar2(10) not null references hotel(id)
);

insert into hotel values('GT-001','国泰大酒店',20,'有',sysdate,'通辽');

insert into room values(101,'单人间',100,'有','有','有','是',1,'GT-002');
insert into room values(102,'单人间',100,'有','有','有','是',1,'GT-002');
insert into room values(203,'双人间',140,'有','无','有','是',2,'GT-002');
insert into room values(204,'双人间',160,'有','有','有','是',2,'GT-002');
insert into room values(201,'双人间',160,'有','有','有','是',2,'GT-002');
insert into room values(202,'双人间',160,'有','有','有','是',2,'GT-002');
insert into room values(205,'双人间',160,'有','有','有','是',2,'GT-002');
insert into room values(206,'双人间',160,'有','有','有','是',2,'GT-002');
insert into room values(301,'家庭房',220,'有','有','有','是',2,'GT-002');
insert into room values(302,'家庭房',220,'有','有','有','是',2,'GT-002');