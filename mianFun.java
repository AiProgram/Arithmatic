

import java.util.Scanner;

import javax.script.ScriptException;

public class mianFun {
	
	//create c;
	public static void main(String[] args) throws NumberFormatException, ScriptException {
		// TODO Auto-generated method stub

		mianFun m=new mianFun();
		m.readAndCreate();
		endFun e=new endFun();
//		e.outAndFinish(m.c);
		
	}
	
	//System.
	//读取题目数量和模式，产生表达式
	public void readAndCreate() throws NumberFormatException, ScriptException
	{
		String str1,str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入题目数量:");
		str1=scanner.next();
		System.out.println("请选择模式(1代表单则运算;2代表混合运算;3:真分数运算):");
		str2=scanner.next();
		int n=Integer.parseInt(str1);
		int pattern=Integer.parseInt(str2);
		SimpleCaculator sc=new SimpleCaculator();
		sc.createAndResult(Integer.parseInt(str1), Integer.parseInt(str2));
		for(int i=0;i<Integer.parseInt(str1);i++)
		{
			System.out.println(sc.biaodashi[i]);
		}
		//输出表达式
//		 c=new create();
//		c.shuchu(Integer.parseInt(str1),Integer.parseInt(str2));
		
        int right=0;int wrong=0;
		
		String str12=null;
		Scanner scanner1=new Scanner(System.in);
		for (int i=0;i<Integer.parseInt(str1);i++)
		{
			System.out.println("请输入第"+(i+1)+"题答案:");
			str12=scanner1.next();
			if(str12.equals("e"))
			{
				System.out.println("退出");
				System.out.println("对了"+right+"题；错了"+wrong+"题");
				break;
				
			}
			else
			{
				String temp=str12;
				if(temp.equals(sc.anser[i]))
				{
					System.out.println("恭喜你，答案正确！");
					right++;
				}
				else
				{
					System.out.println("啊偶，答案错误");
					wrong++;
				}
				
				
			}
		}
		
		System.out.println("退出");
		System.out.println("对了"+right+"题；错了"+wrong+"题");
		
		
	}
	
	
	

}
