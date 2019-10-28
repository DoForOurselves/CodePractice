package Charlos.demo.medium;

import Charlos.demo.common.ListNode;

/**
 * @Classname AddTwoNumbers
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 14:41
 * @Version 1.0
 **/

/*
    #2 两数相加：

    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建初始值为0，没有指向的链表（头）
        ListNode last = new ListNode(0);
        //创建新链表获取参数的值，创建用来更改最终结果的链表（头）
        ListNode p=l1,q=l2,curr=last;
        //进位
        int carry = 0;
        //开始进行加数计算
        while(p!=null||q!=null){
            //将非空的链表的值赋予x，y
            int x = (p!=null)?  p.getVal():0;
            int y = (q!=null)?  q.getVal():0;
            //计算结果
            int sum = carry + x + y;
            //取整算进位
            carry = sum/10;
            //创建curr指向的链表
            curr.setNext(new ListNode(sum%10));
            //指针移动
            curr = curr.getNext();
            if ( p != null ) p = p.getNext();
            if ( q != null ) q = q.getNext();
        }
        //p,q为空但进位不为空时
        if(carry>0){
            curr.setNext(new ListNode(carry));
        }
        return last.getNext();
    }
}
