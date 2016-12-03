import org.junit.Test;


public class TestRandMath {
	@Test
	public void TestCreatMath()
	{
		
		RandMath randMath=new RandMath();
		//randMath.SetPattern(1);
		randMath.SetPattern(0);
		randMath.SetSubjectPatterm(0);
		System.out.println(randMath.CreatMath(1));
		
		
	}
	
	public void TestCreatSubject()
	{
		RandMath randMath=new RandMath();
		randMath.SetPattern(1);
		randMath.SetSubjectPatterm(0);
		System.out.println(randMath.CreatSubject());
	}
	

}
