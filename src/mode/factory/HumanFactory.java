package mode.factory;

public class HumanFactory {
	public Human getHuman(String humanType) {
		if(humanType==null){
			return null;
		}
		if(humanType.equalsIgnoreCase("OLD")){
			return new Old();
		}
		if(humanType.equalsIgnoreCase("children")){
			return new Children();
		}
		if(humanType.equalsIgnoreCase("adult")){
			return new Adult();
		}
		return null;
	}
}
