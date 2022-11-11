package day23;

public class MyException extends Exception {//继承Exception类
	public MyException(String ErrorMessage) {// 构造方法
		super(ErrorMessage);//父类构造方法
	}

}
