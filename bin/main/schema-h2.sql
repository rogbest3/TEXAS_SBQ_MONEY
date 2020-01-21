CREATE TABLE CUSTOMER
(
  CNO       INT             NOT NULL AUTO_INCREMENT  COMMENT '고객번호',
  CEMAIL    VARCHAR(20)    NOT NULL                   COMMENT '이메일',
  CPWD        VARCHAR(80)    NOT NULL                    COMMENT '비밀번호',
  CNAME     VARCHAR(15)    NULL                        COMMENT '고객이름',
  CNTCD                VARCHAR(10) NULL                       COMMENT '국가코드',
  CSTCD     VARCHAR(10)    NULL                        COMMENT '고객상태코드',
  CPHONE   VARCHAR(15)    NULL                        COMMENT '폰번호',
  SDATE     DATE           NULL                      COMMENT '가입일',
  WDATE     DATE           NULL                      COMMENT '탈퇴일',
  UDATE     DATE           NULL                       COMMENT '수정일자',
  SALT     VARCHAR(80)           NULL                       COMMENT '비밀번호 암호화',
  PRIMARY KEY (CNO)
);