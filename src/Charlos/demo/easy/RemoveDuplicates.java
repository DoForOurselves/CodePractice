package Charlos.demo.easy;

/**
 * @Classname RemoveDuplicates
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/29 15:42
 * @Version 1.0
 **/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        return back(nums);
    }
    public static int back(int[] nums) {
        int deleted=0;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length&&nums[i]==nums[i+1]){
                int j=i;
                while(j+1<nums.length){
                    nums[j]=nums[j+1];
                    j++;
                }
                deleted++;
                i--;
            }
        }
        return nums.length-deleted/2;
    }
}
