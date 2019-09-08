import java.util.Stack;


public class Sequaldfg {

	public boolean find(String s1, String s2) {
		boolean Solution=false;
		String min , max ;
		//max=s1;
		//min=s2;
		if(s1.length()< s2.length()){
		min= s1.toLowerCase();	
		max=s2.toLowerCase();
		}
		else{
			min=s2.toLowerCase();
			max=s1.toLowerCase();
		}
		Stack<Character> min1 = new Stack<Character>();
		Stack<Character> max1 = new Stack<Character>();
		   
		for (char c : min.toCharArray()) {
	        min1.push(c);
	    }
		for (char c : max.toCharArray()) {
	        max1.push(c);
	    }
		System.out.println(min1);
		System.out.println(max1);

		while(!max1.isEmpty() && !min1.isEmpty())
			
		{
		if(min1.peek()== max1.peek()){
			System.out.println("kk");
			min1.pop();
			max1.pop();
			System.out.println(min1.isEmpty());
			System.out.println(max1.isEmpty());

			System.out.println("mm");
		}
		else{
			max1.pop();
			System.out.println(min1);
			System.out.println(max1);

		}
	
		}
		
				if(min1.isEmpty()){
		Solution=true;
		}
		return Solution;
	}
	
	public static void main(String args[]) {
		Sequaldfg sg = new Sequaldfg();
		System.out.println(sg.find("ab", "ba"));
	}
}
