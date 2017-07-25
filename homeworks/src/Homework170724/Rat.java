package Homework170724;


public class Rat implements Brain {

	Brain brain = new Hungry(this);
	
	@Override
	public void feed() {
		brain.feed();
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

	void teethClac() {
		System.out.println("clac-clac");
	}

	void eat() {
		System.out.println("eats");
	}

	void scratch() {
		System.out.println("scratches");
	}

	void clapEyes() {
		System.out.println("clap-clap");
		
	}

}

class Hungry implements Brain{

	private Rat rat;

	public Hungry(Rat rat) {
		this.rat = rat;
	}
	
	@Override
	public void feed() {
		rat.teethClac();
		rat.eat();
		rat.teethClac();
		rat.brain = new Fed(rat);
		
	}

	@Override
	public void play() {
		rat.teethClac();
		rat.scratch();
	}

	@Override
	public void wash() {
		rat.teethClac();
		rat.scratch();
		rat.teethClac();
	}

	@Override
	public void comb() {	
		rat.scratch();
		rat.teethClac();
		rat.clapEyes();
	}
}
	
	
class Fed implements Brain{

	private Rat rat;

	public Fed(Rat rat) {
		this.rat = rat;
	}
	
	@Override
	public void feed() {
		rat.teethClac();
		rat.teethClac();
	}

	@Override
	public void play() {
		rat.teethClac();
		rat.clapEyes();
		rat.brain = new Hungry(rat);
	}

	@Override
	public void wash() {
		rat.teethClac();
		rat.clapEyes();
		rat.teethClac();
		rat.brain = new Hungry(rat);
	}

	@Override
	public void comb() {
		rat.clapEyes();
		rat.teethClac();
		rat.brain = new Hungry(rat);
	}
}
