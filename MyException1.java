package day23;

public class MyException1 extends Exception{
	String message;
	public MyException1(String ErrorMessagr) {
		message = ErrorMessagr;
	}
	public String getMessage() {
		return message;
	}

}
