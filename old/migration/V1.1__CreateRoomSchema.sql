CREATE TABLE ROOM(
  ROOM_ID BIGSERIAL PRIMARY KEY,
  NAME varchar(40),
  BED_INFO char(2),
  NIGHTS int,
  COST numeric(10,2),
  DATE_OF_STAY varchar(4)
);

CREATE TABLE HOTEL(
  NAME varchar(16),
  CONTACT_NUM varchar(10)
);