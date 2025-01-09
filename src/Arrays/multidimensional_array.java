package Arrays;

public class multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0] = 2;		
		a[0][1] = 3;
		a[0][2] = 4;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		
		int b[][] = {{9,5,7,1}, {9,7,2,3},{7,0,1,1}};
		
		for(int i =0; i<a.length;i++)
		// Number of rows 
			{
			for(int j=0;j<a[0].length;j++)
				// Number of columns in the first row
			{
				System.out.println(a[i][j]);
			}
		}
				
	}

}


/* 
 rows = x axis    
 columns = y axis 
 
 2 3 4
 5 6 7 
  
 */
