
public class Game {

	public static void main(String[] args) {
		MC Hero = new MC(50, 50, 0, "tom", 10, 5);
		while(true){
			int x = Hero.getX();
			int y = Hero.getY();
			System.out.println("x: " + x  + "\ny: " + y);
			
		}
		
	}

}
