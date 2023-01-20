use banksystem;

create table bank(
    bankid int primary key auto_increment,
    name varchar(255) not null,
    address varchar(255) not null,
    bankcode varchar(255) not null
);

select * from bank;

insert into bank(name, address, bankcode)
values ('AXIS', 'DELHI', 'AXIS@123');