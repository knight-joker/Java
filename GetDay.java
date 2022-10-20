package day3;

public class GetDay {

	public static void main(String[] args) {  //创建并初始化一堆数组
		int day[] = new int [] {31,28,31,30,31,30,31,31,20,31,30,31};
		for(int i = 0;i<12;i++) {  //输出循环的信息
			System.out.println((i+1) + "月有" + day[i] + "天");
		}
	}

}
