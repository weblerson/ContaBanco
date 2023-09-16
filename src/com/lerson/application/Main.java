package com.lerson.application;

import com.lerson.entities.Account;
import com.lerson.entities.Customer;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Por favor, digite o número da sua conta: ");
        int number = scan.nextInt();
        scan.nextLine();

        System.out.print("Por favor, digite o número de sua agência: ");
        String agency = scan.next();
        scan.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String name = scan.next();
        scan.nextLine();

        System.out.print("Por favor, digite o valor do saque: ");
        float balance = scan.nextFloat();
        scan.nextLine();

        scan.close();

        Customer customer = new Customer(name);
        Account account = new Account(number, agency, customer, balance);

        System.out.printf(
                "Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já " +
                        "está disponível para saque",
                account.getCustomer().getName(), account.getAgency(), account.getNumber(), account.getBalance()
        );
    }
}
