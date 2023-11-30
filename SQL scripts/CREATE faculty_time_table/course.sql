create table course
(
    courseid           int          not null
        primary key,
    capacity           int          not null,
    course_course_code int          not null,
    credits            int          not null,
    description        varchar(255) not null,
    name               varchar(255) not null,
    term               int          not null,
    year               int          not null,
    employeeid         int          not null,
    constraint UK_98u4ybe1co0cwwu3od50ho6fy
        unique (course_course_code),
    constraint FKc4rn6sj0t659o53xf9rp77jy1
        foreign key (employeeid) references employee (employeeid)
);

