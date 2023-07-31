public class VarDetail{	
 	public static void main(String[] args){
 	//声明一个叫做a的变量
 	int a = 50;
 	System.out.println(a);
 	//该区域的数据/值可以在同一个类型范围内不断地变化
 	//a = "jACK"
 	a = 88;
 	System.out.println(a);

 	//变量不能在同一个作用域内重名
 	//int a = 77;
 	}
}

class Dog {
	public static void main(String[] args){
		//不同作用域
		int a = 1000;
		System.out.println(a);
	}
}