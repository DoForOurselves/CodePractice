package Charlos.demo.easy;

import Charlos.demo.common.ListNode;

/**
 * @Classname MergeTwoSortedLists
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 14:57
 * @Version 1.0
 **/

/*
    #21 合并两个有序链表（完）

    将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.getVal() <= l2.getVal()) {
                prev.setNext(l1);
                l1 = l1.getNext();
            } else {
                prev.setNext(l2);
                l2 = l2.getNext();
            }
            prev = prev.getNext();
        }
        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
//        prev.getNext() = l1 == null ? l2 : l1;
        if(l1==null){
            prev.setNext(l2);
        }else{
            prev.setNext(l1);
        }
        return prehead.getNext();
    }
}
