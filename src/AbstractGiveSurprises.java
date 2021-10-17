import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises{

	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises() {
		
	}
	
	public AbstractGiveSurprises(String type, int time) {
		bag = BagFactory.getInstance().makeBag(type);
		this.waitTime = time;
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);

	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public void give() {
		ISurprise surp = bag.takeOut();
		if (surp != null) {
		surp.enjoy();
		this.giveWithPassion();
		} else {
			System.out.println("Error! No surprises in the bag.");
		}
	}

	public void giveAll() {
		while (!bag.isEmpty()) {
			ISurprise surp = bag.takeOut();
			surp.enjoy();
			this.giveWithPassion();
			// Sleep for X seconds - code snippet
			try {
				TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean isEmpty() {
		return bag.isEmpty();
	}
	
	protected abstract void giveWithPassion();
}
