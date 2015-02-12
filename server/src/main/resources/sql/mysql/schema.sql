drop table if exists edu_task;
drop table if exists edu_user;
drop table if exists hk_dictionaries;

create table edu_task (
	id bigint auto_increment,
	title varchar(128) not null,
	description varchar(255),
	user_id bigint not null,
    primary key (id)
) engine=InnoDB;

create table edu_user (
	id bigint auto_increment,
	login_name varchar(64) not null unique,
	name varchar(64) not null,
	password varchar(255) not null,
	salt varchar(64) not null,
	roles varchar(255) not null,
	register_date timestamp not null default 0,
	primary key (id)
) engine=InnoDB;

create table hk_dictionaries (
	id int(11) NOT NULL AUTO_INCREMENT,
	class_name varchar(255) not null unique,
	class_key varchar(64) not null,
	seq int(11) DEFAULT NULL,
	dict_value varchar(64) not null,
	primary key (id),
	INDEX `idx_dict_class` (`class_name`)
) engine=InnoDB;
