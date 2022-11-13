package day26;

import java.util.Scanner;

public class Test {
	//这是一个main方法，是程序的入口
	public static void main(String args[]) {
		//实现一个功能类：键输入两个数，求商
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 =  sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();
		System.out.println(num1/num2);
	}

}
