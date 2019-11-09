package Charlos.demo.easy;

/**
 * @Classname ImplementStrStr
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/9 16:06
 * @Version 1.0
 **/

/*
    #28 实现strStr（完）

    实现 strStr() 函数。
    给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
    当 needle 是空字符串时我们应当返回 0 。

 */
public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        //返回结果默认为-1
        int result = -1;
        //如果haystack长度小于needle必不可能有结果
        if(haystack.length()<needle.length()){
            return -1;
        }
        //如果needle长度为0则结果返回0
        if (needle.length()==0){
            return 0;
        }
        //开始遍历haystack
        for(int hayLoc=0;hayLoc<haystack.length()-needle.length()+1;hayLoc++){
            if(haystack.substring(hayLoc,hayLoc+needle.length()).equals(needle)){
                result = hayLoc;
                break;
            }
        }
        return result;
    }
}
