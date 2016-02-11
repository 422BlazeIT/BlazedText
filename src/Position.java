public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	public boolean equals(Position other){
		if(x == other.x && y == other.y) {return true;}
		else{return false;}
		
	}
}
