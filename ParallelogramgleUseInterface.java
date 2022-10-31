package day13;  
interface drawTest{   //定义接口
	public void draw();  //定义方法
}
//定义平行四边形类，改类继承了四边形类，并实现了drawTest接口
 class ParallelogramgleUseInterface extends QuadrangleUseInterfsce
 			implements drawTest{
	 	public void draw() {
		//由于该类实现了接口，所以需要覆盖draw()方法
		System.out.println("平行四边形.draw()");
	}
	public void doAnyThing() {
		//SomeSentence
	}

}
