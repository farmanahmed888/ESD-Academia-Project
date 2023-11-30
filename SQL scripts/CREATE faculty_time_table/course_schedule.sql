create table course_schedule
(
    course_scheduleid  int          not null
        primary key,
    building           varchar(255) null,
    room               varchar(255) not null,
    course_code        int          not null,
    day                tinyint      not null,
    time               time(6)      not null,
    course_course_code int          null,
    constraint UK_eapghdu9lxik100tvj1oivr6i
        unique (course_code),
    constraint FKne5ors7e5eseujgeslmbdsuxi
        foreign key (course_course_code) references course (course_course_code),
    check (`day` between 0 and 6)
);

