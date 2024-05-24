CREATE TABLE roles(
	id BINARY(16) NOT NULL,
	role VARCHAR(45) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE INDEX name_unq (name ASC) VISIBLE);