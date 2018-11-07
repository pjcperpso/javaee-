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




//����������
insert into travle_company values('L-AJ1002','��������','0771-58542','8:00~20:00');
insert into travle_company values('ZY-007','������Ӫ','����ٷ��绰');

insert into travle_rote values('178925666','����4/5��',2,'A:ȫ�̸���','B:�Ǽ��Ƶ�','','L-AJ1002');
insert into travle_rote values('168752100','ŷ��10/11��',3,'A:���ݳ���','B:��������','C:һ������','ZY-007');


insert into travle_start values('����','2800.0','178925666');
insert into travle_start values('�Ͼ�','3180.0','178925666');
insert into travle_start values('����','3200.0','178925666');
insert into travle_start values('�Ϻ�','3000.0','178925666');
insert into travle_start values('����','3300.0','178925666');
insert into travle_start values('����','3250.0','178925666');
insert into travle_start values('����','3320.0','178925666');
insert into travle_start values('����','3350.0','178925666');