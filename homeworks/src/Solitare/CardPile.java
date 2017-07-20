package Solitare;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;

class CardPile {

	// coordinates of the card pile
	protected int x;
	protected int y;
	private Card firstCard;
	static int numberOfSelectedCards;

	CardPile(final int xCoord, final int yCoord) {
		x = xCoord;
		y = yCoord;
		firstCard = null;
	}

	// access to cards are not overridden

	public Card top() {
		return firstCard;
	}

	public boolean empty() {
		return firstCard == null;
	}

	public void push(final Card aCard) {
		aCard.link = firstCard;
		firstCard = aCard;
	}

	public Card pop() {
		Card result = null;
		if (firstCard != null) {
			result = firstCard;
			firstCard = firstCard.link;
		}
		return result;
	}

	// the following are sometimes overridden

	public boolean includes(final int clickX, final int clickY) {
		return x <= clickX && clickX <= x + Card.width && y <= clickY
				&& clickY <= y + Card.height;
	}

	public void select(final int tx, final int ty, CardPile firstPile) {
		
		
		if (numberOfSelectedCards== 1 && this.canTake(firstPile.top())) {
			this.push(firstPile.pop());
			
			return;
		}
		
		boolean win = true;
		for (int i = 0; i < 2 || i > 5; i++) {
			if (!Solitare.allPiles[2 + i].empty()){
				win = false;
				break;
			}
		}
		if (win) {
			//TODO
		}
		
		
	}


	public void display(final Graphics g) {
		g.setColor(Color.black);
		if (firstCard == null) {
			g.drawRect(x, y, Card.width, Card.height);
		} else {
			firstCard.draw(g, x, y);
		}
	}

	public boolean canTake(final Card aCard) {
		return false;
	}
	
	public int countOfCards() {
        int count = 0;
        Card temp = this.firstCard;
        while (temp != null) {
            temp = temp.link;
            count++;
        }
        return count;
    }

	public void doStuff(int tx, int ty) {

		if (Solitare.firstClick){
			if (empty()) {
				return;
			}
			
//			if (!this.top().isFaceUp()){
//					this.top().flip();
//					return;
//			}
			
			Solitare.selectedCard = this.firstCard;
			if (this instanceof TablePile) {
				int i = 1;
				while (Solitare.selectedCard != null) {

					if (y + (countOfCards() - i) * 35 <= ty && Solitare.selectedCard.isFaceUp()) {
						numberOfSelectedCards = i;
						break;
					}
					Solitare.selectedCard = Solitare.selectedCard.link;
					i++;
				} 
			}
			else numberOfSelectedCards = 1;
			
			if (Solitare.selectedCard == null) return;
			
			Solitare.selectedCard.isSelected=true;
			Solitare.firstClick = false;
			Solitare.firstPile=this;
			
	}
		else {
			select(x, y, Solitare.firstPile);
			if (!Solitare.firstPile.empty() && !Solitare.firstPile.top().isFaceUp()) Solitare.firstPile.top().flip();
			Solitare.firstClick = true;
			Solitare.firstPile = null;
			Solitare.selectedCard.isSelected=false;
			numberOfSelectedCards = 0;
		}
	}
	
	

}