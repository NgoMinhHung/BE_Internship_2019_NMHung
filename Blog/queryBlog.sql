CREATE DATABASE Blog;
CREATE TABLE IF NOT EXISTS `posts` (
    `post_id` INT AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL,
    `content` TEXT,
    `tags` VARCHAR(255),
    `status` TINYINT NOT NULL,
    `create_time` DATETIME,
    `update_time` DATETIME,
    `author_id` INT,
    PRIMARY KEY (`post_id`)
);
CREATE TABLE IF NOT EXISTS `users` (
    `user_id` INT AUTO_INCREMENT,
    `username` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `email` TEXT,
    `profile` BLOB,
    PRIMARY KEY (`user_id`)
);
CREATE TABLE IF NOT EXISTS `comments` (
    `comment_id` INT AUTO_INCREMENT,
    `content` TEXT,
    `status` TINYINT NOT NULL,
    `author` TEXT,
    `email` TEXT,
    `url` TEXT,
    `post_id` INT NOT NULL,
    PRIMARY KEY (`comment_id`)
)

