package pattern.Singleton;

/**
 * 测试单例模式
 * 
 * @author 阿浮
 *
 */
public class DanliDemo {
	public static void main(String[] args) {
		// 错误代码，不合法构造函数，构造函数对外不可见
		// DanliSample instance= new DanliSample();
		// 最简单的单例原理
		// 获取唯一可用对象
		DanliSample danli = DanliSample.getInstance();
		danli.showMsg();

		// 懒汉式线程不安全
		LanHanNoSyn baohan_instance = LanHanNoSyn.getInstance();
		baohan_instance.showMsg();

		// 懒汉式，线程安全
		LanHanSyn lanhan_instance = LanHanSyn.getInstance();
		lanhan_instance.showMsg();

		// 饿汉式，线程安区
		EHan ehan_instance = EHan.getInstance();
		ehan_instance.showMsg();

		// 双重校验锁
		DCL dcl_instance = DCL.getInstance();
		dcl_instance.showMsg();

		// 静态内部类
		NeiBuLei nei_instance = NeiBuLei.getInstance();
		nei_instance.showMsg();
	}
}
