import java.util.ArrayList;
import java.util.Random;

public class BagRandom implements IBag {

	private static Random random = new Random();
	private ArrayList<ISurprise> bagRandom;

	public BagRandom() {
		bagRandom = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.bagRandom.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		for (int i = 0; i < bagOfSurprises.size(); i++) {
			this.bagRandom.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if (bagRandom.size() == 0) {
			return null;
		}
		if (bagRandom.size() == 1) {
			return bagRandom.remove(0);
		}
		return bagRandom.remove(random.nextInt(bagRandom.size() - 1));
	}

	@Override
	public boolean isEmpty() {
		return bagRandom.isEmpty();
	}

	@Override
	public int size() {
		return bagRandom.size();
	}

}
