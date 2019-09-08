create table users
(
    id       bigint       not null primary key,
    username varchar(50)  not null,
    password varchar(100) not null
);

create table authorities
(
    username  varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key (username) references users (username)
);
create unique index ix_auth_username on authorities (username, authority);
