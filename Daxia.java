package Day31;


public class Daxia {
 String name;
 String waihao;
 int age;
 String bangpai;
 
 //我们需要两个构造方法
 public Daxia(String name, int age, String bangpai)
 {
  this.name = name;
  this.age = age;
  this.bangpai = bangpai;
  System.out.println(name + age + bangpai);
 }
 
 public Daxia(String name, int age, String bangpai, String waihao)
 {
  this(name, age, bangpai);
  System.out.println(this.waihao);
 }

 public static void main(String[] args)
 {
  //岳不群
  Daxia dx1 = new Daxia("岳不群", 18, "华山派");
 
  //武松
  Daxia dx2 = new Daxia("武松", 19, "梁山", "行者");
 }
}