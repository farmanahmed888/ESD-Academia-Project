create table specialisation_courses
(
    specialisation_coursesid int not null
        primary key,
    course_course_code       int not null,
    specialisationid         int not null,
    constraint UK_ly928b5fxls0mi4lgs8nrh00p
        unique (course_course_code),
    constraint FKc2509eqa3w5e8gyosc9t33jrv
        foreign key (course_course_code) references course (course_course_code),
    constraint FKhggkrou1iy60sk8kgwaa3gelo
        foreign key (specialisationid) references specialisation (specialisationid)
);

