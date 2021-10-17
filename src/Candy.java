import java.util.Random;

public class Candy implements ISurprise{

	private int piecesOfCandy;
	private static final String[] candyType = {"chocolate", "jelly", "fruits", "vanilla"};
	private String typeOfCandy;
	private static Random random = new Random();
	
	private Candy(int piecesOfCandy, String typeOfCandy) {
		this.piecesOfCandy = piecesOfCandy;
		this.typeOfCandy = typeOfCandy;
	}
	static Candy generate() {
		int piecesOfCandy = random.nextInt(1000); 
		Candy candy = new Candy(piecesOfCandy, Candy.candyType[random.nextInt(4)]); 
		return candy;
	}
	
	@Override
	public void enjoy() {
		System.out.println("This surprize contains " + this.piecesOfCandy + " pieces of " + this.typeOfCandy + " candy. Enjoy!");
	
	
	}
	
}
