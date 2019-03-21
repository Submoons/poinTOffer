# 题目描述

```
    输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
```

# 解题思路

```
   我们知道，前序遍历的第一个节点就是树的根节点，所以我们先根据前序遍历序列的第一个数字创建根结点，接下来在中序遍历序列中找到根结点的位置，根节点的左边就是左子树，右边就是右子树，这样就能确定左、右子树结点的数量。在前序遍历和中序遍历的序列中划分了左、右子树结点的值之后，就可以递归地去分别构建它的左右子树。
```

# 参考代码

```java
// 定义二叉树节点类
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	/**
		pre: 前序序列
		in : 中序序列
	*/
	public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
		// 判断前序和中序是否为空
		if (pre.length == 0 || in.length == 0)
			return null;
		return ConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
	}
	
	/**
		ps: 前序序列开始位置
		pe: 前序序列结束位置
		is: 中序序列开始位置
		ie: 中序序列结束位置
	*/
	private TreeNode ConstructBinaryTree(int [] pre, int ps, int pe, int [] in, int is, int ie) {
		// 如果开始位置大于结束位置,递归结束
		if (ps > pe || is > ie) {
			return null;
		}
		// 前序序列第一个为根节点
		TreeNode root = new TreeNode(pre[ps]);
		
		// 循环中序列
		for (int i = is; i <= ie; i++) {
			// 找到每次中序列的根节点(每次前序序列第一个为根节点)
			if (in[i] == pre[ps]) {
				// 左子树  递归
				// 前序的开始结束索引通过计算中序中左右子树的大小来计算
				root.left = ConstructBinaryTree(pre, ps+1, ps+i-is, in, is, i-1);
				// 右子树  递归
				root.right = ConstructBinaryTree(pre, ps+i-is+1, pe, in, i+1, ie);
				break;
			}
			return root;
			
		}
	}
	
	
}
```

