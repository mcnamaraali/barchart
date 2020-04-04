
public class BarChart {

	public static void main(String[] args) {
		
		//initialiser list specifies the initial value for each element
				int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
				
				System.out.println("Grade distribution");
			
				//output for each array element's value
				for (int counter = 0; counter < array.length; counter++) {
					
					//if counter is equal to 10
					if(counter==10) {
						System.out.printf("%5d: ", 100);
					}
					else {
						System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
					}
					
					for (int stars = 0; stars < array [counter]; stars++) {
						System.out.print("*");
					}

					System.out.println();
					
				
					
				}

	}

}
