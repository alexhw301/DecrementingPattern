/**
 * 
 * @author Robert Fernandez Romero
 * @version 1.0
 */
public class main {

	public static void main(String[] args) {
		int max = 4; //max value within the plot
		int size = 7;
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = max; //initializing array to all 4's
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]); //just printing out every value
		}
		System.out.print("\n");
		
		pattern(array, size-2);
	}
	
	/**
	 * The recursive method that does all the work of decrementing the values
	 * @param intArray
	 * @param subsection
	 */
	static void pattern(int[] intArray, int subsection) {
		int ends = (intArray.length - subsection) / 2; //the size of front end and back end that won't be modified
		
		int[] newArray = new int[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			newArray[i] = intArray[i]; //just copying the param array into a new array
		}
		
		for (int i = ends; i < newArray.length - ends; i++) {
			newArray[i] = newArray[i] - 1; //decrementing the subsection of array by 1
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]); //printing new modified array
		}
		System.out.print("\n");
		
		if(subsection - 2 > 0) { //can't work on a subsection smaller than 1
			pattern(newArray, subsection-2); //need to work on a subsection 2 less than before, recursive call
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]); //printing original param array after recursion
		}
		System.out.print("\n");
	}

}
