import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;



/*
 * 
 * 
 * 这是计算普通四则运算的类,输入运算式，返回int型答案的字符串
 */
public class SimpleCaculator {
		public String cacluate(String input) throws ScriptException{
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			Object result = engine.eval(input);
			
			return  new Integer(new Double((double)result).intValue()).toString();
		}	
}
