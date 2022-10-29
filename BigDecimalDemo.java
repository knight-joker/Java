package day11;

import java.math.BigDecimal;

public class BigDecimalDemo {
	static final int locatin = 10;
	/**
	 * 定义加法方法，参数为加数与被加数
	 * 
	 */
	public BigDecimal add(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	/**
	 * 
	 * 定义减法方法
	 */
	public BigDecimal sub(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);
	}
	/**
	 * 
	 * 定义乘法方法
	 */
	public BigDecimal mul(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}
	/**
	 * 
	 * 定义除法方法
	 */
	public BigDecimal div(double value1,double value2,int b) {
		if(b<0) {
			System.out.println("b的值必须大于等于0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.divide(b2,b,BigDecimal.ROUND_HALF_UP);
	}
	public static void main(String[] args) {
		BigDecimalDemo b = new BigDecimalDemo();
		System.out.println("两个数字相加结果：" + b.add(-7.5,8.9));
		System.out.println("两个数字相减结果：" + b.sub(-7.5,8.9));
		System.out.println("两个数字相乘结果：" + b.mul(-7.5,8.9));
		System.out.println("两个数字相除，结果小数保留后10位：" + b.div(7.5,8.9,10));
		System.out.println("两个数字相除，结果小数保留后5位：" + b.div(-7.5,8.9,5));
	}

}
