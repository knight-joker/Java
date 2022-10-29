package day11;
import java.math.BigInteger;
public class BIgIntegerDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BigInteger biginstance = new BigInteger("4");
		System.out.println("加法操作" 
				+ biginstance.add(new BigInteger("2")));
		System.out.println("减法操作" 
				+ biginstance.subtract(new BigInteger("2")));
		System.out.println("乘法操作" 
				+ biginstance.multiply(new BigInteger("2")));
		System.out.println("除法操作" 
				+ biginstance.divide(new BigInteger("2")));
		System.out.println("取商操作" 
				+ biginstance.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println("取余数操作" 
				+ biginstance.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println("做2次方操作" 
				+ biginstance.pow(2));
		System.out.println("取相反数操作" 
				+ biginstance.negate());
	}

}
