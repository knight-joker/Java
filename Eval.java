package day3;
import java.util.Date;  //导入Java.utilDate类
public class Eval {

	public static void main(String[] args) {
		Date date = new Date(); //创建Date对象date
		String year = String.format("%tY", date); //对date进行格式化
		String mouth = String.format("%tB", date); 
		String day = String.format("%td",date);
		System.out.println("今年是：" + year  + " 年");
		System.out.println("现在是：" + mouth);
		System.out.println("今天是：" + day + "号");
	}

}
