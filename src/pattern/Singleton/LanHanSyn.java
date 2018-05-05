package pattern.Singleton;

/**
 * 懒汉式线程安全。
 * 
 * @author 阿浮
 *
 */
public class LanHanSyn {
	private static LanHanSyn instance;

	private LanHanSyn() {
	}

	// synchronized同步锁，保证线程安全
	public static synchronized LanHanSyn getInstance() {
		if (instance == null) {
			instance = new LanHanSyn();

		}
		return instance;
	}

	public void showMsg() {
		System.out.println("懒汉式，线程安全");
	}
}
