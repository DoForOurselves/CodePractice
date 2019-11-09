package Charlos.demo.easy;

/**
 * @Classname CountAndSay
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/9 17:13
 * @Version 1.0
 **/

/*
    #38 报数（未完）

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
//public class CountAndSay {
//    public static String countAndSay(int n) {
//
//        return "";
//    }
//}
public class CountAndSay {
    public static String countAndSay(int n) {
        String resultString = "1";
        for(int i=1;i<n;i++){
            int count=1;
            String currString="";
            String temple;
            temple=resultString.substring(0,1);
            for(int j=0;j<resultString.length();j++){
                if(j==0){
                    continue;
                }
                if (resultString.substring(j,j+1).equals(temple)) {
                    count++;
                }else{
                    currString=currString+Integer.toString(count) +resultString.substring(j,j+1);
                    count=1;
                    if(j+2<resultString.length()){
                        temple=resultString.substring(j+1,j+2);
                    }else{
                        resultString = currString;
                        break;
                    }
                }
            }
        }
        return resultString ;
    }
}