package pattern.factory.Abstract;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// ��ȡ����
		AbstractFactory actionFactory = FactoryProducer.getFatory("action");
		// ��ȡ����
		Action action1 = actionFactory.getAction("Creep");
		// ����action����
		action1.speed();
		Action action2 = actionFactory.getAction("run");
		action2.speed();
		Action action3 = actionFactory.getAction("walk");
		action3.speed();

		AbstractFactory stateFactory = FactoryProducer.getFatory("state");
		State head = stateFactory.getState("head");
		head.name();
		State hand = stateFactory.getState("hand");
		hand.name();
		State foot = stateFactory.getState("foot");
		foot.name();

	}
}
