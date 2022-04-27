package OOPS;

public class Encapsulation {
           // Access modify
	int id; // default -> within package
	public String ame = "ragul"; // anywhere access
	private int age = 23; //within class
	protected int Mark = 100; // outside package (only for subclass).

}

 /*     
                                   same class      same package       outside(subclass)        outside(nonsubclass)
     
      private							Y				N					N              				N
      
      default							Y				Y					N							N
      
      protected							Y				Y					Y							N
      
      public							Y				Y					Y							Y
  */