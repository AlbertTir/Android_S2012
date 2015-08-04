public class helloworld {
//after creating a jar executable, it can be run in terminal by using the command java-classpath filename.jar projectname/packagename
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		int i = 0;
		int[] numArray; //this declares an array of integers
		numArray = new int[10]; //this allocates memory for the array, this sets 10 slots
		
		for(i = 0; i<10; i++){
			System.out.println("i = " + i);
			numArray[i] = i;
			System.out.println("numArray = " + numArray[i]); //not sure why i need to do the " " part, if I don't, it highlights all the numArrays
		}
		
		
	}
}