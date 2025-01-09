package function_overloading_over_riding;

public class function_overloading {
	/* -> function overloading
	 -> either argument count should be different or argument data type should be different
	 */
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		function_overloading ol = new function_overloading();
		ol.getData(2);
		ol.getData("Shadow");
		ol.getData(10, 19);
	}

}
