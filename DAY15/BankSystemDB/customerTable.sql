use banksystem;

create table customer(
    customerid int primary key auto_increment,
    customername varchar(255) not null,
    customeremail varchar(255) not null,
    customerpassword varchar(255) not null,
    customerphn bigint not null,
    customercardno bigint not null
);

select * from customer;

insert into customer (customername, customeremail,
    customerpassword, customerphn, customercardno)
    values ('kaliya', 'kaliya@daaku.com', 'kalu123',
    7859579546, 124579654125);