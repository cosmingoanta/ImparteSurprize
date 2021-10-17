
public class Main {

	public static void main(String[] args) {


		ISurprise s1 = GatherSurprises.gather();
		ISurprise s2 = GatherSurprises.gather();
		ISurprise s3 = GatherSurprises.gather();

		s1.enjoy();
		s2.enjoy();
		s3.enjoy();
		
		GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("RANDOM", 0);

		g.put(s1);
		g.put(s2);
		g.put(s3);

		
		System.out.println("----------------------");

		g.giveAll();
		
		System.out.println("----------------------");
		
		GiveSurpriseAndHug g2 = new GiveSurpriseAndHug("FIFO", 0);
		
		ISurprise s4 = GatherSurprises.gather();
		ISurprise s5 = GatherSurprises.gather();
		ISurprise s6 = GatherSurprises.gather();
		
		g2.put(s4);
		g2.put(s5);
		g2.put(s6);
		
		s4.enjoy();
		s5.enjoy();
		s6.enjoy();
		
		System.out.println("----------------------");

		g2.giveAll();

		System.out.println("----------------------");
		
		GiveSurpriseAndSing g3 = new GiveSurpriseAndSing("LIFO", 0);
		
		ISurprise s7 = GatherSurprises.gather();
		ISurprise s8 = GatherSurprises.gather();
		ISurprise s9 = GatherSurprises.gather();
		
		g3.put(s7);
		g3.put(s8);
		g3.put(s9);

		
		s7.enjoy();
		s8.enjoy();
		s9.enjoy();
		
		System.out.println("----------------------");

		g3.giveAll();
		

	
	}

}
