DROP TABLE IF EXISTS book;
CREATE TABLE  book(
    id INT AUTO_INCREMENT PRIMARY KEY,
    pup_date DATE NOT NULL,
    is_bestseller TINYINT NOT NULL,
    slug VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
    image VARCHAR(255),
    description TEXT,
    price INT not null,
    discount TINYINT NOT NULL DEFAULT 0
);

DROP TABLE IF EXISTS author;
create table author (
    id INT AUTO_INCREMENT PRIMARY KEY,
    photo VARCHAR(255),
    slug VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT
);

DROP TABLE IF EXISTS book2author;
create table book2author (
    id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    author_id INT NOT NULL,
    sort_index INT NOT NULL DEFAULT 0
);

DROP TABLE IF EXISTS genre;
CREATE TABLE genre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    parent_id INT,
    slug VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS book2genre;
CREATE TABLE book2genre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    genre_id INT NOT NULL
);
