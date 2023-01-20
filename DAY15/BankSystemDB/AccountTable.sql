use banksystem;

create table account(
    accountid int primary key auto_increment,
    accountno int not null,
    accountbalance float not null,
    accounttype varchar(255) not null,
    accountstatus varchar(255) not null,
    bankid int,
    customerid int,
    FOREIGN KEY(bankid) references bank(bankid),
    FOREIGN KEY(customerid) references customer(customerid)
);