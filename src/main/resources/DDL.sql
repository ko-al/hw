create table PERSON
(
    ID NUMBER not null
        constraint PERSON_PK
            primary key,
    PERSON_NAME VARCHAR2(15),
    AGE NUMBER
);

create table ORDERS
(
    ORDER_ID NUMBER not null
        constraint ORDERS_PK
            primary key,
    PERSON_ID NUMBER,
    STATUS VARCHAR2(30)
);

alter table ORDERS add constraint ORDERS_FK foreign key (PERSON_ID) references PERSON (ID);

