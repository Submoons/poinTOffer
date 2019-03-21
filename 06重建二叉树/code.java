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