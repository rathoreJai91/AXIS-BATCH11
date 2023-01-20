use bank_system;

select * from customertable;
select * from account;
select * from transaction;

create table bankdemo(id int primary key auto_increment , 
            Bankname varchar(255) not null, BankLocation 
            varchar(255));

insert into bankdemo(Bankname , BankLocation) 
            values ('Axis' , 'Delhi');

alter table customertable modify customerphn bigint;

insert into customertable(customername,customeremail,
            customerpassword,customerphn,customercardno)
            values('ramesh', 'ramesh@gmail.com','ramesh@123',
            8957633655,232425425662),('shreenam','shreeram@gmail.com',
            'shreeram@123',9845667458,794652646921);

insert into account(accountno,accountbalance,accounttype,
            accountstatus,customerid)
            values (4599756246,15000,'saving','active',4),
            (4583289916,50000,'current','active',5);

-- inner join
select  customername,customeremail,accountno,accountbalance,
        accounttype from customertable INNER JOIN account 
        ON customertable.id=account.customerid; 

-- left join
select  customername,customeremail,accountno,accountbalance,
        accounttype from customertable LEFT JOIN account 
        ON customertable.id=account.customerid; 

-- right join
select  customername,customeremail,accountno,accountbalance,
        accounttype from customertable RIGHT JOIN account 
        ON customertable.id=account.customerid; 

-- cross join
select * from customertable CROSS JOIN account;
select * from customertable CROSS JOIN account 
        where customertable.id=account.customerid;

-- create a Transaction table
create table Transaction
            (transactionid int primary key auto_increment,
             transactiontype varchar(255) not null,
             transactionammount FLOAT not null,
             transactiondate DATE,
             transactiontime Time,
             accountid int,
             FOREIGN KEY(accountid) references account(accountid));

-- insert into transaction table
insert into transaction(
        transactiontype,transactionammount,transactiondate,
        transactiontime,accountid)
        values ('deposite',10000,CURDATE(),CURTIME(),2);

--after doing the transaction update the account balance
update account set accountbalance = accountbalance+10000
        where accountid=2;

select customername,customeremail,accountno,accounttype,
        accountbalance,transactionammount,transactiontype,
        transactiondate,transactiontime from customertable 
        INNER JOIN account ON 
        customertable.id=account.customerid
        INNER JOIN transaction ON 
        account.accountid=transaction.accountid;

select accountno,accounttype,transactiontype,transactionammount,
       transactiondate,transactiontime from account 
       INNER JOIN transaction ON
       account.accountid=transaction.accountid;

select accountno ,SUM(transactionammount) as totalDeposit
    from account INNER JOIN transaction ON
    account.accountid=transaction.accountid 
    where transactiontype='deposite';

-- add a new column AGE into customer
alter table customertable add age int;

--update customer details
update customertable set age=21 where id=1;

-- all those account which have a transaction using ANY
select * from account 
where accountid = ANY(select accountid from transaction);

select * from account 
inner join transaction on 
transaction.accountid=account.accountid;

select * from account
where exists (select accountid from transaction);