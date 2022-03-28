CREATE SEQUENCE vt_room_seq start with 1000;
CREATE SEQUENCE vt_gas_seq start with 1000;
CREATE TABLE room(
  -- room_id BIGSERIAL PRIMARY KEY,
  room_id bigint PRIMARY KEY DEFAULT nextval('vt_room_seq'),
  name varchar(40),
  bed_info varchar(3),
  nights int,
  stay_start varchar(4)
);

CREATE TABLE cost(
  name varchar(40),
  street varchar(40),
  bed_info varchar(3),
  stay_start varchar(4),
  price decimal(5, 2),
  retrieved_date timestamp 
);


CREATE TABLE station (
  gas_id bigint PRIMARY KEY DEFAULT nextval('vt_gas_seq'),
  name varchar(40),
  street varchar(40)
)