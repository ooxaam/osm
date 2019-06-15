CREATE TABLE CATEGORY
(
  ID                          NUMBER(20)        NOT NULL AUTO_INCREMENT,
  TITLE                       VARCHAR2(100 CHAR) NOT NULL,
  ACTIVE					  VARCHAR2(1 CHAR) NOT NULL
);

CREATE TABLE CUSTOMER
(
  ID                          NUMBER(20)        NOT NULL AUTO_INCREMENT,
  NAME                        VARCHAR2(100 CHAR) NOT NULL,
  PH_NUMBER                   VARCHAR2(100 CHAR) NOT NULL,
  ADDRESS                     VARCHAR2(500 CHAR),
  TOTAL_SALE				  NUMBER(20),
  CREATION_DATE				  TIMESTAMP(6)	
);

CREATE TABLE DISH
(
  ID                          NUMBER(20)        NOT NULL AUTO_INCREMENT,
  TITLE                       VARCHAR2(100 CHAR) NOT NULL,
  CATEGORY_ID				  NUMBER(20)        NOT NULL,
  UNIT_PRICE				  NUMBER(20)        NOT NULL,
  QUANTITY_PER_UNIT           VARCHAR2(100 CHAR) NOT NULL,
  UNIT_ID					  NUMBER(20)        NOT NULL,
  DESCRIPTION				  VARCHAR2(1000 CHAR) NOT NULL,
  ACTIVE					  VARCHAR2(1 CHAR) NOT NULL
);

CREATE TABLE ORDER_DETAIL
(
  ID                          NUMBER(20)        NOT NULL AUTO_INCREMENT,
  ORDER_ID					  NUMBER(20)		NOT NULL,
  DISH_ID				  	  NUMBER(20)		NOT NULL,
  QUANTITY				      NUMBER(20)		NOT NULL,
  SUB_TOTAL				      NUMBER(20)		NOT NULL
);

CREATE TABLE ORDERS
(
  ID                          NUMBER(20)        		NOT NULL AUTO_INCREMENT,
  TOTAL_BILL				  NUMBER(20) DEFAULT 0		NOT NULL,
  CUSTOMER_ID				  NUMBER(20)				NOT NULL,
  DELIVERY_TIME				  TIMESTAMP(6),
  REMARKS					  VARCHAR2(500),
  CUSTOMER_RATING			  NUMBER(1),	
  ORDER_DATE				  TIMESTAMP(6)	
);

CREATE TABLE UNIT
(
  ID                          NUMBER(20)        NOT NULL AUTO_INCREMENT,
  TITLE                       VARCHAR2(100 CHAR) NOT NULL
);

ALTER TABLE UNIT ADD CONSTRAINT UNIT_PK1 PRIMARY KEY (ID);

ALTER TABLE ORDERS ADD CONSTRAINT ORDERS_PK1 PRIMARY KEY (ID);
ALTER TABLE ORDERS ADD CONSTRAINT ORDERS_FK1 FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID);

ALTER TABLE ORDER_DETAIL ADD CONSTRAINT ORDER_DETAIL_PK1 PRIMARY KEY (ID);
ALTER TABLE ORDER_DETAIL ADD CONSTRAINT ORDER_DETAIL_FK1 FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ID);
ALTER TABLE ORDER_DETAIL ADD CONSTRAINT ORDER_DETAIL_FK2 FOREIGN KEY (DISH_ID) REFERENCES DISH(ID);

ALTER TABLE DISH ADD CONSTRAINT DISH_PK1 PRIMARY KEY (ID);
ALTER TABLE DISH ADD CONSTRAINT DISH_FK1 FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY(ID);
ALTER TABLE DISH ADD CONSTRAINT DISH_FK2 FOREIGN KEY (UNIT_ID) REFERENCES UNIT(ID);

ALTER TABLE CUSTOMER ADD CONSTRAINT CUSTOMER_PK1 PRIMARY KEY (ID, PH_NUMBER);

ALTER TABLE CATEGORY ADD CONSTRAINT CATEGORY_PK1 PRIMARY KEY (ID);