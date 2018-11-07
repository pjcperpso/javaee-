共有两张表 
习题表和用户表和报名表和浏览表和参赛种类表
浏览表是习题表和用户表关联多对多
报名表是用户表和参赛种类表多对多
//用户表
create table s_user(name varchar2(20) primary key,passwd varchar2(20),age number(5),gender varchar2(15));
//赛程表
create table s_compete(name varchar2(30) primary key,diffc number(5),sort varchar(12),master varchar2(20));
insert into s_compete values('天梯赛',4,'个人赛','陈sir');
insert into s_compete values('C语言挑战营',3,'个人赛','曲sir');
insert into s_compete values('精英团体杯',4,'团队赛','李ang');
insert into s_compete values('魔鬼爬坡',5,'项目赛','李洛克');

//题目表
create table s_title(id number(10) primary key,name varchar2(30),sort number(2),score number(5),time number(6));
insert into s_title values(1001,'HelloWord',6,10,3);
insert into s_title values(1002,'判断是否相等',6,10,3);
insert into s_title values(1003,'==遇见equals',6,10,3);
insert into s_title values(1004,'3n+1猜想',6,10,3);
insert into s_title values(1005,'9*9乘法表',6,10,3);
insert into s_title values(1006,'累加求和',6,10,3);
insert into s_title values(1007,'水仙花',6,10,3);
insert into s_title values(1008,'这是质数么?',6,10,3);
insert into s_title values(1009,'有多少个质数?',6,10,3);
insert into s_title values(1010,'周润发还是曾志伟?',6,10,3);


insert into s_title values(2001,'this is simple',8,15,6);
insert into s_title values(2002,'Tree Traversals Again',8,15,6);
insert into s_title values(2003,'File Transfer',8,25,10);
insert into s_title values(2004,'Queueing at Bank',8,15,6);
insert into s_title values(2005,'计算指数',8,20,8);
insert into s_title values(2006,'是不是太胖了 ',8,20,8);

//报名表 id/赛事名/参赛人用户名/参赛人真实姓名/身份证/年龄/性别/学校/邮箱/电话
create table s_sign(id number(6) primary key,c_name varchar2(30),u_name varchar2(20),name varchar2(20),shenfen varchar2(20),age number(5),gender varchar2(10),school varchar2(20),email varchar2(20),phone varchar2(11))


//序列
create sequence sign_seq
	increment by 1
	start with 1;

//消息表(含评论回复消息 当id为1时为评论表  当id为2时为回复表    前提没有评论肯定没有回复)
create table s_message(firstname varchar2(20).secondname varchar2(20),tname varchar2(20),sortid number(6),message varchar2(200),nowdate date);


