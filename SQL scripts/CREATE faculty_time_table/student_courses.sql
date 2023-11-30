create table student_courses
(
    student_courses_id int not null
        primary key,
    course_course_code int null,
    roll_number        int not null,
    constraint UK_ad0k5i20bp3fl5cu8y31b0s0c
        unique (course_course_code),
    constraint FK4uclivo34vqwfgd69qymnjqyq
        foreign key (course_course_code) references course (course_course_code),
    constraint FKnongf0s553lp1fp937ticd2tr
        foreign key (roll_number) references student (roll_number)
);

