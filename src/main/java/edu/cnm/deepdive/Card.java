package edu.cnm.deepdive;

@SuppressWarnings("unused")
public class Card implements Comparable<Card> {

  private final Suit suit;
  private final Rank rank;
  private final String symbol;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    symbol = rank.getSymbol() + suit.getSymbol();
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

}
