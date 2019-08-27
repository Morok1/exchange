DROP TABLE IF EXISTS ORDERR;
create table ORDERR(
  ID  BIGINT not null PRIMARY KEY,
  PRICE DECIMAL not null,
  VOLUME   INTEGER  not null,
  TNUMBER   INTEGER  not null
);

insert into Bank_Account values (ID, PRICE, VOLUME, TNUMBER) values (1, 1, 1000, 2);
insert into Bank_Account values (ID, PRICE, VOLUME, TNUMBER) values (2, 1, 10001, 2);
