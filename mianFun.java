

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
	//��ȡ��Ŀ������ģʽ���������ʽ
	public void readAndCreate() throws NumberFormatException, ScriptException
	{
		String str1,str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������Ŀ����:");
		str1=scanner.next();
		System.out.println("��ѡ��ģʽ(1����������;2����������;3:���������):");
		str2=scanner.next();
		int n=Integer.parseInt(str1);
		int pattern=Integer.parseInt(str2);
		SimpleCaculator sc=new SimpleCaculator();
		sc.createAndResult(Integer.parseInt(str1), Integer.parseInt(str2));
		for(int i=0;i<Integer.parseInt(str1);i++)
		{
			System.out.println(sc.biaodashi[i]);
		}
		//������ʽ
//		 c=new create();
//		c.shuchu(Integer.parseInt(str1),Integer.parseInt(str2));
		
        int right=0;int wrong=0;
		
		String str12=null;
		Scanner scanner1=new Scanner(System.in);
		for (int i=0;i<Integer.parseInt(str1);i++)
		{
			System.out.println("�������"+(i+1)+"���:");
			str12=scanner1.next();
			if(str12.equals("e"))
			{
				System.out.println("�˳�");
				System.out.println("����"+right+"�⣻����"+wrong+"��");
				break;
				
			}
			else
			{
				String temp=str12;
				if(temp.equals(sc.anser[i]))
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
		
		System.out.println("�˳�");
		System.out.println("����"+right+"�⣻����"+wrong+"��");
		
		
	}
	
	
	

}
