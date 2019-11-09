package Charlos.demo.easy;

/**
 * @Classname RemoveElement
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/8 20:51
 * @Version 1.0
 **/
/*
    #27 移除元素

    给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
    不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
    元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        //结果值初始化为0
        int result = 0;
        //遍历输入的数组
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
