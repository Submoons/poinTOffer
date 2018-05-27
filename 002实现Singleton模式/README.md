题目：设计一个类，只能生成该类的一个实例 
推荐使用：
		一、静态内部类:
		public class Singleton{
				private static class SingletonHolder{
						private static final Singleton INSTANCE = new Singleton();
				}
				private Singleton(){};
				
				public static final Singleton getInstance(){
						return SingletonHolder.INSTANCE;
				}
		}
		由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；
		同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。能完美应对多数场景。
		
		二、枚举单例
		public enum Singleton{
				//理解为 public static final Singleton INSTANCE;
				INSTANCE
		}
		