package com.company.BankInheritance;

public class TestMainBI {
    public static void main(String[] args) {
        Bank bank;

        bank = new TD();
        System.out.println("TD " + bank.rateOfInterest() + "% per year");

        bank = new Scotia();
        System.out.println("TD " + bank.rateOfInterest() + "% per year");

        bank = new BMO();
        System.out.println("TD " + bank.rateOfInterest() + "% per year");

    }
}
