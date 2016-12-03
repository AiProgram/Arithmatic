import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;





/*
 * 
 * 
 * 这是计算普通四则运算的类,输入运算式，返回int型答案的字符串

 */


public class SimpleCaculator {
	
	String [] biaodashi;
	String [] anser;
	
	//调用
	public void createAndResult(int num,int type) throws ScriptException
	{
		biaodashi=new String[100];
		anser=new String[100];
		for(int i=0;i<num;i++)
		{
			String an;
			String s;
			RandMath random=new RandMath();
			if(type==1){
			random.SetPattern(0);
			random.SetSubjectPatterm(0);
			s=random.CreatSubject();
			an=cacluate(s);
			}
			else if(type==2){
				
					random.SetPattern(1);
					random.SetSubjectPatterm(0);
					s=random.CreatSubject();
					an=cacluate(s);
			}
			else {
				random.SetPattern(1);
				random.SetSubjectPatterm(1);
				s=random.CreatSubject();
				an=demo.Calculator(s);
			}
			
			//
			biaodashi[i]=s;
			anser[i]=an;
		}
		
		
		
		
	}
	
	
	public String cacluate(String input) throws ScriptException{
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			Object result = engine.eval(input);
			
			return  new Integer(new Double((double)result).intValue()).toString();
		}	
}
