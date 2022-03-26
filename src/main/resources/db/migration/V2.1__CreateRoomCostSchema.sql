CREATE TABLE ROOM(
  room_id BIGSERIAL PRIMARY KEY,
  name varchar(40),
  bed_info varchar(2),
  nights int,
  stay_start varchar(4)
);

CREATE TABLE COST(
  name varchar(40),
  bed_info varchar(3),
  price decimal(5, 2),
  retrieved_date timestamp
)