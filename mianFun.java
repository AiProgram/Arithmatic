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
	//��ȡ��Ŀ������ģʽ���������ʽ
	public void readAndCreate()
	{
		String str1,str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������Ŀ����:");
		str1=scanner.next();
		System.out.println("��ѡ��ģʽ(1����������;2����������):");
		str2=scanner.next();
		//������ʽ
		 c=new create();
		c.shuchu(Integer.parseInt(str1),Integer.parseInt(str2));
		
	}
	
	
	

}
