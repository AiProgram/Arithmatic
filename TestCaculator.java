import static org.junit.Assert.*;

import javax.script.ScriptException;

import junit.framework.Assert;

import org.junit.Test;


public class TestCaculator {

	@Test
	public void test() throws ScriptException {
		SimpleCaculator cacl=new SimpleCaculator();
		Assert.assertEquals(cacl.cacluate("5+2-12"), "-5");
		Assert.assertEquals(cacl.cacluate("40/8+5"), "10");
		Assert.assertEquals(cacl.cacluate("(10+5)*2"), "30");
	}

}
