package com.training;

/**
 * Created by KH389659 on 11/10/2017.
 */
public class CardHolder extends AbstractEntity {

    private String cardNumber;
    private Company company;

    public CardHolder(String name, String cardNumber, Company company) {
        super(name);
        this.cardNumber = cardNumber;
        this.company = company;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CardHolder{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
