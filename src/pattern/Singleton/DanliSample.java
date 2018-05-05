package pattern.Singleton;

/**
 * 单例最基本的实现
 * 
 * @author 阿浮
 *
 */
public class DanliSample {
	// 创建一个单例类的对象，设置为私有，从而实现内部私有创建
	private static DanliSample instance = new DanliSample();

	// 让构造器私有化，这样就不可以在单例类外被实例化。
	private DanliSample() {
	}

	// 返回单例类实例化的对象
	public static DanliSample getInstance() {
		return instance;
	}

	public void showMsg() {
		System.out.println("单例的简单实现");
	}
}
