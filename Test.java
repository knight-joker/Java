package pag2;

public class Test {
	public static void main(String[] args) {
		HumenBeing zs = new HumenBeing();
		zs.name = "张三";
		zs.age = 18;
		zs.height = 180.0;
		zs.weight = 170.4;
		HumenBeing ls = new HumenBeing();
		ls.name = "李四";
		ls.age = 19;
		ls.height = 156.0;
		ls.height = 100.0;
		System.out.println(zs.name);
		System.out.println(ls.age);
		zs.eat();
		ls.eat();
		zs.sleep("教室");
		System.out.println(zs.introduce());
		}
	HumenBeing sz = new HumenBeing();

}
