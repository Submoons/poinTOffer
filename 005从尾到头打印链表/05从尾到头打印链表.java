//题目：输入个链表的头结点，从尾到头反过来打印出每个结点的值。
public class Test05{
	//节点对象
	public static class ListNode{
		int val;
		ListNode nxt;
	}
	
	/**
	*
	* 输入个链表的头结点，从尾到头反过来打印出每个结点的值 
	* 使用栈的方式进行
	* @param root 链表头结点 
	*/
	public static void printListInverselyUsingIteration(ListNode node){
		Stack<ListNode> stack = new Stack();
		while(node != null){
				stack.push(node);
				node = node.nxt;
		}
		ListNode tmp;
		
		while(!stack.isEmpty()){
				tmp = stack.pop();
				System.out.print(tmp.val + " ");
		}
	}
	
	/**
	* 使用递归方式调用
	*/
	public static void printListInverselyUsingRecursion(ListNode node){
			if(node != null){
					printListInverselyUsingRecursion(node.nxt);
					Sytem.out.print(node.val + " ");
			}
	}
	
}