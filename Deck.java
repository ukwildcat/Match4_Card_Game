/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_1181;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author staceylawson
 */
public class Deck{
 
    String[] suit = new String[] {
            "Spades", "Hearts", 
            "Diamonds", "Clubs" 
        };
    
    String[] value = new String[] {
            "Ace", "2", "3", "4",
            "5", "6", "7", "8", "9", "10", 
            "Jack", "Queen", "King" 
        };
    
private ArrayList<Card> cards;

    /**
     *
     */
    public Deck() {
    cards = new ArrayList<>();
    for (String s : suit) {
      for ( String v : value) {
        Card newCard = new Card(s, v);
        
        cards.add(newCard);
         // System.out.println(newCard.toString());
      }
    }
  }
 
  public ArrayList<Card> getCards() {
    return cards;
  }
  
  public void shuffle(){
    Collections.shuffle(cards);
}
  public Card dealCard() {
        return this.cards.remove(this.cards.size()-1);
    }
 public int cardsRemaining() {
        return this.cards.size();
    }
 
 }

