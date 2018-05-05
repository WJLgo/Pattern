package pattern.factory.Abstract;

public class ActionFactory extends AbstractFactory {

	@Override
	Action getAction(String type) {
		// TODO Auto-generated method stub
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("walk")) {
			return new Walk();
		} else if (type.equalsIgnoreCase("run")) {
			return new Run();
		} else if (type.equalsIgnoreCase("Creep")) {
			return new Creep();
		}
		return null;
	}

	@Override
	State getState(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
