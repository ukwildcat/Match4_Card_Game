/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_1181;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author staceylawson
 */


public class Game {
    
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Card> human = new ArrayList<>();
    private ArrayList<Card> computer = new ArrayList<>();
    private Queue<Card> draw = new LinkedList<Card>();
    Deque<Card> discard = new ArrayDeque<Card>();
    Scanner input = new Scanner(System.in);
    
    public void initializeDeck(Deck a){
        a.shuffle();
        while(a.cardsRemaining()>0){
            draw.offer(a.dealCard());
        }
    }
    public void startGame(){
        for(int i=0; i<4; i++){
        human.add(draw.poll());
        computer.add(draw.poll());
           
            
        }   
        displayCards();
         System.out.println("The discard pile is currently empty --"
                    + "you must draw a card. ");
         
        human.add(draw.poll());
        
        
    }
    public void displayCards(){
        System.out.println("Your cards are: ");
        for(Card h: human){
            System.out.println(h.toString());
        }
    }
    public void handDisplay(){
        
        System.out.println("Now your cards are: " );
        for(int i=1; i<6; i++){
            System.out.println(i + ". " + human.get(i-1).toString());
        }
        
    }
    public void discard(){
        System.out.println("Which one do you want to discard? ");
        int choice = input.nextInt();
        if(choice ==1){
            discard.offer(human.get(0));
            human.remove(0);
        }
        if(choice ==2){
            discard.offer(human.get(1));
            human.remove(1);
        }
        if(choice==3){
            discard.offer(human.get(2));
            human.remove(2);
        }  
        if(choice==4){
            discard.offer(human.get(3));
            human.remove(3);
        }
        if(choice==5){
            discard.offer(human.get(4));
            human.remove(4);
    }
    }
    public void computerTurn(){
        
    }
    
    }


