package pattern.factory.Abstract;

/**
 * 创建一个工厂创造器/生成器类，通过传递信息来获取工厂。
 * 
 * @author 阿浮
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFatory(String factory) {
		if (factory.equalsIgnoreCase("action")) {
			return new ActionFactory();
		} else if (factory.equalsIgnoreCase("state")) {
			return new StateFactory();
		}
		return null;
	}
}
