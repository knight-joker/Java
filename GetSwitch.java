package k;

public class GetSwitch {

	public static void main(String[] args) {
		int week = 2;	//定义int型变量week
		switch(week) {	 //	指定Switch语句的表达式为变量week
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Sorry,I don't Know");
		}
	
	}

}
