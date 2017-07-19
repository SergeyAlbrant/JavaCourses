package Solitare;

import java.awt.Color;
import java.awt.Graphics;

class CardPile {

	// coordinates of the card pile
	protected int x;
	protected int y;
	private Card firstCard;

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
		
		
//		if (empty()) {//to do
//			return;
//		}
//
		
		if (this.canTake(firstPile.top())) {
			this.push(firstPile.pop());
			return;
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

	public void doStuff() {

		if (Solitare.firstClick){
			if (empty()) {
				return;
			}
			
			if (!this.top().isFaceUp()){
					this.top().flip();
					return;
			}
			this.top().isSelected=true;
			Solitare.firstClick = false;
			Solitare.firstPile=this;
			
	}
		else {
			select(x, y, Solitare.firstPile);
			Solitare.firstClick = true;
			Solitare.firstPile = null;
		}
	}
	
	

}