# 题目描述

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

# 解题思路

```
入队：将元素进栈A
出队：判断B栈是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；如果不为空，栈B直接出栈。
```

# 参考代码

```
import java.util.Stack;

public class Solution {
    Stack<Integer> stackA = new Stack<Integer>();
    Stack<Integer> stackB = new Stack<Integer>();
    
    public void push(int node) {
        // 元素入栈A
        stackA.push(node);
    }
    
    public int pop() {
        // 判断栈是否为空
        if （stackA.isEmpty() && stackB.isEmpty()） {
            throw new RuntimeException("Queue is empty!");
        }
        int node;
        // 栈B为空才将A栈元素放入B栈
        if (stackB.isEmpty()){
            while(!stackA.isEmpty()){
                node = stackA.pop();
                stackB.push(node);
            }
        }
        return stackB.pop();
    }
}
```

