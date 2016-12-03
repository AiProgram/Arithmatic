package mainFun;

import java.util.Scanner;

public class endFun {
	
	int wrong,right;
	//读取结果并判断对错
	public void outAndFinish(create c)
	{
		right=wrong=0;
		
		String str1=null;
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<c.anser.length;i++)
		{
			System.out.println("请输入第"+(i+1)+"题答案:");
			str1=scanner.next();
			if(str1.equals("e"))
			{
				System.out.println("退出");
				System.out.println("对了"+right+"题；错了"+wrong+"题");
				break;
				
			}
			else
			{
				int temp=Integer.parseInt(str1);
				if(temp==c.anser[i])
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
		
		
	}

}
