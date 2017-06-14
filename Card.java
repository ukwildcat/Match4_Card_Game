/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_1181;

/**
 *
 * @author staceylawson
 */
public class Card {
 private String value;
 private String suit;

  public Card(String suit, String value) {
    this.suit = suit;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public String getSuit() {
    return suit;
  }

 @Override
  public String toString() {
      
    return value + " of " + suit;
  }
}   

