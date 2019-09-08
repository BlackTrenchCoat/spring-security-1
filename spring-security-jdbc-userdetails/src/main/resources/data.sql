insert into users (id, username, password)
values
(1, 'rain', '{bcrypt}$2a$10$ueoEaXcj/3lao0YFFCZ83euX76xKZ9Q02xpUrTXVAhl1zxAV0ZvOa');

insert into users (id, username, password)
values
(2, 'whisper', '{bcrypt}$2a$10$dN3F3Q4gGQsx3Zv0QxnZ9.NGHY26htkJt3siX74.i8n9XIyN.1lEq');

insert into authorities (username, authority) values ('rain', 'ROLE_ADMIN');

insert into authorities (username, authority) values ('whisper', 'ROLE_USER');
