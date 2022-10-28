/**
 * 
 */
package day10;

import java.text.DecimalFormat;

/**
 * @author 范清斌
 *
 */
public class DecimalMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(2);
		String output = myFormat.format(123456.789);
		System.out.println("将数字以每两个数字分组" + output);
		myFormat.setGroupingUsed(false);
		String output2 = myFormat.format(123456.789);
		System.out.println ("不允许数字分组" + output);
		
	}

}
