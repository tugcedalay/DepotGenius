CREATE TABLE users(
	id BINARY(16) NOT NULL,
	first_name VARCHAR(45) NOT NULL,
	last_name VARCHAR(45) NOT NULL,
	email VARCHAR(45) NOT NULL,
	password VARCHAR(200) NOT NULL,
	PRIMARY KEY (id));