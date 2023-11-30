create table student
(
    studentid        int          not null
        primary key,
    cgpa             double       null,
    first_name       varchar(255) not null,
    graduation_year  int          null,
    last_name        varchar(255) null,
    roll_number      int          not null,
    total_credits    int          null,
    specialisationid int          null,
    constraint UK_erjkdcsjqvn9jm62mmv8g58jg
        unique (specialisationid),
    constraint UK_o1g1spw0ecyidv94ka2dk88wf
        unique (roll_number),
    constraint FKuv5nmfim0abv6khju1r5y9w8
        foreign key (specialisationid) references specialisation (specialisationid)
);

