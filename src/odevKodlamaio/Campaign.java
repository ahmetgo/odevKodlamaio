package odevKodlamaio;

public class Campaign {
		private String campaignName;
		private double campaignRate;
		private double useCampaign;
		


		public Campaign(String campaignName, double campaignRate, double useCampaign) {
			super();
			this.campaignName = campaignName;
			this.campaignRate = campaignRate;
			this.useCampaign = useCampaign;
		}

		
		public String getCampaignName() {
			return campaignName;
		}

		public void setCampaignName(String campaignName) {
			this.campaignName = campaignName;
		}

		public double getCampaignRate() {
			return campaignRate;
		}

		public void setCampaignRate(double campaignRate) {
			this.campaignRate = campaignRate;
		}


		public double getUseCampaign() {
			return useCampaign;
		}


		public void setUseCampaign(double useCampaign) {
			this.useCampaign = useCampaign;
		} 
}
