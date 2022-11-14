package day27;

import java.util.Scanner;

public class Test {
	public static void main(String aargs[]) {
		//实现一个功能：两个数相除时，当除数为0时程序出现异常。
		devide();
	}
	public static void devide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入第一个数：");
		int num1 = sc.nextInt();
		System.out.println("请录入第二个数：");
		int num2 = sc.nextInt();
		if(num2  == 0) {
			try {
				throw new Exception();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("商：" + num1/num2);
			
		}
	}

}
