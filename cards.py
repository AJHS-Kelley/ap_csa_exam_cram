# Python with Cards 
# Objectives
#   -- Reinforce use of variables to store information. 
#   -- Reinforce use of functions in Python code.
#   -- Reinforce use of loops. 
#   -- Reinforce use of if-else statements. 

cardSuits = ["Hearts", "Diamonds", "Clubs", "Spades"] # A list. 
cardName = "Blank Name" # A string
cardValue = 0 # An integer, value is 2-10, J = 11, Q = 12, K = 13, A = 14
playerScore = 0.0 # A float a.k.a. a decimal number.
emptyHand = True # A boolean. 

def getCardValue():
    return cardValue

def getCardSuit():
    return cardSuit; 

def getCardName():
    return cardName;

def setTimer(seconds):
    # Full code not shown.  
    # Set a timer equal to seconds using the hourglass timer OR cellphone app.
    
def startTimer():
    # Full code not shown. 
    # Flip the timer over OR push the start button. 

def timeLeft():
    # Full code not shown. 
    # Returns True if time left on the timer, False if no time.

def makeDeck(): 
    # Full code not shown. 
    # Put all 52 cards of the deck together. 

def shuffleDeck(numShuffles):
    # Full code not shown. 
    # Shuffle the deck of cards equal to numShuffles.

def drawCards(numCards):
    # Full code not shown. 
    # Draw cards from the deck equal to numCards. 

makeDeck()
shuffleDeck(5)
setTimer(60)
startTimer()

while timeLeft() == True:
    drawCards(1)

    if getCardName() == "Ace":
        print("I got the ace!")
    elif getCardName() == "King":
        print("Hail to the king, baby!")
    elif getCardName() == "Queen":
        print("Yass, Queen!")
    elif getCardName() == "Jack":
        print("You don't know jack!")
    else:
        print("This card has no face.")

makeDeck()
shuffleDeck(3)

yourHand = [card0, card1, card2]
yourHand[0] = drawCards(1)
yourHand[1] = drawCards(1)
yourHand[2] = drawCards(1)

for eachCard in yourHand: 
    playerScore = playerScore + getCardValue()
    if getCardSuit() == "Hearts":
        playerScore = playerScore + 1
    elif getCardSuit() == "Clubs":
        playerScore = playerScore - 1
    elif getCardSuit() == "Diamonds":
        playerScore = playerScore + 2
    else:
        playerScore = playerScore -2 

if playerScore >= 40:
    makeChickenNoise()
elif playerScore >= 20:
    makeDogNoise()
else:
    makeFishNoise() 














