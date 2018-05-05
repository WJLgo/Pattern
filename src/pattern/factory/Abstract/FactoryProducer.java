package pattern.factory.Abstract;

/**
 * ����һ������������/�������࣬ͨ��������Ϣ����ȡ������
 * 
 * @author ����
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
