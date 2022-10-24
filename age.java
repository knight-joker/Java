package k;

public class age {
	public static void main(String args[]) {
		try (java.util.Scanner s = new java.util.Scanner(System.in)) {
			int age = s.nextInt();
			System.out.println("hh");
			String str = "老年";
			if(age<0 || age>150)
			{
				str = "您提供的年龄不合法，请重新输入";
			}else if(age <=5) {
				str = "幼儿";
			}else if(age<=10) {
				str = "少年";
			}else if(age<=18) {
				str = "青少年";
			}else if(age<=35) {
				str = "青年";
			}else if(age<=55) {
				str = "壮年";
			}
			System.out.println("您处于生命周期的"+ str + "阶段");
		}
	}

}
