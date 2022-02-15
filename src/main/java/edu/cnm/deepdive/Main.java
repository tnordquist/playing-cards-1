package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    Deck d = new Deck();
    System.out.println(d);
    d.shuffle();
    System.out.println(d);
    for (Card c : d) {
      System.out.println(c);
    }
    d.sort();
    System.out.println(d);
  }

}
