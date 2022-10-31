package day13;

public class Quadrangle {
	private Quadrangle[] qtest =  new Quadrangle[6];
	private int nextIndex = 0;
	public void draw(Quadrangle q) {  //定义draw()方法，参数为四边形对象
		if(nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		//实例化两个四边形对象，用于调用draw()方法
		Quadrangle q = new Quadrangle();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
	}
}

