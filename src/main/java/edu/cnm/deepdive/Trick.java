package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Trick {

  public static void main(String[] args) {

    Random rng = new SecureRandom();
    List<Card> deck = createDeck(rng);

    // TODO Sort the deck into two piles, based on the rules of the trick.
    // TODO Swap a random number of cards between the two piles.
    // TODO Sort the piles.
    // TODO Count & print out the cards and the count.
  }

  private static List<Card> createDeck(Random rng) {
    List<Card> deck = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        deck.add(new Card(suit, rank));
      }
    }
    Collections.shuffle(deck, rng);
    return deck;
  }
}
