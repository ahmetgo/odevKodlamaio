package odevKodlamaio;

public class GameManager{
	
	private Game game;
	
	public GameManager(Game game) {
		 this.game = game;
	}
	
	
	public void add() {
		System.out.println("Yeni oyun eklendi : " + game.getName() +" "+ 
	"Yeni oyun fiyat� : " + game.getPrice());
		
	}

	public void update() {
		System.out.println("Oyun bilgileri g�ncellendi : " + game.getName());
		
	}

	public void delete() {
		System.out.println("Oyun silindi : " + game.getName() );
		
	}

}
