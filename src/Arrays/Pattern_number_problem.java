package Arrays;

public class Pattern_number_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 2 3 4
		//5 6 7
		//8 9
		//10
		
//		int k = 1;
//		for (int i=0; i<4; i++) {
//			
//			for(int j=0; j<(4-i); j++) {
//				System.out.print(k + "\t");
//				k++;
//			}
//			System.out.println("");
//		}	
		
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10

//				int k =1;
//		for(int i = 0; i<4; i++)
//		{
//			for(int j=0 ; j<=i; j++) {
//				System.out.print(k + "\t");
//				k++;
//			}
//			System.out.println(" ");
//		}
		
//		1 
//		1 2
//		1 2 3
//		1 2 3 4
		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print((j+1) + "\t");
//			}
//			System.out.println(" ");
//		}
		
//		3
//		6  9
//		12 15 18
//		21 24 27 30
		int k = 3;
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(k + "\t");
				k += 3;
			}
			System.out.println(" ");
		}
		
	}
}

/* ChatGPT method : 
 
 //1 2 3 4
//5 6 7
//8 9
//10
 
 public class JaggedArrayWithLoops {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int count = 1; // Counter to fill the array dynamically

        // Create the jagged array
        int[][] jaggedArray = new int[n][];
        for (int i = 0; i < n; i++) {
            jaggedArray[i] = new int[n - i]; // Each row has decreasing length
        }

        // Fill the jagged array with consecutive numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = count++;
            }
        }

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
 */