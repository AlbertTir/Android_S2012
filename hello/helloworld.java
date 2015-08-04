public class helloworld{ //note that the name of the class has to be the name of the file too, everything has to be the same, even capitalization
	
	public static void adding(){ //looks like these will be how I make functions
		int i = 0;
		
		
		for(i = 0; i<10; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args){
		
		adding();
		
		int i = 10;
		int j = 20;
		int k = 0;
		
		System.out.println( " i+ j = " + (i+j));
		
		for(k = 0; k < 10; k++){
			//System.out.println(k);	
		}
		
		k = 0;
		
		do{
			System.out.println(k);
			++k;
			
		}while(k < 10);
		
	}
}
