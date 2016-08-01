public class ExceptionTest {

	public static void main (String[] args) {
		try {
			System.out.println(divide());
		} catch (Exception e) {
			System.out.println(e);
		}
	} 
    public static int divide() throws Exception
    {
		return 10/0;
    	
    }
}
