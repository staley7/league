CREATE  TABLE IF NOT EXISTS members(
	member_id INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	nickname VARCHAR(100),
	user_name VARCHAR(100) NOT NULL,
	active Boolean NOT NULL,
	leage_wins INT,
	event_wins INT,
	season_active INT,
	create_time DATETIME NOT NULL,
	CONSTRAINT members_pk PRIMARY KEY (member_id)
);