CREATE TABLE room(
  room_id BIGSERIAL PRIMARY KEY,
  name varchar(40),
  bed_info varchar(3),
  nights int,
  stay_start varchar(4)
);

CREATE TABLE cost(
  name varchar(40),
  bed_info varchar(3),
  stay_start varchar(4),
  price decimal(5, 2),
  retrieved_date timestamp 
);