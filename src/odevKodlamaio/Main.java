package odevKodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer("10101010101","Ahmet", "Ayhan", 2002);
		Game game = new Game(100, "CS-GO");
		Campaign campaign = new Campaign("Ramazan Bayramı Kampanyası", 20,0);
		
		
		
		GameManager gameManager = new GameManager(game);
		GamerManager gamerManager = new GamerManager(gamer);
		CampaignManager campaignManager = new CampaignManager(campaign);
		
		gamerManager.add();
		gamerManager.update();
		gamerManager.delete();
		System.out.println("----------------------------------");
		gameManager.add();
		gameManager.update();
		gameManager.delete();
		System.out.println("----------------------------------");
		campaignManager.add();
		campaignManager.useCampaign(campaign, game);
		campaignManager.update();
		campaignManager.delete();
		
		

	}

}
