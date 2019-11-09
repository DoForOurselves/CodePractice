package Charlos.demo.self;

/**
 * @Classname Fibonacci
 * @Description TODO
 * @Author Charlos
 * @Date 2019/11/9 20:07
 * @Version 1.0
 **/

/*
    斐波那契数列
 */
public class Fibonacci {
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==2) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
