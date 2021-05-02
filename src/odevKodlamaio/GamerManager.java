package odevKodlamaio;

public class GamerManager implements BaseManager{
	
	private Gamer gamer;
	
	public GamerManager(Gamer gamer) {
		 this.gamer = gamer;
	}
	
	
	@Override
	public void add() {
		System.out.println("Oyuncu eklendi: " + gamer.getName());
	}
	
	@Override
	public void update() {
		System.out.println("Oyuncu güncellendi: " + gamer.getName());
	}
	
	@Override
	public void delete() {
		System.out.println("Oyuncu silindi: " + gamer.getName());
	}
	
}
