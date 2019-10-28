package Charlos.demo.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname RomanToInt
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/24 15:44
 * @Version 1.0
 **/

/*
    #13 罗马数字转整数：

    给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

 */
public class RomanToInt {
    public static int romanToInt(String s) {
        int sum = 0;
        Map<String,Integer> RomanNumbers = new HashMap<String,Integer>();
        RomanNumbers.put("I",1);
        RomanNumbers.put("V",5);
        RomanNumbers.put("X",10);
        RomanNumbers.put("L",50);
        RomanNumbers.put("C",100);
        RomanNumbers.put("D",500);
        RomanNumbers.put("M",1000);
        for(int i=0;i<s.length();i++){
            String CurrRomanNumber = s.substring(i,i+1);
            if((i+1)<s.length()){
                String NextRomanNumber = s.substring(i+1,i+2);
                if(RomanNumbers.get(NextRomanNumber)>RomanNumbers.get(CurrRomanNumber)){
                    sum = sum + RomanNumbers.get(NextRomanNumber) - RomanNumbers.get(CurrRomanNumber);
                    i++;
                    continue;
                }
            }
            sum+=RomanNumbers.get(CurrRomanNumber);
        }
        return sum;
    }
}
