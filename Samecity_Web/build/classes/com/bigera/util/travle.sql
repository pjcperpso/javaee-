create table travle_company(
	id varchar2(10) constraint tvc_id_pk primary key,
	name varchar2(15) constraint tvc_name_nn not null,
	phone varchar2(11) constraint tvc_phone_nn not null,
	data varchar2(10)
);


create table travle_rote(
	id varchar2(10) constraint tvr_id_pk primary key,
	name varchar2(15) constraint tvr_name_nn not null,
	sort number(2),
	sort_A varchar2(15),
	sort_B varchar2(15),
	sort_C varchar2(15),
	tc_id varchar2(10) references travle_company(id)
);

create table travle_start(
	name varchar(10) constraint tvs_name_nn not null,
	price number(6) constraint tvs_price_nn not null,
	tr_id varchar2(10) references travle_rote(id)
)




//插入语句测试
insert into travle_company values('L-AJ1002','北京国旅','0771-58542','8:00~20:00');
insert into travle_company values('ZY-007','老乡自营','老乡官方电话');

insert into travle_rote values('178925666','北京4/5游',2,'A:全程高铁','B:星级酒店','','L-AJ1002');
insert into travle_rote values('168752100','欧洲10/11游',3,'A:广州出发','B:北京出发','C:一日游轮','ZY-007');


insert into travle_start values('北京','2800.0','178925666');
insert into travle_start values('南京','3180.0','178925666');
insert into travle_start values('苏州','3200.0','178925666');
insert into travle_start values('上海','3000.0','178925666');
insert into travle_start values('杭州','3300.0','178925666');
insert into travle_start values('无锡','3250.0','178925666');
insert into travle_start values('广州','3320.0','178925666');
insert into travle_start values('深圳','3350.0','178925666');