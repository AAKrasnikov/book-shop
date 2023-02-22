DROP TABLE IF EXISTS books;
CREATE TABLE  books(
    id INT AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(250) NOT NULL,
    title VARCHAR(250) NOT NULL,
    priceOld  VARCHAR(250) DEFAULT NULL,
    price VARCHAR(250) DEFAULT NULL,
    parameter_id INT
);

create table authors (
    id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

/*DROP TABLE IF EXISTS books_author;
CREATE TABLE books_author(
    id INT AUTO_INCREMENT PRIMARY KEY,
    books_id INT,
    author_id INT
);

DROP TABLE IF EXISTS author;
CREATE TABLE  author(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    surname VARCHAR(250) NOT NULL,
    full_name VARCHAR(500) NOT NULL
);


DROP TABLE IF EXISTS parameter_books;
CREATE TABLE parameter_books(
  id INT AUTO_INCREMENT PRIMARY KEY,
  popular VARCHAR(5),
  new VARCHAR(5),
  recommended VARCHAR(5)
);*/