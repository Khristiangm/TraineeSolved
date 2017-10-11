package com.training;

import java.util.List;

/**
 * Created by KH389659 on 11/10/2017.
 */
public class Company extends AbstractEntity {

    private String location;
    private List<CardHolder> cardHolders;

    public Company(String name, String location, List<CardHolder> cardHolders) {
        super(name);
        this.location = location;
        this.cardHolders = cardHolders;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<CardHolder> getCardHolders() {
        return cardHolders;
    }

    public void setCardHolders(List<CardHolder> cardHolders) {
        this.cardHolders = cardHolders;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cardHolders=" + cardHolders +
                '}';
    }
}
