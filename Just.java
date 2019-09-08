
 class Just1 {
private static String rinki= "I am private";
public static String juoo = "I am private";
public int v = 5;
 }
class Just{
public static void t(){
	String u = "123";
	char a[] = u.toCharArray();
	System.out.println(a);
	int sum = 0;
	String reverse="";
	for (int i=a.length-1;i>=0;i--){
		reverse = reverse + u.charAt(i);
		
	}
	System.out.println(reverse);
	}
public static void main(String[] args){
	 int result = +1;
     // result is now 1
     System.out.println(result);

    System.out.println(result--);
     // result is now 0
     System.out.println(result);

     result++;
     // result is now 1
     System.out.println(result);

     result = -result;
     // result is now -1
     System.out.println(result);

     boolean success = false;
     // false
     System.out.println(success);
     // true
     System.out.println(!success);
     }
}
 

