package day13;

public class QuadrangleUseInterfsce {
	public void doAnyThing() {
		//SomeSentence
	}
	public static void main(String[] args) {
		drawTest[] d = {
		new SquareUseInterface(),new ParallelogramgleUseInterface()};
		for(int i = 0;i<d.length;i++) {
			d[i].draw();
		}
	}

}
