
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
	
	public YourString concat( YourString str ) {
		
		s1 = s1 + str.s1;
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
	
	public static void main ( String args[] ) {
		
		YourString ys1 = new YourString();
		YourString ys2 = new YourString( "This is other constructor." );
		YourString ys3 = new YourString( "This is to find chars at "
		+ "various indices." );
		YourObject y1  = new YourObject();
		System.out.println( ys3.charAt( 16 ) );
		System.out.println( ys3.compareTo(ys2) );
		ys1 = ys1.concat( ys2 );
		System.out.println( ys1.s1 );
		System.out.println( ys1.equals(y1) );
		ys2.s1 = "aaa";
		ys3.s1 = "aaa";
		ys2.a  = 2	  ;
		System.out.println( ys2.equals(ys3) );
		ys2.s1  = "";
		System.out.println( ys2.isEmpty() );
		
	}

}
