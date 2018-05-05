package pattern.Singleton;

/**
 * 双重校验锁方式。
 * 
 * @author 阿浮
 *
 */
public class DCL {
//	volatile被不同线程访问和修改的变量
	private volatile static DCL instance;

	private DCL() {
	};

	public static DCL getInstance() {
		if (instance == null) {
			synchronized (DCL.class) {
				if (instance == null) {
					instance = new DCL();
				}
			}
		}
		return instance;
	}
	public void showMsg(){
		System.out.println("双重校验锁");
	}
}
