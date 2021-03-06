# 题目描述

给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

# 解题思路

![](https://github.com/Submoons/poinTOffer/blob/master/11%E6%95%B0%E5%80%BC%E7%9A%84%E6%95%B4%E6%95%B0%E6%AC%A1%E6%96%B9/11.jpg)

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

