package com.company;

public class Card {

    String rank;
    String suit;
    int pointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }


    public String getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public int getPointValue()
    {
        return pointValue;
    }

    public boolean equals(Card othercard)
    {

    }

    public String toString()
    {

    }

}