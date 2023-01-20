use banksystem;

create table transaction(
    transactionid int primary key auto_increment,
    transactionamount float not null,
    transactiontype varchar(255) not null,
    transactiondate DATE not null,
    transactiontime TIME not null,
    accountid int,
    FOREIGN KEY(accountid) references account(accountid)
);