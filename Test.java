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
	
}
	
public class YourString extends YourObject {
	
	String s1;
	
	public YourString() {
		
		s1 = "There is no value of s1 assigned by user.";
		System.out.println( "This is first constructor without arguments." );
		
	}
	
	public YourString(String original) {
		
		s1 = original;
		System.out.println( s1 );
		
	}
	
	public char charAt(int index){
		
		char result = s1.charAt(index);
		return result;
		
	}
	
	public int compareTo( YourString AnotherString ) {
		
		if ( this.s1.compareTo( AnotherString.s1 ) == 0 )
			return 0;
		else if ( this.s1.compareTo( AnotherString.s1 ) < 0 )
			return -1;
		else 
			return 1;
		
	}
	
	public YourString concat( YourString obj ) {
		
		this.s1 = this.s1 + obj.s1;
		return this;
		
	}
	
	public boolean equals( Object anObject ) {
		
		//If the object is compared with itself then returns true
		if ( this == anObject )
			return true;
		
		//Checks if anObject is an instance of YourString or not
		if ( !( anObject instanceof YourString ) ) 
            return false;
		
		//typecasts obj to YourObject so that we can compare data members 
		YourString anObject2 = ( YourString ) anObject;
		
		//Compares the data members and returns accordingly 
		return Integer.compare( this.x, anObject2.x ) == 0
                && Integer.compare( this.a, anObject2.a ) == 0
                && this.s1.equals( anObject2.s1 );
		
	}
	
	public boolean isEmpty() {
		
		if ( s1.isEmpty() )
			return true;
		else 
			return false;
		
	}
	
	public String toString () {
		
		return "Inside YourString's toString method!";
		
	}
}


public class Test {
	
	public static void main ( String args[] ) {
		
		YourObject y1 = new YourObject();
		YourObject y2 = new YourObject();
		boolean a;
		YourString ys1 = new YourString();
		YourString ys2 = new YourString( "This is other constructor." );
		YourString ys3 = new YourString( "This is to find chars at "
		+ "various indices." );
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
		System.out.println( ys3.charAt( 16 ) );
		System.out.println( ys3.compareTo( ys2 ) );
		ys1 = ys1.concat( ys2 );
		System.out.println( ys1.s1 );
		System.out.println( ys1.equals( y1 ) );
		ys2.s1 = "aaa";
		ys3.s1 = "aaa";
		ys2.a  = 2	  ;
		System.out.println( ys2.equals(ys3) );
		ys2.s1  = "";
		System.out.println( ys2.isEmpty() );
		
	}
	
}
