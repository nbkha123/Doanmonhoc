begin
dbms_fga.add_policy(
    object_schema=>'hr',
    object_name=>'NHACUNGCAP',
    policy_name=>'fga_NHACUNGCAP',
    statement_types=>'select,insert,update,delete'
);
end;


begin
dbms_fga.add_policy(
    object_schema=>'hr',
    object_name=>'sanpham',
    policy_name=>'fga_sanpham',
    statement_types=>'select,insert,update,delete'
);
end;

begin
dbms_fga.add_policy(
    object_schema=>'hr',
    object_name=>'nhanvien',
    policy_name=>'fga_nhanvien',
    statement_types=>'select,insert,update,delete'
);
end;

begin
DBMS_FGA.add_POLICY(
    object_schema=>'hr',
    object_name=>'khachhang',
    policy_name=>'fga_khachhang',
    statement_types=>'select,insert,update,delete'
);
end;

begin
DBMS_FGA.add_POLICY(
    object_schema=>'hr',
    object_name=>'taikhoan',
    policy_name=>'fga_taikhoan',
   
    statement_types=>'select,insert,update,delete'
);
end;

/* Kiem tra policy*/
select * from dba_audit_policies;

/*Ho?t ??ng policy*/
select * from dba_fga_audit_trail;

/* -------------------------------------------- */
delete from dba_fga_audit_trail;

/* -------------------------------------------- */

select * from dba_users;

/* Tao ProFile */

CREATE PROFILE profile1 LIMIT  
FAILED_LOGIN_ATTEMPTS 3 
SESSIONS_PER_USER  UNLIMITED  
CPU_PER_SESSION  UNLIMITED  
CPU_PER_CALL  3000  
CONNECT_TIME  45  
IDLE_TIME   60 
LOGICAL_READS_PER_SESSION DEFAULT  
LOGICAL_READS_PER_CALL 1000;

/* Thay doi ProFile */

ALTER PROFILE profile1 LIMIT
FAILED_LOGIN_ATTEMPTS 3
PASSWORD_LIFE_TIME 30
PASSWORD_REUSE_TIME 30
PASSWORD_VERIFY_FUNCTION verify_function
PASSWORD_GRACE_TIME 5;

/* -------------------------------------------- */

CREATE PROFILE profile2 LIMIT
SESSIONS_PER_USER 2
CPU_PER_SESSION 10000
IDLE_TIME 60
CONNECT_TIME 480
FAILED_LOGIN_ATTEMPTS 5
PASSWORD_LIFE_TIME 60
PASSWORD_REUSE_TIME 30
PASSWORD_VERIFY_FUNCTION verify_function
PASSWORD_GRACE_TIME 7;

/* -------------------------------------------- */
/* Tao User */
CREATE USER userb IDENTIFIED BY abc; 
SELECT * FROM dba_users;
/* Thay doi  User */
drop user usera;
select USERNAME,PROFILE from dba_users where username='%SYS%';
ALTER USER USERA
PROFILE profile1;

/* Thong Tin  Profile */
SELECT DISTINCT profile,resource_name, limit FROM dba_profiles ;

/* Xoa Profile */
DROP PROFILE abc CASCADE;

/*Phan quyen */
desc DBA_SYS_PRIVS
SELECT * FROM DBA_SYS_PRIVS where grantee='USERA';
select *from dba_users;
desc DBA_SYS_PRIVS;
sELECT * FROM v$pwfile_users;
select * from dba_directories;
SELECT * FROM session_privs;
SELECT * FROM session_privs;
SELECT * FROM dba_tab_privs WHERE OWNER=’USERA’;
GRANT CREATE SESSION TO USERA;
GRANT select ON ABC TO hr;
select * from dba_roles;
desc dba_roles;
select * from dba_roles;
desc dba_roles;
REVOKE CREATE SESSION FROM USERA;
SELECT CURRENT_DATE
FROM DUAL;
create role abc;
drop role abc;
SELECT * FROM user_tab_privs_recd;
SELECT ROLE,PRIVILEGE FROM role_sys_privs;
desc role_sys_privs
select * FROM V$DATABASE;