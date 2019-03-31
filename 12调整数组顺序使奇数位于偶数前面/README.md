# 题目描述

```
   输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
```

# 参考代码

```java
/* 最简单的方法就是把奇数和偶数按顺序挑出来，分别放到vector里，最后再把偶数的vector接到奇数vector的末尾。*/
public class Solution {
    public void reOrderArray(int [] array) {
        // 奇数
        Vector<Integer> odd = new Vector<Integer>();
        // 偶数
        Vector<Integer> even = new Vector<Integer>();
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            // 判断奇偶
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            }else {
                odd.add(array[i]);
            }
        }
        // 把偶数放到奇数尾部
        odd.addAll(even);
        // 重新放入原数组
        for (int i = 0; i < array.length; i++) {
            array[i] = odd.get(i);
        }
    }
}
```

```java
/* 如果不能开僻额外的空间，可以尝试有类似于冒泡排序的方法,如果当前的值为偶数，后一个值为奇数，则两个数对换位置
*/
public class Solution {
    public void reOrderArray(int [] array) {
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length-1; j++) {
               if(array[j] % 2 == 0 && array[j+1] % 2 != 0){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
           }
       }
    }
}
```

