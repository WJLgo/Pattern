package mode.factory;

public class FactoryDemo {
	public static void main(String[] args) {
		HumanFactory humanFactory = new HumanFactory();
		Human children = humanFactory.getHuman("children");
		Human adult = humanFactory.getHuman("adult");
		Human old = humanFactory.getHuman("old");
		System.out.print("children:");
		children.age();
		System.out.print("adult:");
		adult.age();
		System.out.print("old:");
		old.age();
	}
}
