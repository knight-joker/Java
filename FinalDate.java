package pag1;
import static java.lang.System.out;
import java.util.Random;

class Test{
	int i = 0;
}
public class FinalDate {
	static Random rand = new Random();
	private final int value1 = 9;        //声明一个final常量
	private static final int value2 = 10;   //声明一个final，static常量
	private static Test test = new Test();     // 声明一个final引用
	private Test test2 = new Test();           // 声明一个不是final的引用
	private final  int[] a = {1,2,3,4,5,6};
	private final int i4 = rand.nextInt(20);
	private static final int i5 = rand.nextInt(20);
	public String toString() {
		return i4 + " " + i5 + " ";
	}
	public static void main(String[] args){
		FinalDate date = new FinalDate();
		date.test2 = new Test();
		//date.value2++;
		date.test2 = new Test();
		//for(int i = 0; i < date.a.length;i++) {
		//--	a[i] = 9;
		//}
		out.println(date);
		out.println("date2");
		out.println(new FinalDate());
		out.println(date);
		
	}
}
