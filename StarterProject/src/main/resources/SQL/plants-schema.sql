drop table if exists `plants` CASCADE; 
create table 
	`plants` 
(
	id integer AUTO_INCREMENT, 
	name varchar(255), 
	ageInYears integer not null, 
	hasBugs varchar(255), 
	primary key (id)
);