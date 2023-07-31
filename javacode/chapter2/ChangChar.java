public class ChangChar{
	public static void main(String[] args){
		// \t :制表符
		System.out.println("北京\t天津\t上海");
		
		//  \n :换行符
		System.out.println("jack\nsmith\nmary");
		
		//  \\ :一个\ 路径中的\必须需要转义才能表示出来
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		
		//  \" :一个"  
		System.out.println("老韩说:\"要好好学习java,有前途\"");
		
		//  \' :一个'  
		System.out.println("老韩说:\'要好好学习java,有前途\'");
		
		//  \r :一个回车,回车的基本处理是将光标顶到语句的最前面
		//  输出敖宸闻学java后,光标移动到最前面,继续输入还可以,敖宸闻这三个字就会被替换
		System.out.println("敖宸闻学java\r还可以");
		// 如果要实现回车换行的结果 ,我们需要使用\r\n
		System.out.println("敖宸闻学java\r\n还可以");

	} 
}