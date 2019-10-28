package Charlos.demo.easy;

/**
 * @Classname LongestCommonPrefix
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 10:34
 * @Version 1.0
 **/

/*
    #14 最长公共前缀：

    编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。

 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
