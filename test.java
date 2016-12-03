package test;

import org.junit.Test;

public class TestDemo {
 @Test
 public  void Test()
 {
	 demo dem=new demo();
	 demo.Calculator("1,4+3,4");
	 demo.fracAdd(1, 2, 1, 2);
	 demo.fracSub(1, 2, 3, 8);
	 demo.fracMul(1, 2, 1, 2);
	 demo.fracDiv(1, 2, 1, 5);
 }
 
}
