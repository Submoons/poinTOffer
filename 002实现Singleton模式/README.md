��Ŀ�����һ���ֻ࣬�����ɸ����һ��ʵ�� 
�Ƽ�ʹ�ã�
		һ����̬�ڲ���:
		public class Singleton{
				private static class SingletonHolder{
						private static final Singleton INSTANCE = new Singleton();
				}
				private Singleton(){};
				
				public static final Singleton getInstance(){
						return SingletonHolder.INSTANCE;
				}
		}
		���� SingletonHolder ��˽�еģ����� getInstance() ֮��û�а취�������������������ʽ�ģ�
		ͬʱ��ȡʵ����ʱ�򲻻����ͬ����û������ȱ�ݣ�Ҳ������ JDK �汾��������Ӧ�Զ���������
		
		����ö�ٵ���
		public enum Singleton{
				//���Ϊ public static final Singleton INSTANCE;
				INSTANCE
		}
		