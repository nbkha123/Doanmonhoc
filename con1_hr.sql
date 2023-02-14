CREATE TABLE NHACUNGCAP
(
	MANCC CHAR(10) NOT NULL,
	TENNCC VARCHAR2(50),
	SDT CHAR(10),
	EMAIL VARCHAR(50),
	GHICHU VARCHAR2(50),
    PRIMARY KEY (MANCC)
);

CREATE TABLE SANPHAM
(
	MASP CHAR(10) NOT NULL,
	TENSP VARCHAR2(50),
	DVT VARCHAR2(10),
	SOLUONGTON INT,
	DONGIABAN NUMBER,
	DONGIAMUA NUMBER,
	MANCC CHAR(10),
    LOAISANPHAM VARCHAR2(50),
    PRIMARY KEY (MASP),
	CONSTRAINT FK_SP_NCC FOREIGN KEY (MANCC) REFERENCES NHACUNGCAP(MANCC)
);

CREATE TABLE NHANVIEN
(
	MANV CHAR(10) NOT NULL,
	TENNV VARCHAR2(50) NOT NULL,
    GIOITINH VARCHAR2(5),
    NGAYSINH DATE,
	SDT CHAR(10),
    EMAIL VARCHAR(50),
    PRIMARY KEY (TENNV)
);

CREATE TABLE TAIKHOAN
(
    USERNAME VARCHAR(20) NOT NULL,
    TENNV VARCHAR2(50) NOT NULL,
    PASS VARCHAR(50),
    PRIMARY KEY (USERNAME)
);

CREATE TABLE KHACHHANG
(
    MAKH CHAR(10) NOT NULL,
    TENKH VARCHAR2(50) NOT NULL,
    GIOITINH VARCHAR2(5),
    NGAYSINH DATE,
    SDT CHAR(10),
    PRIMARY KEY (MAKH)
);

CREATE TABLE HOADON 
(
    MAHD NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 MAXVALUE 999 MINVALUE 1 NOT NULL ,
    NGAYTAOHD DATE,
    TONGTIEN NUMBER,
    PRIMARY KEY(MAHD)
);

CREATE TABLE CHITIETHD 
(
    MAHD NUMBER NOT NULL,
    MASP CHAR(10) NOT NULL,
    TENSP VARCHAR2(50),
    SOLUONG NUMBER,
    DONGIA NUMBER,
    THANHTIEN NUMBER,
    PRIMARY KEY(MAHD,MASP),
    CONSTRAINT FK_CTHD_HD FOREIGN KEY("MAHD") REFERENCES HOADON("MAHD"),
    CONSTRAINT FK_CTHD_SP FOREIGN KEY("MASP") REFERENCES SANPHAM("MASP")  
);


ALTER TABLE SANPHAM
ADD CONSTRAINT CHK_SP CHECK ( SOLUONGTON >0 );
ALTER TABLE SANPHAM
ADD CONSTRAINT CHK_DGB CHECK ( DONGIABAN >0 );
ALTER TABLE SANPHAM
ADD CONSTRAINT CHK_DGM CHECK ( DONGIAMUA >0 );
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHK_GT CHECK(GIOITINH='Nam' or GIOITINH='N?');
ALTER TABLE KHACHHANG
ADD CONSTRAINT CHK_GTKH CHECK(GIOITINH='Nam' or GIOITINH='N?');


INSERT INTO NHACUNGCAP
VALUES('NCC01','IPHONE','0987654321','iphonene@gmail.com','Hãng ?i?n tho?i IPhone');
INSERT INTO NHACUNGCAP
VALUES('NCC02','SAMSUNG','0137654322','samsungne@gmail.com','Hãng ?i?n tho?i SamSung');
INSERT INTO NHACUNGCAP
VALUES('NCC03','ASUS','0256784321','asusne@gmail.com','Hãng ?i?n tho?i ASUS');
INSERT INTO NHACUNGCAP
VALUES('NCC04','OPPO','0234567866','oppone@gmail.com','Hãng ?i?n tho?i OPPO');

INSERT INTO SANPHAM
VALUES('SP01','12 PRO MAX','Chi?c',15,30000000,26000000,'NCC01','?i?n tho?i');
INSERT INTO SANPHAM
VALUES('SP02','NOTE 10','Chi?c',25,12000000,9500000,'NCC02','?i?n tho?i');
INSERT INTO SANPHAM
VALUES('SP03','GALAXY A52','Chi?c',40,9500000,8000000,'NCC02','?i?n tho?i');
INSERT INTO SANPHAM
VALUES('SP04','MAX PRO M2','Chi?c',20,4000000,3300000,'NCC03','?i?n tho?i');
INSERT INTO SANPHAM
VALUES('SP05','F9','Chi?c',10,6000000,5000000,'NCC04','?i?n tho?i');

INSERT INTO NHANVIEN
VALUES('NV01','Nguyen Van A','Nam',to_date('05/10/2001','dd/mm/yyyy'),'0123456780','nguyenvana@gmail.com');
INSERT INTO NHANVIEN
VALUES('NV02','Nguyen Thi B','N?',to_date('01/10/2001','dd/mm/yyyy'),'0123456799','nguyenthib@gmail.com');
INSERT INTO NHANVIEN
VALUES('NV06','Nguyen Van C','Nam',to_date('01/07/2000','dd/mm/yyyy'),'0123456708','nguyenvanc@gmail.com');


INSERT INTO KHACHHANG
VALUES('KH01','Nguyen Bao D','Nam',to_date('05/05/1999','dd/mm/yyyy'),'0123456534');
INSERT INTO KHACHHANG
VALUES('KH02','Nguyen Van V','Nam',to_date('09/01/2001','dd/mm/yyyy'),'0912374565');
INSERT INTO KHACHHANG
VALUES('kh03','Doan Thi Thu H','N?',to_date('02/11/2000','dd/mm/yyyy'),'0943334565');

INSERT INTO TAIKHOAN
VALUES('Admin','Nguyen Van A','123');
INSERT INTO TAIKHOAN
VALUES('Kha','Nguyen Bao Kha','123');
INSERT INTO TAIKHOAN
VALUES('Ha','Doan Thi Thu Ha','123');

/*-------------------------Tim Tat ca san pham-----------------------------*/
select * from sanpham;

/*-------------------------Tim tat ca san pham co dongiaban giam dan---------------------*/
select * from sanpham order by dongiaban desc;

/*----------------------Tim san pham co ma ncc='NCC01'-----------------------*/
select * from sanpham where mancc='NCC01';

/*---------------------------Tim san pham co mancc='NCC01' va 'NCC02'----------------------*/
select * from sanpham s,nhacungcap n where S.Mancc=N.Mancc and n.mancc in (
      select mancc from nhacungcap where mancc='NCC01' or mancc='NCC02');
      
/*-----------------------Xem Tuoi Cua cac nhan vien lon hon nhan vien 02 -----------------------------*/
select manv,extract(year from sysdate)-extract(year from ngaysinh) tuoi
from nhanvien 
where extract(year from sysdate)-extract(year from ngaysinh)>(select extract(year from sysdate)-extract(year from ngaysinh) 
                                                                  from nhanvien
                                                                  where manv='NV02');

/*-------------------------------Loai gia-------------------------------------*/      
select masp,tensp,dongiaban,case  
when dongiaban>=50000000 then 'Gia cao'
when dongiaban>=30000000 then 'gia trung binh'
when dongiaban>=10000000 then 'gia thap'
end as LoaiGia
from sanpham;

/*-------------------------------Xem Gia cua san pham-------------------------------------*/
create  PROCEDURE PROC1 (masps in char, giaban out number) is
BEGIN
      SELECT s.DONGIABAN INTO giaban 
      FROM SANPHAM s
      WHERE s.masp = masps;
END;


DECLARE 
GIABAN NUMBER;
BEGIN 
PROC1('SP01',GIABAN);
Dbms_Output.Put_Line('gia ban : '||GIABAN);
End;

set serveroutput on;

/*-------------------------------Xem tuoi nhan vien-------------------------------------*/
create  PROCEDURE PROC2 (manvv in char,tuoi out number) is
BEGIN
      SELECT extract(year from sysdate)-extract(year from n.ngaysinh) INTO tuoi 
      FROM NHANVIEN N
      WHERE n.manv =manvv;         
END;

DECLARE 
tuoi NUMBER;
BEGIN 
PROC2('NV01',tuoi);
Dbms_Output.Put_Line('Tuoi Cua NV Ban Vua Nhap La : '||tuoi);
End;

/*-------------------------------FUNCTION-------------------------------------*/
/*--------------------Giam Gia San Pham--------------*/

CREATE OR REPLACE FUNCTION FUN1(giaban in number)    
RETURN number    
IS 
BEGIN  
    return giaban*0.5;
END FUN1;

select masp,tensp,DONGIABAN,fun1(DONGIABAN) giamgia from sanpham;
/*--------------------dem so luong nhan vien --------------*/

CREATE OR REPLACE FUNCTION Fun2  
RETURN number IS 
   dem number(2) := 0;  
BEGIN 
   SELECT count(*) into dem  
   FROM nhanvien;  
    RETURN dem;  
END;

declare
dem number(2);
begin
dem:=fun2();
Dbms_Output.Put_Line('So luong nhan vien : '||dem);
end;

/*-------------------------------CURSOR-------------------------------------*/
DECLARE
CURSOR CAU1 IS
SELECT MASP,TENSP FROM SANPHAM WHERE MANCC='NCC03';
MASPP VARCHAR(50);
TENSPP VARCHAR2(50);
BEGIN
  OPEN CAU1;
  WHILE CAU1%FOUND
  LOOP
    FETCH CAU1 INTO MASPP, TENSPP;  
    DBMS_OUTPUT.PUT_LINE(MASPP ||'  '|| TENSPP);
  END LOOP;
  CLOSE CAU1;
END;

/*-------------------------------TRIGGER 1-------------------------------------*/
create or replace Trigger XOAHD
After Delete 
On Hoadon 
For Each Row
declare
  mahdd number;
BEGIN
  select :OLD.MAHD into mahdd from dual;
  delete from chitiethd where mahd=mahdd;
END;


/*-------------------------------TRIGGER 2-------------------------------------*/
create or replace Trigger ThemTINHTRANG
After Insert 
On sanpham 
For Each Row
DECLARE 
  MASPP CHAR(20);
BEGIN
  SELECT :NEW.MASP INTO MASPP FROM DUAL;
  INSERT INTO TINHTRANGSP VALUES(MASPP,0);
END;

select * from sanpham
INSERT INTO SANPHAM
VALUES('SP06','WAVE ALPHA','CHIEC',25,17000000,14000000,'NCC01','ABC');

select * from chitiethd;
