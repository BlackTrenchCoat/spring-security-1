create table dogs(
      name varchar(50) not null primary key,
      breed varchar(50),
      password varchar(50) not null,
      alpha boolean not null);

create table authorities (
      username varchar(50) not null,
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key(username) references dogs(name));
      create unique index ix_auth_username on authorities (username,authority);
