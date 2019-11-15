package Charlos.demo.easy;

/**
 * @Classname PlusOne
 * @Description TODO
 * @Author jinweijie@neusoft.com
 * @Date 2019/11/14 15:02
 * @Version 1.0
 **/

/*
    #66 加一（完）

    给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    你可以假设除了整数 0 之外，这个整数不会以零开头。

    输入: [1,2,3]
    输出: [1,2,4]
    解释: 输入数组表示数字 123。

 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        //进位
        int carry=0;
        //末尾加一，有进位就往前进
        for(int i=length-1;i>-1;i--){
            digits[i]++;
            carry=0;
            if(digits[i]==10){
                digits[i]=0;
                carry++;
            }
            //没进位就退出
            if(carry==0){
                break;
            }
        }
        //全部进位成0，就延长数组，首位置1
        if(carry==1){
            digits=new int[length+1];
            digits[0]=1;
            for(int j=digits.length-1;j>0;j--){
                digits[j]=0;
            }
        }
        return digits;
    }
}
