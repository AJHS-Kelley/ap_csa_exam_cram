import java.util.ArrayList;

public class Cards {
    // Class Attributes
    private String cardSuit; // Hearts, Spades, Clubs, Diamonds
    private String cardName; // 2-10, Jack, Queen, King, Ace
    private int cardValue; // 2-10, 11, 12, 13, 14
    private double playerScore = 0.0;
    private boolean emptyHand = true;

    // Class Constructors
    public Cards() {
        this.cardSuit = "Unknown";
        this.cardName = "Unknown";
        this.cardValue = 0;
    }

    // cardName Constructor
    public Cards(String suit, int value) {
        this.cardSuit = suit;
        this.cardValue = value;
        if (value == 2) {
            this.cardName = "Two of " + cardSuit;
        } else if (value == 3) {
            this.cardName = "Three of " + cardSuit;
        } else if (value == 4) {
            this.cardName = "Four of " + cardSuit;
        } else if (value == 5) {
            this.cardName = "Five of " + cardSuit;
        } else if (value == 6) {
            this.cardName = "Six of " + cardSuit;
        } else if (value == 7) {
            this.cardName = "Seven of " + cardSuit;
        } else if (value == 8) {
            this.cardName = "Eight of " + cardSuit;
        } else if (value == 9) {
            this.cardName = "Nine of " + cardSuit;
        } else if (value == 10) {
            this.cardName = "Ten of " + cardSuit;
        } else if (value == 11) {
            this.cardName = "Jack of " + cardSuit;
        } else if (value == 12) {
            this.cardName = "Queen of " + cardSuit;
        } else if (value == 13) {
            this.cardName = "King of " + cardSuit;
        } else {
            this.cardName = "Ace of " + cardSuit;
        }
    }

    // Cards Methods 
    public int getValue() {
        return cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardName() {
        return cardName;
    }

    static void setTimer(int seconds) {
        /* 
        Implementation not shown. 
        Get a timer with the matching time parameter. Examples: 
        setTimer(30); 
        Get a 30-second timer, flip it over so all the sand pours into the bottom. 
        setTimer(120);
        Get a 2-minute timer, flip it so all sand pours into the bottom. 
        */
    }

    static void startTimer() {
        /*
        Implementation not shown. Example:
        starTimer(); 
        Flip the timer over so the sand starts to pour from the top to the bottom. 
        */
    }

    public boolean hasSandOnTop() {
        /*
        Implementation not shown. Example:
        timer.hasSandOnTop();
        Returns true if there is at least 1 grain of sand remaining in the top of the timer.
        */
    }

    public ArrayList makeDeck() {
        /* 
        Implementation not shown.  Example:
        makeDeck();
        Creates a deck of 52 cards: 2-10, Jack, Queen, King, and Ace of Hearts, Clubs, Spades, and Diamonds. 
        */
    }

    static void shuffleDeck() {
        /* 
        Implementation not shown.  Example:
        shuffleDeck();
        Shuffle the deck of cards.
        */
    }

    public void drawCards(int num) {
        /* 
        Implementation not shown.  Example:
        cardCards(5);
        Draw num cards from the deck, uses .remove() method to remove from the deck <ArrayList>.  
        */
    }

    public void discardCards(int num) {
        /* 
        Implementation not shown.  Example:
        discardCards(3);
        Discard num cards from your hand.  
        */
    }

    public static void main(String[] args) {

        makeDeck(); // Get a deck of cards, if not enough decks, split deck in half and share with partner. 
        shuffleDeck(); // Shuffle as best you can, please do not mangle the cards. 
        setTimer(30); // Share the 30-second timer, or use a timer on your phone. 
        startTimer();

        // For the System.out.println() on the in this while loop, write them on this paper. 
        while (timer.hasSandOnTop() == true) {
            drawCards(1);
            if (getCardName() == "Ace of") {
                System.out.println("I got the ace!");
            } else if (getCardName() == "King of") {
                System.out.println("Hail to the king, baby!");
            } else if (getCardName() == "Queen of") {
                System.out.println("Yass, Queen!");
            } else if (getCardName() == "Jack of") {
                System.out.println("You don't know jack!");
            } else {
                System.out.println("This card has no face.");
            }
        }

        makeDeck(); // Return all cards to the deck, split deck in half if needed to share. 
        shuffleDeck(); // Shuffle as best you can, please do not mangle the cards. 

        Cards yourHand[] = new Cards[5]; // Create an Array called yourHand, make 5 elements in the array. 
        yourHand[0] = drawCards(1); // Draw one card, put it into your "hand" on the left. 
        yourHand[1] = drawCards(1); // Draw one card, put it into your "hand" on to the right of the card you just drew. 
        yourHand[2] = drawCards(1); // Draw one card, put it into your "hand" on to the right of the card you just drew. 
        yourHand[3] = drawCards(1); // Draw one card, put it into your "hand" on to the right of the card you just drew. 
        yourHand[4] = drawCards(1); // Draw one card, put it into your "hand" on to the right of the card you just drew. 

        /* 
        Loop through each card in yourHand using a for-each loop. ONLY WORKS WITH ARRAYS. 
        For each card, get the value of that card and add it to playerScore.  Use your phone calculator if necessary.
        */

        for (int i : yourHand) {
            playerScore += yourHand[i].getValue();
            if (cardSuit == "Hearts") {
                playerScore = playerScore + 2;
            } else if (cardSuit == "Diamonds") {
                playerScore = playerScore - 2;
            } else if (cardSuit == "Clubs") {
                playerScore = playerScore + 4;
            } else {
                playerScore = playerScore - 4;
            }
        }

        if (playerScore >= 30) {
            makeChickenNoise(); // Make a sound like a chicken.  
        } else if (playerScore >= 10) {
            makeDogNoise(); // Make a sound like a dog. 
        } else {
            makeFishNoise(); // Make a sound like a fish.
        }

    }
}
