# 题目描述

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

# 解题思路

### n&(n-1)

我们发现输入的某个数自身减一，再和自身进行与运算。结果的二进制里会去掉该数最右边的一。

```
如：
	n  :	10110100
	n-1:    10110011
	n&(n-1):10110000
```

时间复杂度: O(n) ,  n为1的个数

# 参考代码

```java
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            ++count;
            n = n & (n-1);
        }
        return count;
    }
}
```

