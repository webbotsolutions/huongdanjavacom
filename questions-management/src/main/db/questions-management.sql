CREATE TABLE `category` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`id`)
);
CREATE TABLE `question` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`description` TEXT NOT NULL,
	`category_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);
CREATE TABLE `option` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`description` TEXT NOT NULL,
	`note` TEXT,
	`question_id` INT NOT NULL,
	`correct` TINYINT(1) NOT NULL,
	PRIMARY KEY (`id`)
);
CREATE TABLE `user` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(45) NOT NULL,
	`password` VARCHAR(32) NOT NULL,
	PRIMARY KEY (`id`)
);
INSERT INTO category SET name='OCA';