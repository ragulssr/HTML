package loops;

public class LoopExample {

	 public static void main(String[] args) {
		
		System.out.println("Starts");
		
	    /// loops -> for, while - do-while
	    for(int i=25;i>15;i--){
	      
		    System.out.println("Hi - for");
	    	
	    }
	    
	    int j=10;
	    while(j<10) { // pre condition check
	    	System.out.println("Hello - while");
	    	j++;
	    }
	    
	    int k=10; // post condition check
	    do{
	    	System.out.println("Hello - do-while");
	    	k++;
	    }while(k<10);
	    System.out.println("Ends");
	    
	 }
}
