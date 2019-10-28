package Charlos.demo.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Palindrome
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 10:31
 * @Version 1.0
 **/

/*
    #9 回文数：

    判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int start = x;
        int result=0;
        if(x<0){
            return false;
        }
        for(int i=0;i<999999999;i++){
            if(x/10>0||x%10>0){
                queue.offer(x%10);
                x=x/10;
            }else{
                break;
            }
        }
        for(int j=0;j<999999999;j++){
            if(!queue.isEmpty()){
                if(result>214748364||(result==214748364&&queue.peek()>7)){
                    return false ;
                }
                result = result * 10;
                result = result + queue.poll();
            }else{
                break;
            }
        }
        if(start==result){
            return true;
        }else{
            return false;
        }
    }
}
