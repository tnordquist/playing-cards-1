package edu.cnm.deepdive;

import edu.cnm.deepdive.Suit.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Trick {

  public static void main(String[] args) {

    Random rng = new SecureRandom();
    List<Card> deck = createDeck(rng);
    List<Card> redPile = new ArrayList<>();
    List<Card> blackPile = new ArrayList<>();
    sortCards(deck, redPile, blackPile);

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

  private static void sortCards(List<Card> deck, List<Card> redPile, List<Card> blackPile) {
    for (Iterator<Card> iter = deck.iterator(); iter.hasNext(); ) {
      Card selector = iter.next();
      Card card = iter.next();
      if (selector.getSuit().getColor() == Color.RED) {
        redPile.add(card);
      } else {
        blackPile.add(card);
      }
    }
  }
}
