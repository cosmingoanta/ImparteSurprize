
public class MinionToy implements ISurprise {
	private String minionName;
	private static int minionCounter = 0;
	private static final String[] names = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};

	private MinionToy(String minionName) {
		this.minionName = minionName;
	}

	static MinionToy generate() {
		MinionToy minion = new MinionToy(MinionToy.names[minionCounter]);
		minionCounter++;
		if(minionCounter == names.length) {
			minionCounter = 0;
		}
		return minion;
	}

	@Override
	public void enjoy() {
		System.out.println("This surprize contains a Minion. His name is: " + this.minionName + ". Enjoy!");
	}

}
