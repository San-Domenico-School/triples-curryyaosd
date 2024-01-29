import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Board for Triples
 * 
 * @author Curry Yao
 * @version Jan 29, 2024
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK;

    public GameBoard(boolean isEasyMode)
    {   
        super(430, 600, 1, false); 

        // Set the number of cards based on the mode
        NUM_CARDS_IN_DECK = isEasyMode ? 27 : 81; // Ternary operator to assign the number

        prepareScene();
    }

    private void prepareScene() {
        // Declare and instantiate a new Dealer
        Dealer dealer = new Dealer(NUM_CARDS_IN_DECK);
        // Add the Dealer to the world at coordinates (-30, -30)
        addObject(dealer, -30, -30);
        
        // Further setup can be done here if needed
    }
}
