package edu.cnm.deepdive;

import java.util.Objects;

@SuppressWarnings("unused")
public class Card implements Comparable<Card> {

  private final Suit suit;
  private final Rank rank;
  private final String symbol;
  private final int hash;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    symbol = rank.getSymbol() + suit.getSymbol();
    hash = Objects.hash(suit, rank);
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getRank() {
    return rank;
  }

  @Override
  public String toString() {
    return symbol;
  }

  @Override
  public int compareTo(Card other) {
    int comparison = this.suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = this.rank.compareTo(other.rank);
    }
    return comparison;
  }

  @Override
  public int hashCode() {
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    boolean isEqual;
    if (this == obj) {
      isEqual = true;
    } else if (obj instanceof Card other) {
      isEqual = (suit == other.suit && rank == other.rank);
    } else {
      isEqual = false;
    }
    return isEqual;
  }

}
