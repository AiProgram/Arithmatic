package mainFun;

import java.util.Scanner;

public class endFun {
	
	int wrong,right;
	//��ȡ������ж϶Դ�
	public void outAndFinish(create c)
	{
		right=wrong=0;
		
		String str1=null;
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<c.anser.length;i++)
		{
			System.out.println("�������"+(i+1)+"���:");
			str1=scanner.next();
			if(str1.equals("e"))
			{
				System.out.println("�˳�");
				System.out.println("����"+right+"�⣻����"+wrong+"��");
				break;
				
			}
			else
			{
				int temp=Integer.parseInt(str1);
				if(temp==c.anser[i])
				{
					System.out.println("��ϲ�㣬����ȷ��");
					right++;
				}
				else
				{
					System.out.println("��ż���𰸴���");
					wrong++;
				}
				
				
			}
		}
		
		
	}

}
