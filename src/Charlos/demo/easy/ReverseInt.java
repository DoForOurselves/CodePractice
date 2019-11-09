package Charlos.demo.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname ReverseInt
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 10:27
 * @Version 1.0
 **/

/*
    #7 整数反转（完）

    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    注意：假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

 */
public class ReverseInt {
    public int reverseInt(int x) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean minus = false;
        int result=0;
        if(x<0){
            x=-x;
            minus = true;
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
                if(result>214748364||(minus==false&&result==214748364&&queue.peek()>7)||(minus==true&&result==214748364&&queue.peek()>8)){
                    return 0 ;
                }
                result = result * 10;
                result = result + queue.poll();
            }else{
                break;
            }
        }
        if(minus == true){
            result=-result;
        }
        return result;
    }
}
