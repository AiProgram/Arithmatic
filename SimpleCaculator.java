import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;



/*
 * 
 * 
 * ���Ǽ�����ͨ�����������,��������ʽ������int�ʹ𰸵��ַ���
 */
public class SimpleCaculator {
		public String cacluate(String input) throws ScriptException{
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			Object result = engine.eval(input);
			
			return  new Integer(new Double((double)result).intValue()).toString();
		}	
}
