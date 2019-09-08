class SupX{   
	public int instF = 0;    
	public String toString(){  
		return "SupX: " + instF;    
		}       
	public int superX(){            
		return instF;      
		}}
public class SubY extends SupX {
	public int instF = 22;
	public String toString()
	{
		String strOut;
		strOut = "SubY " + instF;
		return strOut;
		}public int superX()
		{
			return super.instF;
			
	}
public static void main(String[] args){
	SubY aSubY = new SubY();
	SupX aSupX = (SupX)new SubY();
	System.out.println(aSubY.superX());//0
System.out.println(aSupX.superX());//0
//System.out.println(super.instF);
System.out.println(aSubY.instF);//22
System.out.println(aSupX.instF);//0
}
}