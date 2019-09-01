--insert into users  (username, password, enabled) values ('rain', 'rain', true);

--insert into users  (username, password, enabled) values ('whisper', 'whisper', true);

insert into users (username, password, enabled)
values
('rain', '{bcrypt}$2a$10$ueoEaXcj/3lao0YFFCZ83euX76xKZ9Q02xpUrTXVAhl1zxAV0ZvOa', true);

insert into users (username, password, enabled)
values
('whisper', '{bcrypt}$2a$10$dN3F3Q4gGQsx3Zv0QxnZ9.NGHY26htkJt3siX74.i8n9XIyN.1lEq', true);

insert into authorities (username, authority) values ('rain', 'ROLE_ADMIN');

insert into authorities (username, authority) values ('whisper', 'ROLE_USER');
