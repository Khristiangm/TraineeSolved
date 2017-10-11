package com.training;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //CRIANDO UM CARD HOLDER QUE SERA CLIENTE DA COMPANHIA ITAU E VAI PARTICIPAR DA LISTA.
        Company itau = inputCompany();
        List<CardHolder> itauList = new ArrayList<>();
        CardHolder homer = inputCardHolder(itau);
        itauList.add(homer);
        System.out.println(itau);

        //CRIANDO UM CARD HOLDER QUE SERA CLIENTE DA COMPANHIA BRADESCO E VAI PARTICIPAR DA LISTA.
        Company bradesco = inputCompany();
        List<CardHolder> bradescoList = new ArrayList<>();
        CardHolder luiz = inputCardHolder(bradesco);
        bradescoList.add(luiz);
        bradesco.setCardHolders(bradescoList);
        System.out.println(bradesco);

    }

    //METODO CRIADO PARA COLETAR DADOS DA COMPANHIA
    public static Company inputCompany() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Company Name, ");
        String name = scanner.nextLine();

        System.out.println("Company Localization, ");
        String location = scanner.nextLine();

        return new Company(name, location, new ArrayList<>());
    }

    //METODO CRIADO PARA COLETAR DADOS DO CARD HOLDER
    public static CardHolder inputCardHolder(Company company) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CardHolder Name ");
        String name = scanner.nextLine();

        System.out.println("CardHolder Account Number");
        String cardNumber = scanner.nextLine();

        return new CardHolder(name, cardNumber, company);
    }
}
