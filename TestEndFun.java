package mainFun;

import org.junit.Test;

public class TestEndFun {

	@Test
	public void testendFun()
	{
		mianFun m=new mianFun();
		m.readAndCreate();
		endFun e=new endFun();
		e.outAndFinish(m.c);
	}
}
