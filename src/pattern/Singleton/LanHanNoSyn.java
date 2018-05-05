package pattern.Singleton;

/**
 * 懒汉式，没有synchronizaed线程不安全。所谓懒汉式就是分割了实例化的过程，先声明，经过判断在决定实例化。
 * 
 * @author 阿浮
 *
 */
public class LanHanNoSyn {
	// 懒汉式就是先声明，并不同时实例化，因此可以只有在调用其getInstance()方法时才创建对象。
	private static LanHanNoSyn instance;

	private LanHanNoSyn() {
	}

	// 实例化的工作在getInstance方法中实现，从而不使其在类加载时就被实例化
	public static LanHanNoSyn getInstance() {
		// 判断该单例是否被实例化过了，如果没实例化就实例化。
		if (instance == null) {
			instance = new LanHanNoSyn();
		}
		return instance;
	}

	public void showMsg() {
		System.out.println("懒汉式，线程不安全");
	}
}
