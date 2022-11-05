package day18;

public class Project {
	private int age;
	private String name;
	private double height;
	public void  setage(int age) {
		this.age = age;
		System.out.println(age);
	}
	public void setname(String name) {
		this.name  = name;
	}
	public double getheight() {
		System.out.println(height);
		return height;
	
	}
	public void setheight(double height) {
		this.height = height;
		System.out.println(height);
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}

}
