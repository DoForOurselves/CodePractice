package Charlos.demo.easy;

/**
 * @Classname SearchInsertPosition
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/9 17:04
 * @Version 1.0
 **/

/*
    #35 搜索插入的位置（完）

    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    你可以假设数组中无重复元素。

 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        //如果当前数字大于等于目标数字就输出当前下标
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        //若知道最后一个都比目标数字小则插入位置为最后一位
        return nums.length;
    }
}
