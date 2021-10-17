
public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String type, int time) {
		super(type, time);
	}

	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}


}
