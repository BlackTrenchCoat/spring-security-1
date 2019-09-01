insert into users  (username, password, enabled) values ('rain', 'rain', true);

insert into users  (username, password, enabled) values ('whisper', 'whisper', true);

insert into authorities (username, authority) values ('rain', 'ROLE_ADMIN');

insert into authorities (username, authority) values ('whisper', 'ROLE_USER');
