package Solitare;

import java.awt.Graphics;

class TablePile extends CardPile {

	//static int HeightOfPile=getNumberOfCards();
	
	
	
	
	TablePile(int x, int y, int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			push(Solitare.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	
	


	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			return aCard.getRank() == 12;
		}
		Card topCard = top();
		return (aCard.getColor() != topCard.getColor())
				&& (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		// don't test bottom of card
		return x <= tx && tx <= x + Card.width && y <= ty &&
            //  (y+(countOfCards()-1)* 35) <= ty && 
                ty<= (y+(countOfCards()-1)* 35 + Card.height);
	
	}
	

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + 35;
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
	}
	
	//public void push(Card aCard, int numberOfElements) {
	//	// FIXME Auto-generated method stub
	//	super.push(aCard);
	//}
	
	@Override
	public void select(int tx, int ty, CardPile firstPile) {
		// FIXME Auto-generated method stub
		if (this.canTake(Solitare.selectedCard)) {
			CardPile temp = new CardPile(tx, ty);
			
			//push(Solitare.selectedCard);
			for (int i = 0; i < numberOfSelectedCards; i++) {
				
				temp.push(firstPile.pop());
			}
			for (int i = 0; i < numberOfSelectedCards; i++) {
				
				push(temp.pop());
			}
			if (!firstPile.empty()) firstPile.top().flip();
	

		}

	}
	
	

}