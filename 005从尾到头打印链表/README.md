**题目描述:**   

    输入一个链表，从尾到头打印链表每个节点的值。

**一、利用栈的后进先出特性**

    遍历头结点，有的话把结点放入栈中。然后利用栈的“先进后出”原理依次弹出栈，就实现了从尾到头打印链表。
    
```java    
    public void printListInserselyUsingIteration(ListNode node){
        Stack<ListNode> stack = new Stack();
        while(node != null){  //遍历链表直到不为空
            stack.push(node);   //将当前的结点放入栈中
            node = node.nxt;    //指向下一个结点
        }
        ListNode tmp; //临时结点变量
        while(!stack.isEmpty()){
            tmp = stack.pop();  //依次弹出栈
            System.out.print(tmp.val + " ");   //打印结果
        }
    }
```

**二、递归实现**
递归本质上就是一个栈的结构，查找到它最后的一个结点依次打印出值。
```java
    public static void printListInverselyUsingRecursion(ListNode node){
        if(node != null){
            printListInverselyUsingRecursion(node.nxt);
            System.out.print(node.val + " ");
        }
    }
```
