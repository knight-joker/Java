/**
 * 
 */
package day3;

/**
 * @author 范清斌
 *
 */
public class Trap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int b[][] = new int [][] {{1},{2,3},{4,5,6}};
		for(int k = 0;k<b.length;k++) {
			for(int c = 0;c<b[k].length;c++) {  //循环游历二维数组的每一个元素，并且打印
				System.out.print(b[k][c]);
			}
			System.out.println();
		}
	}

}
