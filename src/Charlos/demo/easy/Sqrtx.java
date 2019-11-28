package Charlos.demo.easy;

/**
 * @Classname Sqrtx
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/26 20:47
 * @Version 1.0
 **/

/*
    #64 平方根（完）

    实现 int sqrt(int x) 函数。
    计算并返回 x 的平方根，其中 x 是非负整数。
    由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

    示例 1:
        输入: 4
        输出: 2

 */
public class Sqrtx {
//    public int mySqrt(int x) {
//        if(x==0){
//            return 0 ;
//        }
//        for(int i=1;i<=46340;i++){
//            if (i*i==x){
//                return i;
//            }else if(i*i>x){
//                return i-1;
//            }else{
//                continue;
//            }
//        }
//        return 46340;
//    }
    //二分法
    public int mySqrt(int x){
        if(x==0){
            return 0;
        }
        //平方根不会超过该数的一半
        long left = 1;
        long right=x/2+1;
        while(left<right){
            long mid=(left+right+1)/2;
            if(mid*mid>x){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        return (int)right;
    }
}
