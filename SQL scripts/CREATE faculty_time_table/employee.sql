create table employee
(
    employeeid int          not null
        primary key,
    email      varchar(255) not null,
    first_name varchar(255) not null,
    last_name  varchar(255) null,
    title      varchar(255) null,
    constraint UK_fopic1oh5oln2khj8eat6ino0
        unique (email)
);

