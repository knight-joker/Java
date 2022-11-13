package day26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		//实现一个功能：通过键盘录入两个数，求商
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请录入第一个数：");
			int num1 = sc.nextInt();
			System.out.println("请录入第二个数：");
			int num2 = sc.nextInt();
			System.out.println("商：" + num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("对不起，除数不能为0");
		}catch(InputMismatchException e) {
			System.out.println("对不起，你录入的数据不是int类型的数据");
		}finally {
			System.out.println("-----谢谢你使用了计算机----");
		}
		
	}

}
