use banksystem;

create table atm(
    atmid int primary key auto_increment,
    deposit boolean not null,
    withdrawn boolean not null,
    checkbalance boolean not null,
    transactionid int ,
    FOREIGN KEY(transactionid) references transaction(transactionid)
);