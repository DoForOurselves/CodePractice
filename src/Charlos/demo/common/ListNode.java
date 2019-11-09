package Charlos.demo.common;

/**
 * @Classname ListNode
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 14:39
 * @Version 1.0
 **/

/*
    公共类 ListNode
 */
public class ListNode {
    private int val;
    private ListNode next;
    public ListNode(int x){
        val = x;
    }
    public int getVal() {
        return val;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
}
