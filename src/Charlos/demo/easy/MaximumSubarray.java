package Charlos.demo.easy;

/**
 * @Classname MaximumSubarray
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/11 14:57
 * @Version 1.0
 **/

/*
    #53 最大子序和（完）

    给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    输入: [-2,1,-3,4,-1,2,1,-5,4]
    输出: 6
    解释: 连续子数组 [4,-1,2,1] 的和最大，为6

 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        //最大值初始化为数组第一项
        int maxSum=nums[0];
        //累加值
        int sum=0;
        int length=nums.length;
        //遍历数组
        for(int i=0;i<length;i++){
            //计算累加值
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
