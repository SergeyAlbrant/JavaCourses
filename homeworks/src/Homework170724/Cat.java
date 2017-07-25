package Homework170724;

public class Cat implements Pet{

	private Brain brain = new Hungry();
	
	private class Hungry implements Brain {

		@Override
		public void feed() {
			meow();
			eat();
			purr();
			meow();
			brain = new Fed();
		}

		@Override
		public void play() {
			meow();
			hiss();
			meow();
		}

		@Override
		public void wash() {
			hiss();
			hiss();
			meow();
			hiss();
			
		}

		@Override
		public void comb() {
			meow();
			hiss();
		}
		
	}
	
	private class Fed implements Brain {

		@Override
		public void feed() {
			meow();
			meow();
		}

		@Override
		public void play() {
			meow();
			purr();
			meow();
			brain = new Hungry();
		}

		@Override
		public void wash() {
			meow();
			hiss();
			brain = new Hungry();
		}

		@Override
		public void comb() {
			purr();
			meow();
			purr();
			brain = new Hungry();
		}
		
	}
	
	@Override
	public void feed() {
		brain.feed();
	}

	private void hiss() {
		System.out.println("hiss");
		
	}

	private void eat() {
		System.out.println("eats");
	}

	private void purr() {
		System.out.println("purr");
	}

	private void meow() {
		System.out.println("meow");
	}

	@Override
	public void play() {
		brain.play();
	}

	@Override
	public void wash() {
		brain.wash();
	}

	@Override
	public void comb() {
		brain.comb();
	}

	
}
