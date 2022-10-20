package day3;

public class General {

	public static void main(String[] args) {
		String str = String.format("%d", 400/2);  //将结果10进制化
		String str2 = String.format("%b", 3>5);  // 将结果以Boolean型显示
		String str3 = String.format("%x", 200);  // 将结果以16进制格式显示
		System.out.println("400的一半是：" + str);   // 输出
		System.out.println("3>5正确吗：" + str2);
		System.out.println("200的十六进制数是：" + str3);
	}

}
