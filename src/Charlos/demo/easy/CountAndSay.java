package Charlos.demo.easy;

/**
 * @Classname CountAndSay
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/9 17:13
 * @Version 1.0
 **/

/*
    #38 报数（完）

    报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221
    1 被读作  "one 1"  ("一个一") , 即 11。
    11 被读作 "two 1s" ("两个一"）, 即 21。
    21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

    给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
    注意：整数顺序将表示为一个字符串。

 */
public class CountAndSay {
    public static String countAndSay(int n) {
        StringBuffer resultString = new StringBuffer("11");
        //当n=1时，返回1
        if(n==1){
            return "1";
        }
        //当n=2时，返回11
        if(n==2){
            return "11";
        }
        //当获取行数大于2时
        for(int i=2;i<n;i++){
            //初始化
            int count=1;
            int stringlength = resultString.length();
            //新字符串的临时字符串
            StringBuffer currString=new StringBuffer("");
            //对比用字符串初始化
            char temple = resultString.charAt(0);
            //对字符串进行遍历
            for(int j=1;j<stringlength;j++){
                char currChar = resultString.charAt(j);
                //如果和对比中的字符串相同，则计数加1；
                // 否则就把对比用字符串添加到新字符串末尾，计数重置为1，把当前字符串设置为对比用字符串
                if (currChar==temple) {
                    count++;
                } else {
                    currString.append(Integer.toString(count)).append(temple);
                    count = 1;
                    temple = currChar;
                }
                //如果当前字符串已经是最后一位的字符串，则将该字符串添加到新字符串末尾
                if(j+1>=stringlength){
                    resultString = currString.append(Integer.toString(count)).append(currChar);
                    break;
                }
            }
        }
        return resultString.toString() ;
    }
}
/*
优解
 */
//class Solution {
//    public static String countAndSay(int n) {
//        StringBuilder ans = new StringBuilder();
//        ans.append("1");
//        for (int i = 2; i <= n ; i++) {
//            //遍历前一个字符串
//            String currentStr = new String(ans);
//            ans.delete(0,ans.length());
//            int num = 0;
//            char currentChar = currentStr.charAt(0);
//            for (char c : currentStr.toCharArray()) {
//                if(c == currentChar){
//                    num++;
//                }
//                else{
//                    ans.append((char)('0'+num));
//                    ans.append(currentChar);
//                    currentChar = c;
//                    num = 1;
//                }
//            }
//            ans.append((char)('0'+num));
//            ans.append(currentChar);
//
//        }
//
//        return ans.toString();
//    }
//}

