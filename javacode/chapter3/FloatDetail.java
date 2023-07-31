public class FloatDetail{	
 	public static void main(String[] args){
 		//Java 的浮点型常量(具体值)默认为double类型,声明float型常量,须后加'f' 或者 'F'
 		//float num1 = 1.1; //错误,将一个double类型存储到一个float类型中就会产生精度的损失
 		float num2 = 1.1F;//对
 		double num3 = 1.1;//对
 		double num4 = 1.1f;//对

 		//十进制数形式 :如:5.12  512.0f   .512(必须有小数点)
 		double num5 = .123;//等价于0.123
 		System.out.println(num5);

 		//使用科学计数法形式:如:5.12e2[5.12 * 10的2次方]
 		//5.12E-2 [5.12 * 10 的-2次方]
 		System.out.println(5.12e2);//因为存的是double类型的数字,默认在个位后面加上小数点
 		System.out.println(5.12E-2);

 		//通常情况下,应该使用double类型,因为它比float型更加的精确
 		// double num9 = 2.1234567851;float num10 = 2.123456781F
 		double num9 = 2.1234567851;
 		float num10 = 2.123456781F;
 		System.out.println(num9);
 		System.out.println(num10);//在float下面会产生精度缺失

 		//浮点数的使用陷阱: 2.7 和 8.1 / 3 比较
 		//看看一段代码
 		double dnum1  = 2.7;
 		double dnum2 = 8.1 / 3;
 		System.out.println(dnum1);
 		System.out.println(dnum2);
 		//2.7
		//2.6999999999999997 计算得出的结果并不等于2.7
		
		//得到一个重要的使用点:当我们对运算结果是小数的进行相等判断是,要小心
		//计算机小数的确定,应该是以两个数的差值的绝对值,在某一个精度范围内来判断
		if (dnum1 == dnum2) {
			System.out.println("相等");		
		}

		//正确的写法
		if(Math.abs(dnum1 - dnum2) < 0.000001) {
			System.out.println("差值非常的小,到我的规定精度,认为相等...");
		}
		System.out.println(Math.abs(dnum1 - dnum2));

		//细节:如果是直接查询得到的小数或者直接赋值,是可以判断相等的
 }
}