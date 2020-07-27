-- drop database bank_account;
-- create database bank_account;
use bank_account;
CREATE TABLE bank_account (
  nnumber VARCHAR(255) NOT NULL PRIMARY KEY,
  balance bigint NOT NULL
);
