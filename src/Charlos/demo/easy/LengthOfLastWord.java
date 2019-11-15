package Charlos.demo.easy;

/**
 * @Classname LengthOfLastWord
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/13 21:53
 * @Version 1.0
 **/

/*
    #58 最后一个单词的长度（完）

    给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
    如果不存在最后一个单词，请返回 0 。
    说明：一个单词是指由字母组成，但不包含任何空格的字符串。

    输入: "Hello World"
    输出: 5

 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //判断最后一次出现空格的位置
        int index = s.lastIndexOf(" ");
        int length=s.length();
        //是否存在空格
        if(index!=-1){
            //空格是否在末尾
            if(index+1==length){
                return lengthOfLastWord(s.substring(0,index));
            }else{
                return length-index-1;
            }
        }else{
            return length;
        }
    }
}
