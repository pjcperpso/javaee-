�������ű� 
ϰ�����û���ͱ�����������Ͳ��������
�������ϰ�����û��������Զ�
���������û���Ͳ���������Զ�
//�û���
create table s_user(name varchar2(20) primary key,passwd varchar2(20),age number(5),gender varchar2(15));
//���̱�
create table s_compete(name varchar2(30) primary key,diffc number(5),sort varchar(12),master varchar2(20));
insert into s_compete values('������',4,'������','��sir');
insert into s_compete values('C������սӪ',3,'������','��sir');
insert into s_compete values('��Ӣ���屭',4,'�Ŷ���','��ang');
insert into s_compete values('ħ������',5,'��Ŀ��','�����');

//��Ŀ��
create table s_title(id number(10) primary key,name varchar2(30),sort number(2),score number(5),time number(6));
insert into s_title values(1001,'HelloWord',6,10,3);
insert into s_title values(1002,'�ж��Ƿ����',6,10,3);
insert into s_title values(1003,'==����equals',6,10,3);
insert into s_title values(1004,'3n+1����',6,10,3);
insert into s_title values(1005,'9*9�˷���',6,10,3);
insert into s_title values(1006,'�ۼ����',6,10,3);
insert into s_title values(1007,'ˮ�ɻ�',6,10,3);
insert into s_title values(1008,'��������ô?',6,10,3);
insert into s_title values(1009,'�ж��ٸ�����?',6,10,3);
insert into s_title values(1010,'���󷢻�����־ΰ?',6,10,3);


insert into s_title values(2001,'this is simple',8,15,6);
insert into s_title values(2002,'Tree Traversals Again',8,15,6);
insert into s_title values(2003,'File Transfer',8,25,10);
insert into s_title values(2004,'Queueing at Bank',8,15,6);
insert into s_title values(2005,'����ָ��',8,20,8);
insert into s_title values(2006,'�ǲ���̫���� ',8,20,8);

//������ id/������/�������û���/��������ʵ����/���֤/����/�Ա�/ѧУ/����/�绰
create table s_sign(id number(6) primary key,c_name varchar2(30),u_name varchar2(20),name varchar2(20),shenfen varchar2(20),age number(5),gender varchar2(10),school varchar2(20),email varchar2(20),phone varchar2(11))


//����
create sequence sign_seq
	increment by 1
	start with 1;

//��Ϣ��(�����ۻظ���Ϣ ��idΪ1ʱΪ���۱�  ��idΪ2ʱΪ�ظ���    ǰ��û�����ۿ϶�û�лظ�)
create table s_message(firstname varchar2(20).secondname varchar2(20),tname varchar2(20),sortid number(6),message varchar2(200),nowdate date);


