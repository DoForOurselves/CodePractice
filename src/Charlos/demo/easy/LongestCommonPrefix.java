package Charlos.demo.easy;

/**
 * @Classname LongestCommonPrefix
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 10:34
 * @Version 1.0
 **/

/*
    #14 最长公共前缀（完）

    编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。

 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //如果字符串数组为空，直接返回空字符串
        if (strs.length == 0) return "";
        //把第一个字符串单独提出
        String prefix = strs[0];
        //公共前缀必然也在第一个字符串内，所以将第一个字符串和剩余字符串进行比较
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
