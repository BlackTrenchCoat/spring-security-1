create table dogs(
      name varchar(50) not null primary key,
      breed varchar(50),
      password varchar(50) not null,
      alpha boolean not null);

create table privileges (
      name varchar(50) not null,
      privilege varchar(50) not null,
      constraint fk_privileges_users foreign key(name) references dogs(name));
      create unique index ix_auth_name on privileges (name,privilege);
