//��Ŀ:���һ���࣬����ֻ�����ɸ����һ��ʵ��
public class Test02{
	/**
	 *����ģʽ,����ʽ���̰߳�ȫ
	 */
	public static class Singleton{
		private final static Singleton INSTANCE = new Singleton();
		
		private Singleton(){}
		
		public static Singleton getInstance(){
			return INSTANCE;	
		}	 			
	}
	
	/**
	 *����ģʽ������ʽ���̲߳���ȫ
	 */
	public static class Singleton2{
		private static Singleton2 instance = null;
		
		private Singleton2(){}
		
		public static Singleton2 getInstance(){
			if(instance == null){
				instance = new Singleton2();	
			}	
			return instance;
		}	
	}	
		/**
		 *����ģʽ������ʽ���̰߳�ȫ�����̻߳�����Ч�ʲ���
		 */
		public static class Singleton3{
			private static Singleton3 instance = null;
			
			private Singleton3(){}
			
			public static synchronized Singleton3 getInstance(){
				if(instance == null){
						instance = new Singleton3();
				}	
				return instance;
			}
		}
		
		/**
		 *����ģʽ������ʽ�����֣��̰߳�ȫ
		 */
		public static class Singleton4{
			private static Singleton4 = null;
			
			static{
				instance = new Singleton4();	
			}
			private Singleton4(){}
			
			public static Singleton4 getInstance(){
				return instance;	
			} 
		}
		
		/**
		 *����ģʽ��ʹ�þ�̬�ڲ��࣬�̰߳�ȫ(�Ƽ�)
		 */
		public static class Singleton5{
			private final static class SingletonHolder{
				private static final Singleton5 INSTANCE = new Singleton5();
				
				private Singleton5(){}
				
				public static Singleton5 getInstance(){
					return SingletonHolder.INSTANCE;	
				}	
			}	
		}
		
		/**
		 *��̬�ڲ��࣬ʹ��ö�ٷ�ʽ���̰߳�ȫ(�Ƽ�)
		 */
		public enum Singleton6{
			INSTANCE;
			
			public void whateverMethod(){}
		}
		
		/**
		 *��̬�ڲ��࣬ʹ��˫��У�������̰߳�ȫ(�Ƽ�)
		 */
		public static class Singleton7{
			private volatile static Singleton7 instance = null;
			
			private Singleton7(){}
			
			public static Singleton7 getInstance(){
				if(instance == null){
					synchronized (Singleton7.class){
							if(instance == null){
									instance = new Singleton7();
							}
					}
				}
				return instance;	
			}	
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}