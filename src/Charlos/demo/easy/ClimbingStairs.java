package Charlos.demo.easy;

/**
 * @Classname ClimbingStairs
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/24 22:17
 * @Version 1.0
 **/

/*
    #70 爬楼梯（完）

    假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    注意：给定 n 是一个正整数。

    输入： 2
    输出： 2
    解释： 有两种方法可以爬到楼顶。
    1.  1 阶 + 1 阶
    2.  2 阶
 */
public class ClimbingStairs {
    //循环
    public int climbStairs1(int n) {
        if(n==1){
            return 1;
        }
        int first=1;
        int second=2;
        for(int i=2;i<n;i++){
//            int third=first+second;
//            first=second;
//            second=third;
            second=first+second;
            first=second-first;
        }
        return second;
    }
    //单层递归
    public int climbStairs(int n){
        if(n==1){
            return 1;
        }
        return recursion(n,1,2);
    }
    public int recursion(int n,int a,int b){
        if(n<3){
            return b;
        }
        n--;
        b=b+a;
        a=b-a;
        return recursion(n,a,b);
    }
    //双层递归超时了，就不发了，同斐波那契
}
