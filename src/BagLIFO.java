import java.util.ArrayList;

public class BagLIFO implements IBag{

	private ArrayList<ISurprise> bagLIFO;
	
	public BagLIFO() {
		bagLIFO = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		this.bagLIFO.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		for (int i = 0; i < bagOfSurprises.size(); i++) {
			this.bagLIFO.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if(isEmpty()) {
			return null;
		}
		return bagLIFO.remove(bagLIFO.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return bagLIFO.isEmpty();
	}

	@Override
	public int size() {
		return bagLIFO.size();
	}
	
}