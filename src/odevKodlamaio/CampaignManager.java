package odevKodlamaio;

public class CampaignManager implements CampaignService{
	
	   private Campaign campaign;

	    public CampaignManager(Campaign campaign) {
	        this.campaign = campaign;
	    }

	@Override
	public void add() {
		System.out.println("Kampanya eklendi " + campaign.getCampaignName());
		
	}

	@Override
	public void update() {
		System.out.println("Kampanya güncellendi " + campaign.getCampaignName());
		
	}

	@Override
	public void delete() {
		System.out.println("Kampanya silindi " + campaign.getCampaignName());
		
	}
	
	@Override
	public void useCampaign(Campaign campaign, Game game) {
		double result = game.getPrice() - (campaign.getCampaignRate()*game.getPrice()/100);
		System.out.println("Yeni Fiyat: " + result);
	}

	
	
}
