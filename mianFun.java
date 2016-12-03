package mainFun;

import java.util.Scanner;

public class mianFun {
	
	create c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mianFun m=new mianFun();
		m.readAndCreate();
		endFun e=new endFun();
		e.outAndFinish(m.c);
		
	}
	
	//System.
	//读取题目数量和模式，产生表达式
	public void readAndCreate()
	{
		String str1,str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入题目数量:");
		str1=scanner.next();
		System.out.println("请选择模式(1代表单则运算;2代表混合运算):");
		str2=scanner.next();
		//输出表达式
		 c=new create();
		c.shuchu(Integer.parseInt(str1),Integer.parseInt(str2));
		
	}
	
	
	

}
