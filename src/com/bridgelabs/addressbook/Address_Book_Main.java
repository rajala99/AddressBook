package com.bridgelabs.addressbook;

public class Address_Book_Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book program");
        Address_Book addressbook = new Address_Book();
        addressbook.createContact();
    }
}
