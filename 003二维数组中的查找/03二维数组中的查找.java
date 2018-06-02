/*��Ŀ����һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
	ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
	����������һ����ά�����һ���������ж��������Ƿ��и�������
	* ���ɣ�����ѡȡ���������Ͻǵ����֡���������ֵ���Ҫ���ҵ����֣����ҹ��̽����� 
  * ��������ִ���Ҫ���ҵ����֣��޳�����������ڵ��У����������С��Ҫ���ҵ����֣��޳�����������ڵ��С� 
  * Ҳ����˵���Ҫ���ҵ����ֲ�����������Ͻǣ���ÿ���ζ�������Ĳ��ҷ�Χ���޳����л���һ�У�����ÿһ����������С 
  * ���ҵķ�Χ��ֱ���ҵ�Ҫ���ҵ����֣����߲��ҷ�ΧΪ�ա� 
  	1 2 3
		2 3 4
		3 4 5
*/

public class Test03{
	
	/**
	 * @param matrix �����ҵ����� 
	 * @param number Ҫ���ҵ��� 
	 * @return ���ҽ����true�ҵ���falseû���ҵ� 
	 */
	public static boolean findRightUp(int[][] matrix, int number){
			//����������ж�
			if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
					return false;
			}
			
			int rows = matrix.length; //������
			int cols = matrix[0].length; //������
			
			int row = 0; //��ʼ��ѯ��
			int col = cols-1; //��ʼ��ѯ��
			
			//Ҫ���ҵ�λ��ȷ��������֮��
			while(row >= 0 && row < rows && col >= 0 && col < cols){
					if(matrix[row][col] == number){ //�ҵ���ֱ�ӷ���
						return true;
					}else if(matrix[row][col] > number){//����ҵ�������Ҫ�ҵ�����˵��Ҫ�ҵ����ڵ�ǰ�������
							col--; // ������һ�����������ƶ�
					}else{// ����ҵ�������Ҫ�ҵ���С��˵��Ҫ�ҵ����ڵ�ǰ�����±�
							row++;// ������һ�����������ƶ�  
					}
			}
			return false;
	}
	public static boolean findLeftDown(int[][] matrix, int number){
				//����������ж�
				if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
						return false;
				}
				
				int rows = matrix.length; //������
				int cols = matrix[0].length; //������
				
				int row = rows-1; //��ʼ��ѯ��
				int col = 0; //��ʼ��ѯ��
				
				//Ҫ���ҵ�λ��ȷ��������֮��
				while(row >= 0 && row < rows && col >= 0 && col < cols){
						if(matrix[row][col] == number){ //�ҵ���ֱ�ӷ���
							return true;
						}else if(matrix[row][col] > number){//����ҵ�������Ҫ�ҵ�����˵��Ҫ�ҵ����ڵ�ǰ�����ϱ�
								row--; // ������һ�����������ƶ�
						}else{// ����ҵ�������Ҫ�ҵ���С��˵��Ҫ�ҵ����ڵ�ǰ�����±�
								col++;// ������һ�����������ƶ�  
						}
				}
				return false;
		}

	public static void main(String args[]){
		/**����//
		   1 2  8  9 
		   2 4  9 12
		   4 7 10 13
		   6 8 11 15 
		*/
		int [][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		boolean flagRight = findRightUp(matrix, 20); //false
		boolean flagLeft = findLeftDown(matrix, 12); //true
		System.out.println(flagRight + " " + flagLeft);
	}
	
}