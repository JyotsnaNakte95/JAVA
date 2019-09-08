
public class YourObject {
	
	int x = 6;
	int a = 5;
	
	public void Clone()throws CloneNotSupportedException{
		
		YourObject t = new YourObject();
		t.a= 10;
		YourObject AnotherObject = new YourObject();
		AnotherObject.clone();

	}
	
	public int hashCode(){
		
		int code = System.identityHashCode( this );
		return code;
		
	}
	
	public String toString() {
		
		return "Inside YourObject's toString method!";
		
	}
	
	public boolean equals ( Object obj ) {
		
		//If the object is compared with itself then returns true  
        if ( obj == this ) {
            return true;
        }
 
        //Checks if obj is an instance of YourObject or not 
        if ( !( obj instanceof YourObject ) ) {
            return false;
        }
         
        //typecasts obj to YourObject so that we can compare data members 
        YourObject obj2 = ( YourObject ) obj;
         
        //Compares the data members and returns accordingly 
        return Integer.compare( this.x, obj2.x ) == 0
                && Integer.compare( this.a, obj2.a ) == 0;
		
	}
	
	public String getClassName() {
		
		String className = this.getClass().getSimpleName();
		return className;
		
	}
	
	public static void main ( String args[] ) {
		
		YourObject y1 = new YourObject();
		YourObject y2 = new YourObject();
		boolean a;
		int hashCode1 = y1.hashCode();
		a = y1.equals( y2 );
		System.out.println( a );
		y2.a = 6;
		int hashCode2 = y2.hashCode();
		System.out.println( hashCode1 );
		System.out.println( hashCode2 );
		a = y1.equals(y2);
		System.out.println( a );
		System.out.println( y1.getClassName() );
	}

}
