//table one:航空公司表  
create table air_company(id varchar2(10) constraint ac_id_pk primary key,
	ac_name varchar2(15) constraint ac_name_nn not null,
	ac_sum number(10) constraint ac_sum_nn not null
) ;

//table two:航班表
create table air_port(id varchar2(10) constraint ap_id_pk primary key,
	start_add varchar2(15) constraint ap_starta_nn not null,
	stop_add varchar2(15) constraint ap_stopa_nn not null,
	among_add varchar2(15), 
	start_time date constraint ap_startt_nn not null,
	stop_time date constraint ap_stopt_nn not null,
	food varchar2(5),
	ac_id varchar2(10) not null references air_company(id)
);


//table three:机票表
create table air_ticket(id number(10) constraint at_id_pk primary key,
	name varchar2(15) constraint at_name_nn not null,
	price number(8) constraint at_pri_nn not null,
	surplus number(4) constraint at_surn_nn not null,
	ap_id varchar2(10) references air_port(id)
);

create sequence at_id
increment by 1
start with 1;
