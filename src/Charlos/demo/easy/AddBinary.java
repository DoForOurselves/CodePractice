package Charlos.demo.easy;

/**
 * @Classname AddBinary
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/14 22:56
 * @Version 1.0
 **/

/*
    #67 二进制求和（未完）

    给定两个二进制字符串，返回他们的和（用二进制表示）。
    输入为非空字符串且只包含数字 1 和 0。

 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int lengthA=a.length();
        int lengthB=b.length();
        String result = null;
        if(lengthA==0){
            return b;
        }
        if(lengthB==0){
            return a;
        }
        int minLength = Math.min(lengthA,lengthB);
        int maxLength = Math.max(lengthA,lengthB);
        int remain = maxLength-minLength;
        for(int i=0;i<minLength;i++){
        }
        return a;
    }
}
