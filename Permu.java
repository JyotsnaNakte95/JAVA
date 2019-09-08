
public class Permu {

public static void find(String s,String v){
	int count=0;
	if(s.length()== v.length()){
	char[] a = s.toCharArray();
	char[] b = v.toCharArray();
	
	for(int i =0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
			if(a[i]== b[j]){
				count=count+1;
			}
		}
	}
	}
	if(count==s.length()){
		System.out.println("yes");
	}
	}
	
public static void main(String[] args)
{
	find("dell","lled");
	}
}
