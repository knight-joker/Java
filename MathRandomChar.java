package day11;

public class MathRandomChar {
	public static char GetRandomChar(char char1,char char2) {
		return (char)(char1 + Math.random()*(char2-char1+1));
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("任意小写字符" + GetRandomChar('a','z'));
		System.out.println("任意大写字符" + GetRandomChar('A','Z'));
		System.out.println("0~9之间的数字" + GetRandomChar('0','9'));

	}

}
