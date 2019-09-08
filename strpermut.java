import java.util.ArrayList;
import java.util.Arrays;


public class strpermut {

	public static String strpermufind(String str){
		char[] storage = str.toCharArray();
		
		Arrays.sort(storage);
	String u=Arrays.toString(storage);
		return u;
	}


/*public void waste(){
ArrayList<Integer> v = new ArrayList<Integer>();

for(int i=0;i<storage.length;i++){

int asciii=(int)storage[i];
		v.add(asciii);
}
}*/
public static void main(String[] args){
String k=strpermufind("taco cat");
String j=strpermufind("atco cta");
System.out.println("weather it is permutation:" + k.equals(j));
}
}