package day2;

public class Division {

	public static void main(String[] args) {
		String str = "192.168.0.1";
		String[] fristArray = str.split("\\.");
		String[] secondArray = str.split("\\.",2);
		System.out.println("str的原值为：[" + str +"]");
		System.out.print("全部分割的结果");
		for(String a : fristArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
		System.out.print("两次分割的结果");
		for(String a : secondArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
	}
}
