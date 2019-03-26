# 题目描述

给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

# 解题思路

![](E:\剑指offer\poinTOffer\11数值的整数次方\11.jpg)

```
 (x*x)n/2 可以通过递归求解，并且每次递归 n 都减小一半，因此整个算法的时间复杂度为 O(logN)。
```

# 参考代码

```java
public class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0)
        return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0)
            pow = pow * base;
        return isNegative ? 1 / pow : pow;
  }
}
```

