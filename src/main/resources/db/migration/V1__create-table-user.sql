CREATE TABLE "client"(
    id bigint not null,
    fullname varchar(100) not null,
    email varchar(100) not null unique,
    document varchar(100) not null unique,
    password varchar(100) not null,
    balance decimal(19,4) not null,
    usertype varchar(100) not null
)