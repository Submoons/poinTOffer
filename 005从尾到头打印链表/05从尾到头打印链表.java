//��Ŀ������������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
public class Test05{
	//�ڵ����
	public static class ListNode{
		int val;
		ListNode nxt;
	}
	
	/**
	*
	* ����������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ 
	* ʹ��ջ�ķ�ʽ����
	* @param root ����ͷ��� 
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
	* ʹ�õݹ鷽ʽ����
	*/
	public static void printListInverselyUsingRecursion(ListNode node){
			if(node != null){
					printListInverselyUsingRecursion(node.nxt);
					Sytem.out.print(node.val + " ");
			}
	}
	
}