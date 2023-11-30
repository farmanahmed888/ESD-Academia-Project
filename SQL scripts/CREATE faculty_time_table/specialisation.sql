create table specialisation
(
    specialisationid int          not null
        primary key,
    code             int          not null,
    credits_required int          not null,
    description      varchar(255) null,
    name             varchar(255) not null,
    year             int          not null,
    constraint UK_tjkxh0509iyrpyytmt0bgba6x
        unique (code)
);

