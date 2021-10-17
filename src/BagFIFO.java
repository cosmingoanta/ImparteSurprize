import java.util.ArrayList;

public class BagFIFO implements IBag{

	private ArrayList<ISurprise> bagFIFO;
	
	public BagFIFO() {
		bagFIFO = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		this.bagFIFO.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		for (int i = 0; i < bagOfSurprises.size(); i++) {
			this.bagFIFO.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if (isEmpty()) {
			return null;
		}
		return bagFIFO.remove(0);
	}

	@Override
	public boolean isEmpty() {
		return bagFIFO.isEmpty();
	}

	@Override
	public int size() {
		return bagFIFO.size();
	}
	
}