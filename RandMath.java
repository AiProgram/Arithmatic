import java.util.Random;


public class RandMath {
	//ģʽ
	private int  pattern;
	//���ؽ��
	private String result;
	//����ģʽ
	private int subjectPatterm;
	//�����1
	private String operatorSymbol;
	//�����2
	private String operatorSymbol1;
	private int subjectSymbol;
	//����ģʽ 0 ��ģʽ 1���ģʽ
	public void SetPattern(int pattern)
	{
		this.pattern=pattern;
	}
	//�����Ƿ������ 0 ��ͨ�������� 1 �������������
	public void SetSubjectPatterm(int type)
	{
		
		this.subjectPatterm=type;
	}
	// ������ʽ
	public String CreatSubject()
	{
		Random ra =new Random();
		if(pattern==0)
		{
			
			result=CreatMath(1);
			return result;
		}
		else 
		{
			
			result="";
			switch(subjectPatterm)
			{
			case 0:
				result=result+CreatMath(1);
				int symbol=ra.nextInt(4);
				switch(symbol)
				{
				case 0:
					operatorSymbol1="+";
					break;
				case 1:
					operatorSymbol1="-";
					break;
				case 2:
					operatorSymbol1="*";
					if(operatorSymbol=="+"||operatorSymbol=="-")
					{
						result="("+result+")";
					}
					break;
				case 3:
					operatorSymbol1="/";
					if(operatorSymbol=="+"||operatorSymbol=="-")
					{
						result="("+result+")";
					}
					break;
				}
				result=result+operatorSymbol1;
				String math2=CreatMath(1);
				
				switch(operatorSymbol)
				{
					case "+":
						if(operatorSymbol1=="*"||operatorSymbol=="/")
						{
							if(subjectSymbol==1)
							{
								math2="("+math2+")";
							}
						}
						break;
					case "-":
						if(operatorSymbol1=="*"||operatorSymbol=="/")
						{
							if(subjectSymbol==1)
							{
								math2="("+math2+")";
							}
						}
						break;
					case "*":
						
						break;
					case "/":
						break;
				}
				result =result+math2;
				break;
			case 1:
				
				result=result+CreatMath(2);
				Creatoperator();
				result=result+operatorSymbol;
				result=result+CreatMath(2);
				break;
				
			}
				
		}
		return result;
		
	}
	//���������
	public void Creatoperator()
	{
		Random ra =new Random();
		switch(ra.nextInt(4))
		{
		case 0:
			operatorSymbol="+";
			break;
		case 1:
			operatorSymbol="-";
			break;
		case 2:
			operatorSymbol="*";
			break;
		case 3:
			operatorSymbol="/";
			break;
		}
	}
	//����������ʽ
	public String  CreatMath(int type)
	{
		Random ra =new Random();
		if(pattern==0)
		{
			Creatoperator();
			int x=ra.nextInt(11);
			int y=ra.nextInt(11);
			if(operatorSymbol=="/"&&y==0)
				y=ra.nextInt(10)+1;
			return ""+x+operatorSymbol+y;
		}
		else if(type==1)
		{
			subjectSymbol=ra.nextInt(4);
			if(subjectSymbol!=0)
			{
				
				Creatoperator();
				int x=ra.nextInt(11);
				int y=ra.nextInt(11);
				if((operatorSymbol=="/"&&y==0)||(operatorSymbol1=="/"&&y==0))
					y=ra.nextInt(10)+1;
				if(operatorSymbol1=="/")
				{
					if(x==0)x=ra.nextInt(10)+1;
				}
				return ""+x+operatorSymbol+y;
			}
			else
			{
				operatorSymbol="";
				int x=ra.nextInt(11);
				if(operatorSymbol1=="/")
				{
					if(x==0)x=ra.nextInt(10)+1;
				}
				return ""+x;
			}
		}
		else 
		{
			subjectSymbol=ra.nextInt(2);;
			if(subjectSymbol==1)
			{
				
				Creatoperator();
				int x=ra.nextInt(11);
				int y=ra.nextInt(11);
				if(operatorSymbol=="/"&&(y==0||y==1))
				{
					y=ra.nextInt(9)+2;
					return ""+x+","+y;
				}
					
				return ""+x+operatorSymbol+y;
			}
			else
			{
				operatorSymbol="";
				int x=ra.nextInt(11);
				return ""+x;
			}
		}
		
		
	}
	
	
	

}
