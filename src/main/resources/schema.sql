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


/*book_review — отзывы о книгах
book_review_like — лайки и дизлайки отзывов
genre — жанры (дерево)
book2genre — привязка книг к жанрам
users — пользователь магазина
user_contact — контакт пользователя
book2user — привязки книг к юзерам
book2user_type — типы привязок книг к юзерам
balance_transaction — транзакции по счетам пользователей
book_file — файлы книг
book_file_type — типы файлов книг
description TEXT — описание типов файлов
file_download — количество скачиваний книги юзером
document — документы
faq — частые вопросы и ответы на них
message — сообщения в форму обратной связи
*/