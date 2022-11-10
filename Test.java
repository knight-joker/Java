package day22;

public class Test {
	public static void main(String[] args) {
		cat c = new cat();
		girl g = new girl();
		g.play(c);
		Dog d =new Dog();
		g.play(d);
		animal an = c;
		//animal an = new animal();
		g.play(an);
	}
}
