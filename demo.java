

import java.util.Arrays;

public class demo {


	static String Calculator(String str){
		String str1=str;
		str1=str1.replace('-', '^');
		String[] strArray=str1.split("[+ ^ * / ,]");
		/*String[] strArray1=new String[4];
		String[] numbers=new String[4];
		int m=0;
		int n=0;
		for(int i = 0; i < strArray.length; i++){
			strArray1=strArray[i].split(",");
			for(String s:strArray1){
	            System.out.println(s);
	            numbers[n++]=s;
	        }
		}*/
		int[] ints=new int[4];
		int a;
		int b;
		int c;
		int d;
		for(int i=0;i<4;i++)
		{
			ints[i]=(new Integer(strArray[i]).intValue());
		}
	    a=ints[0];
		b=ints[1];
		c=ints[2];
		d=ints[3];
		String s="";
		if(str1.indexOf("+")>=0)
		{
		    s=fracAdd(a,b,c,d);
		}
		if(str1.indexOf("^")>=0)
		{
			s= fracSub(a,b,c,d);
		}
		if(str1.indexOf("*")>=0)
		{
			s=fracMul(a,b,c,d);
		}
		if(str1.indexOf("/")>=0)
		{
			s=fracDiv(a,b,c,d);
		}
		
		return s;
	}
	
	static String fracAdd(int first_numerator,int first_denominator,int second_numrator,int second_denominator){  
        //以下代码能够在控制台上显示结果  
        //需要调用求最大公约数的函数  
        //需要调用求最小公倍数的函数  
        int denominator;  
        int numerator;  
          
        if(first_denominator==second_denominator)  //分母相同时加分子       
        {        
             denominator=first_denominator;        
             numerator=first_numerator+second_numrator;        
        }        
        else  //否则同分比较分子       
        {        
            denominator=first_denominator*second_denominator;        
            numerator=first_numerator*second_denominator+first_denominator*second_numrator;        
        }      
        int gcd = gcd(numerator,denominator);  
        denominator = denominator / gcd;  
        numerator = numerator / gcd;          
        System.out.println("输出的结果是"+numerator+"/"+denominator);   
        return numerator+"/"+denominator;        
  
    }  
    static String fracSub(int first_numerator,int first_denominator,int second_numrator,int second_denominator){  
        //以下代码能够在控制台上显示结果  
        //需要调用求最大公约数的函数  
          
        int denominator;  
        int numerator;  
          
        if(first_denominator==second_denominator)  //分母相同时加分子       
        {        
             denominator=first_denominator;        
             numerator=first_numerator-second_numrator;        
        }        
        else  //否则同分比较分子       
        {        
            denominator=first_denominator*second_denominator;        
            numerator=first_numerator*second_denominator-first_denominator*second_numrator;        
        }      
        int gcd = gcd(numerator,denominator);  
        denominator = denominator / gcd;  
        numerator = numerator / gcd;          
        System.out.println("输出的结果是"+numerator+"/"+denominator);   
        return numerator+"/"+denominator;        
  
    }  
    static String fracMul(int first_numerator,int first_denominator,int second_numerator,int second_denominator){  
        //以下代码能够在控制台上显示结果  
        //需要调用求最大公约数的函数  
          
        int denominator;  
        int numerator;  
          
         
            denominator=first_denominator*second_denominator;        
            numerator=first_numerator*second_numerator;   
            
        int gcd = gcd(numerator,denominator);  
        denominator = denominator / gcd;  
        numerator = numerator / gcd;          
        System.out.println("输出的结果是"+numerator+"/"+denominator);   
        return numerator+"/"+denominator;        
  
    }  
    static String fracDiv(int first_numerator,int first_denominator,int second_numerator,int second_denominator){  
        //以下代码能够在控制台上显示结果  
        //需要调用求最大公约数的函数  
          
        int denominator;  
        int numerator;  
          
        numerator = first_numerator*second_denominator;  
        denominator = first_denominator*second_numerator;  
          
              
            
        int gcd = gcd(numerator,denominator);  
        denominator = denominator / gcd;  
        numerator = numerator / gcd;          
        System.out.println("输出的结果是"+numerator+"/"+denominator);   
        return numerator+"/"+denominator;        
  
    }
    static int gcd(int x,int y){  
        int r;        
           while( y!= 0)        
           {        
               r = x%y;        
               x = y;        
               y = r;        
           }        
 
       return x;
    }
}
