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

	public void select(final int tx, final int ty) {
		// do nothing
		
		if (empty()) {
			return;
		}

		// if face down, then flip
		if (this instanceof TablePile){
			Card topCard = top();
			if (!topCard.isFaceUp()) {
				topCard.flip();
				return;
			}
		}
		// else see if any suit pile can take card
		Card topCard = pop();
		for (int i = 0; i < 4; i++) {
			if (Solitare.suitPile[i].canTake(topCard)) {
				Solitare.suitPile[i].push(topCard);
				return;
			}
		}
		// else see if any other table pile can take card
		for (int i = 0; i < 7; i++) {
			if (Solitare.tableau[i].canTake(topCard)) {
				Solitare.tableau[i].push(topCard);
				return;
			}
		}
		// else put it back on our pile
		push(topCard);
		
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

}