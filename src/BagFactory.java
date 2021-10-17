
public class BagFactory implements IBagFactory{
	
	private static BagFactory bag;
	
	private BagFactory(){
		
	}

	public static BagFactory getInstance() {
		if (bag == null) {
			bag = new BagFactory();
		}
		return bag;
	}
	
	@Override
	public IBag makeBag(String type) {
		
		switch(type) {
		case "RANDOM":
			return new BagRandom();
		case "FIFO":
			return new BagFIFO();
		case "LIFO":
			return new BagLIFO();
		default:
			return null;
		}
	}

}
