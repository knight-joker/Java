package day3;
public class Jerque {
	public static void main(String[] args) {
		String str = "";  //创建空的字符串
		long starTime = System.currentTimeMillis();
		for(int i = 0; i<100000;i++) { //利用for循环执行10000次操作
			str = str+1;    // 循环追加字符串
			
		}
		long endTime = System.currentTimeMillis();  //定义对字符串操作后的时间
		long time = endTime - starTime;      //计算对字符串执行操作的时间
		System.out.println("String 消耗时间：" + time);    //将执行的时间输出
		StringBuilder builder = new StringBuilder("");   //创建字符串生成器
		starTime = System.currentTimeMillis();  //定义操作执行前的时间
		for(int j = 0;j<100000;j++) {   //利用for循环进行操作
			builder.append(j);    //  循环追加字符
		}
		endTime = System.currentTimeMillis();   //定义操作后的时间
		time = endTime - starTime;
		System.out.println("StringBudilder 消耗时间：" + time);
	}
}
