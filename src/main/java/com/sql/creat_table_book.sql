create table Book(
    id int not null generated always as identity,
    bookName varchar(50) not null,
    price int not null,
    ts timestamp default current_timestamp,
    primary key(id)
)