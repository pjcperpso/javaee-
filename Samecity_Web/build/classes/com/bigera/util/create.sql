create table sp_user(
	id number(7) constraint spu_id_pk primary key,
	name varchar2(15) constraint spu_name_nn not null,
	passwd varchar2(15) constraint spu_psw_nn not null,
	age number(5) constraint spu_age_nn not null,
	gender varchar2(10) constraint spu_gender_ck check(gender in('ÄĞ','Å®')),
	hobby varchar2(20)
);

create sequence spu_id
increment by 1
start with 1;