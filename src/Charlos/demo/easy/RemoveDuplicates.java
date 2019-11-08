package Charlos.demo.easy;

/**
 * @Classname RemoveDuplicates
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/29 15:42
 * @Version 1.0
 **/
/*
    #26 删除排序数组中的重复项

    给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
    不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        //存放临时相同元素
        int temple;
        //结果
        int result=1;
        //判断数组长度为空
        if(nums.length==0){
            return 0;
        }else{
            temple=nums[0];
        }
        //数组只有1个元素
        if(nums.length==1){
            return 1;
        }
        //数组长度大于1时
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=temple){
                nums[result]=nums[i];
                temple=nums[i];
                result++;
            }
        }
        return result;
    }
}
