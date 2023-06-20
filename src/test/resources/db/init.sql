create database book_store;

\connect book_store;

create table books(
    id bigint primary key generated always as identity,
    name character varying(255) not null,

    CONSTRAINT books_name_uniq UNIQUE (name)
);

insert into books(name) values ('The little prince'),('Flow'),('7 habits');
