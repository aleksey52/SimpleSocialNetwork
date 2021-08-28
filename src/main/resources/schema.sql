DROP TABLE IF EXISTS User;
CREATE TABLE User(
                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                     user_name VARCHAR(255) NOT NULL,
                     password VARCHAR(255) NOT NULL,
                     first_name VARCHAR(255) NOT NULL,
                     middle_name VARCHAR(255) NOT NULL,
                     last_name VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS Message;
CREATE TABLE Message(
                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                     user_id BIGINT NOT NULL REFERENCES User(id),
                     addressee_id BIGINT NOT NULL REFERENCES User(id),
                     body VARCHAR(255) NOT NULL,
                     creation_time TIMESTAMP
);