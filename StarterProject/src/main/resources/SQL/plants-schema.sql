drop table if exists `plants` CASCADE; 
create table 
	`plants` 
(
	id integer AUTO_INCREMENT, 
	name VARCHAR(255), 
	ageInYears integer NOT NULL, 
	hasBugs boolean NOT NULL, 
	primary key (id)
);