**��Ŀ����:**   

    ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��

**һ������ջ�ĺ���ȳ�����**

    ����ͷ��㣬�еĻ��ѽ�����ջ�С�Ȼ������ջ�ġ��Ƚ������ԭ�����ε���ջ����ʵ���˴�β��ͷ��ӡ����
    
```java    
    public void printListInserselyUsingIteration(ListNode node){
        Stack<ListNode> stack = new Stack();
        while(node != null){  //��������ֱ����Ϊ��
            stack.push(node);   //����ǰ�Ľ�����ջ��
            node = node.nxt;    //ָ����һ�����
        }
        ListNode tmp; //��ʱ������
        while(!stack.isEmpty()){
            tmp = stack.pop();  //���ε���ջ
            System.out.print(tmp.val + " ");   //��ӡ���
        }
    }
```

**�����ݹ�ʵ��**
�ݹ鱾���Ͼ���һ��ջ�Ľṹ�����ҵ�������һ��������δ�ӡ��ֵ��
```java
    public static void printListInverselyUsingRecursion(ListNode node){
        if(node != null){
            printListInverselyUsingRecursion(node.nxt);
            System.out.print(node.val + " ");
        }
    }
```
