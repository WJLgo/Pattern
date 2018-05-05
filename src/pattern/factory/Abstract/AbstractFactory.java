package pattern.factory.Abstract;

public abstract class AbstractFactory {
	abstract Action getAction(String type);

	abstract State getState(String type);
}
