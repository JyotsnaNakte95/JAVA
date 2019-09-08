import java.util.*;


class PeaksValley{

	public int[] pvsort(int[] nums){
	Arrays.sort(nums);
	//for(int j=0;j<nums.length;j++){
	//System.out.println(nums[j]);
	//}
	int mid = nums.length/2;
	int[] temp= new int[nums.length];
	int l=0;
	int r=mid+1;
	int i=0;
	while(i<temp.length){
		int right=nums[r];
		
		int left = nums[l];
		
		//System.out.println(i);
		temp[i] = right;
		System.out.println(temp[i]);
		temp[i+1]=left;
		System.out.println(temp[i+1]);
		i=i+2;
		r+=1;
		l+=1;
		
	}
	temp[temp.length-1]=mid;
	return temp;
	}

public static void main(String[] args){
 PeaksValley pk = new PeaksValley();
 int[] arr = new int[]{5,8,6,2,3,4,6};
 System.out.println(pk.pvsort(arr));
}
}