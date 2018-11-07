//铁路局表     主键为铁路局id   如SY_001(沈铁)
create table train_company(
id varchar(10) constraint tc_id_pk primary key,
name varchar(15) constraint tc_name_nn not null,
sum number(6) constraint tc_sum_nn not null
);
//铁路办事处
/*
 * 未添加
 * **/
//铁路线路表     主键为线路名称    如t1815 
create table train_rote(
	name varchar(8) constraint tr_name_pk primary key,
	start_add varchar(15) constraint tr_kadd_nn not null,
	stop_add varchar(15) constraint tr_jadd_nn not null,
	start_time date constraint tr_ktime_nn not null,
	stop_time date constraint tr_jtime_nn not null,
	tc_id varchar(10) references train_company(id)
);


//中转站表
create table train_midstation(
	name varchar(15) constraint tm_name_nn not null,
	reach_time date,
	start_time date,
	stay_time number(5),
	tr_name varchar(8) references train_rote(name)
);

//火车票表




//insert into train_company values('SY_001','沈铁局',100);
//insert into train_rote values('T10','沈阳','通辽',to_date('2018-10-01 22:55','yyyy-mm-dd hh24:mi'),to_date('2018-10-02 02:25','yyyy-mm-dd hh24:mi')
,'SY_001');