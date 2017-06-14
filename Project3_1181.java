/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_1181;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author staceylawson
 */
public class Project3_1181 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Game game = new Game();
        Deck test = new Deck();
        game.initializeDeck(test);
        game.startGame();
        game.handDisplay();
        game.discard();
        //game.displayCards();
        
        
        
    }
    
    
}
