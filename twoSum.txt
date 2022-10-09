import java.util.HashMap;
public class TwoSum{
public static int[] twoSum(int[] nums,int target){
int[] arr=new int[2];
HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
for(int i=0;i<nums.length;i++){
Integer value=map.get(target-nums[i]);
if(value==null)
map.put(nums[i],i);
else
{
arr[0]=value;
arr[1]=i;
}
}
return arr;
}
public static void main(String[]args){
int[] nums={3,9,11,15,12};
int target=15;
int []arr=twoSum(nums,target);
System.out.println("["+arr[0]+","+arr[1]+"]");
}
}