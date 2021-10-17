import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

	private static Random random = new Random();

	private GatherSurprises() {

	}

	public static ArrayList<ISurprise> gather(int n) {
		
		ArrayList<ISurprise> result = new ArrayList<ISurprise>();
		for (int i = 0; i < n; i++) {
			result.add(gather());
		}
		return result;
	}

	public static ISurprise gather() {
		
		int aux = random.nextInt(3);
		if (aux == 0) {
			return Candy.generate();
		} else if (aux == 1) {
			return FortuneCookie.generate();
		} else {
			return MinionToy.generate();
		}
	}
}
