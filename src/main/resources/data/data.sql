DROP TABLE IF EXISTS order;
create table ORDER
(
  ID        BIGINT not null,
  PRICE INTEGER not null,
  VOLUME   INTEGER  not null

  TNUMBER   INTEGER  not null
  PRIMARY KEY(ID);
);

insert into Bank_Account(ID, PRICE, VOLUME, TNUMBER) values (1, 1, 1000, 2);
insert into Bank_Account(ID, PRICE, VOLUME, TNUMBER) values (2, 1, 10001, 2);
