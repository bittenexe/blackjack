package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand hand = new Hand("Player 1"); // Pass a player name if required by your constructor

        // Deal cards using your hand's deal() method
        hand.deal(deck.deal());

        Card card = deck.deal();
        hand.deal(card);

        card = deck.deal();
        hand.deal(card);

        // toString() is a method, so it needs parentheses ()
        System.out.println(hand.toString());
    }
}