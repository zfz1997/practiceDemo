package practiceDemo;

public class TestStatic {
	
	    static{
		c=3;
		// 此处编译不通过。 1
		// System.out.println(c);
		// 此处编译可以通过。2 
		System.out.println(TestStatic.c);
		}
		private static int c;
		
	
}
