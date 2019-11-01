package Charlos.demo.easy;

import java.util.Stack;

/**
 * @Classname ValidParentheses
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/24 10:34
 * @Version 1.0
 **/

/*
    #20 有效的括号：

    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    有效字符串需满足：
        1.左括号必须用相同类型的右括号闭合。
        2.左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串。

 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        //栈方法
        Stack stack = new Stack();
        //遍历字符串
        for(int i=0;i<s.length();i++){
            //截取字符串
            String temple = s.substring(i,i+1);
            //左括号就压栈，右括号就弹栈
            switch(temple){
                case "{":
                    stack.push(temple);
                    break;
                case "[":
                    stack.push(temple);
                    break;
                case "(":
                    stack.push(temple);
                    break;
                case ")":{
                    if(!stack.empty()&&stack.peek().equals("(")){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                }
                case "]":{
                    if(!stack.empty()&&stack.peek().equals("[")){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                }
                case "}":{
                    if(!stack.empty()&&stack.peek().equals("{")){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                }
            }
        }
        //循环后，如果栈为空，
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}
