# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                        bigint not null,
  city                      varchar(255),
  postcode                  integer,
  street                    varchar(255),
  constraint pk_address primary key (id))
;

create table exam (
  id                        bigint not null,
  subject_code              varchar(255),
  date                      timestamp,
  room                      varchar(255),
  examiner                  varchar(255),
  constraint pk_exam primary key (id))
;

create table schedule (
  id                        bigint not null,
  student_id                bigint,
  constraint pk_schedule primary key (id))
;

create table student (
  id                        bigint not null,
  name                      varchar(255),
  lastname                  varchar(255),
  email                     varchar(255),
  schedule_id               bigint,
  address_id                bigint,
  constraint pk_student primary key (id))
;

create table subject (
  id                        bigint not null,
  name                      varchar(255),
  katedra                   varchar(255),
  information               varchar(255),
  garant                    varchar(255),
  code                      varchar(255),
  constraint pk_subject primary key (id))
;

create table task (
  id                        bigint not null,
  name                      varchar(255),
  description               varchar(255),
  constraint pk_task primary key (id))
;

create table teacher (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_teacher primary key (id))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  user_role                 varchar(255),
  constraint pk_user primary key (email))
;


create table exam_student (
  exam_id                        bigint not null,
  student_id                     bigint not null,
  constraint pk_exam_student primary key (exam_id, student_id))
;

create table schedule_subject (
  schedule_id                    bigint not null,
  subject_id                     bigint not null,
  constraint pk_schedule_subject primary key (schedule_id, subject_id))
;

create table student_subject (
  student_id                     bigint not null,
  subject_id                     bigint not null,
  constraint pk_student_subject primary key (student_id, subject_id))
;

create table student_task (
  student_id                     bigint not null,
  task_id                        bigint not null,
  constraint pk_student_task primary key (student_id, task_id))
;

create table student_exam (
  student_id                     bigint not null,
  exam_id                        bigint not null,
  constraint pk_student_exam primary key (student_id, exam_id))
;

create table subject_teacher (
  subject_id                     bigint not null,
  teacher_id                     bigint not null,
  constraint pk_subject_teacher primary key (subject_id, teacher_id))
;

create table task_student (
  task_id                        bigint not null,
  student_id                     bigint not null,
  constraint pk_task_student primary key (task_id, student_id))
;
create sequence address_seq;

create sequence exam_seq;

create sequence schedule_seq;

create sequence student_seq;

create sequence subject_seq;

create sequence task_seq;

create sequence teacher_seq;

create sequence user_seq;

alter table schedule add constraint fk_schedule_student_1 foreign key (student_id) references student (id) on delete restrict on update restrict;
create index ix_schedule_student_1 on schedule (student_id);
alter table student add constraint fk_student_schedule_2 foreign key (schedule_id) references schedule (id) on delete restrict on update restrict;
create index ix_student_schedule_2 on student (schedule_id);
alter table student add constraint fk_student_address_3 foreign key (address_id) references address (id) on delete restrict on update restrict;
create index ix_student_address_3 on student (address_id);



alter table exam_student add constraint fk_exam_student_exam_01 foreign key (exam_id) references exam (id) on delete restrict on update restrict;

alter table exam_student add constraint fk_exam_student_student_02 foreign key (student_id) references student (id) on delete restrict on update restrict;

alter table schedule_subject add constraint fk_schedule_subject_schedule_01 foreign key (schedule_id) references schedule (id) on delete restrict on update restrict;

alter table schedule_subject add constraint fk_schedule_subject_subject_02 foreign key (subject_id) references subject (id) on delete restrict on update restrict;

alter table student_subject add constraint fk_student_subject_student_01 foreign key (student_id) references student (id) on delete restrict on update restrict;

alter table student_subject add constraint fk_student_subject_subject_02 foreign key (subject_id) references subject (id) on delete restrict on update restrict;

alter table student_task add constraint fk_student_task_student_01 foreign key (student_id) references student (id) on delete restrict on update restrict;

alter table student_task add constraint fk_student_task_task_02 foreign key (task_id) references task (id) on delete restrict on update restrict;

alter table student_exam add constraint fk_student_exam_student_01 foreign key (student_id) references student (id) on delete restrict on update restrict;

alter table student_exam add constraint fk_student_exam_exam_02 foreign key (exam_id) references exam (id) on delete restrict on update restrict;

alter table subject_teacher add constraint fk_subject_teacher_subject_01 foreign key (subject_id) references subject (id) on delete restrict on update restrict;

alter table subject_teacher add constraint fk_subject_teacher_teacher_02 foreign key (teacher_id) references teacher (id) on delete restrict on update restrict;

alter table task_student add constraint fk_task_student_task_01 foreign key (task_id) references task (id) on delete restrict on update restrict;

alter table task_student add constraint fk_task_student_student_02 foreign key (student_id) references student (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists address;

drop table if exists exam;

drop table if exists exam_student;

drop table if exists schedule;

drop table if exists schedule_subject;

drop table if exists student;

drop table if exists student_subject;

drop table if exists student_task;

drop table if exists student_exam;

drop table if exists subject;

drop table if exists subject_teacher;

drop table if exists task;

drop table if exists task_student;

drop table if exists teacher;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists address_seq;

drop sequence if exists exam_seq;

drop sequence if exists schedule_seq;

drop sequence if exists student_seq;

drop sequence if exists subject_seq;

drop sequence if exists task_seq;

drop sequence if exists teacher_seq;

drop sequence if exists user_seq;

