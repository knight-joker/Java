package pag2;

public class Person1 {
	
	String name;
	int age;
	double height;
	double weight;
	
	public void eat() {
		System.out.println("我喜欢吃饭");
	}
	public void sleep(String address) {
		System.out.println("我在" + address + "睡觉");
	}
	public String introduce() {
		return "我的名字是:" + name + ",我的年龄是：" + age + ",我的身高是：" + height + "我的体重是：" + weight;
	}

	public Person1() {
	}
	
	public Person1(String a,int b,double c,double d) {
		name = a;
		age = b;
		height = c;
		weight = d;
	}
	
	public static void main(String[] args) {
		
	}

}
