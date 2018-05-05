package pattern.factory.Abstract;

public class StateFactory extends AbstractFactory {
	@Override
	public State getState(String type) {
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("head")) {
			return new Head();
		} else if (type.equalsIgnoreCase("hand")) {
			return new Hand();
		} else if (type.equalsIgnoreCase("foot")) {
			return new Foot();
		}
		return null;
	}

	@Override
	Action getAction(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
