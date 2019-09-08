import java.util.Arrays;


public class Cardgame {
public boolean solution(int total_money, int total_damage, int[] costs, int[] damages){
	boolean found= false;
for(int i=0;i< damages.length;i++){
	
	int found_cost=damages[i]+costs[i];
	
	if(total_money== found_cost){
		
		found=true;
		break;
	}
}
	return found;
	

}

public static void main(String[] args){
	Cardgame cg = new Cardgame();
	int[] cost = new int[]{4,5,1};
	int[] damage = new int[]{1,2,3};
	System.out.println(cg.solution(5,3, cost,damage));
	System.out.println(damage.length);
}
}
