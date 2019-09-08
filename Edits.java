
public class Edits {
	
	
public static int tofind(String str1,String str2) throws ArrayIndexOutOfBoundsException{
	int edit=0;
	try{
	
	if(str1.length()== str2.length()){
		edit=edit+0;
		}
		else
			edit++;
	
	/*if(str1.equals(str2)){
		edit=edit+0;
		}
		else 
			edit++;
			*/
	if(str1.length()<str2.length()){

	char[] m= str1.toCharArray();
	char[] n=str2.toCharArray();
	for(int i=0;i<m.length;i++){
	if(m[i]==n[i]){
		edit=edit+0;
	}
	else
		edit++;
	}
	}
	else{
		edit=edit+0;
	}
	}
	catch(Exception e){
		e.getMessage();
	}
	return edit;
}
public static void main(String[] args){
	
int v =tofind("pale","ble");	
System.out.println("Number of edits:"+ v );
if(v>0){
	System.out.println(true);
}
else
{
	System.out.println("No edits :) ");
}
}
}
