# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table subject (
  id                        bigint not null,
  name                      varchar(255),
  katedra                   varchar(255),
  garant                    varchar(255),
  constraint pk_subject primary key (id))
;

create table teacher (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_teacher primary key (id))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (email))
;


create table subject_teacher (
  subject_id                     bigint not null,
  teacher_id                     bigint not null,
  constraint pk_subject_teacher primary key (subject_id, teacher_id))
;
create sequence subject_seq;

create sequence teacher_seq;

create sequence user_seq;




alter table subject_teacher add constraint fk_subject_teacher_subject_01 foreign key (subject_id) references subject (id) on delete restrict on update restrict;

alter table subject_teacher add constraint fk_subject_teacher_teacher_02 foreign key (teacher_id) references teacher (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists subject;

drop table if exists subject_teacher;

drop table if exists teacher;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists subject_seq;

drop sequence if exists teacher_seq;

drop sequence if exists user_seq;

