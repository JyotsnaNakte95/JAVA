import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.stream.Collectors;

import com.google.common.base.Joiner;
//import org.springframework.util.StringUtils;


public class StrinCompress {

	
//private static final String Object = null;

public static String todoCompress(String str){
HashMap<Character,Integer> count = new HashMap<Character,Integer>();	
char[] word = str.toCharArray();
for(int i=0;i<word.length;i++){
	   char c = word[i];
	   Integer val = count.get(c);
	   if(val != null){
	     count.put(c, new Integer(val + 1));
	   }else{
	     count.put(c,1);
	   }
}
//

//String vv= ((Object) Joiner.on(',')).
//join(count.values());
//String u=count.toString().replaceAll(",  ,");
String[] vv = count.toString().split(",");
//replaceAll(" ,", "");
//vv.toString();
return vv.toString();
}

public static void main(String[] args){
String j="aasssdddffgghjkklllllllllllllllllla";
String n = todoCompress(j);
System.out.println(n);
if(j.length()> n.length()){
	System.out.println("String Compressed:" + n );
}
else
{
	System.out.println("To big String:"+n);
}
}
}
