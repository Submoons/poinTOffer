# 题目描述

输入一个链表，输出该链表中倒数第k个结点。

# 解题思路

```
定义两个指针，第一个指针从链表的头指针开始遍历向前走k-1步，第二个指针保持不动，
从第k步开始，第二个指针也开始从链表的头指针开始遍历，
由于两个指针的距离保持在k-1，当第一个指针到达链表的尾节点时，第二个指针刚好指向倒数第k个节点。
```

# 参考代码

```
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode pA, pB;
        pA = pB = head;    // 都从头开始
        int i = 0;
        for (; pB != null; i++) {
            // B先走,只有B走到k-1的位置,i=k后,A才开始走
            // A，B一起走后，B走到为空时,A就指向要找的位置
            if (i >= k)
                pA = pA.next;
            pB = pB.next;
        }
        return i < k ? null : pA;
    }
}
```

