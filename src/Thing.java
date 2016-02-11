public class Thing
{
	private Position pos = new Position(0,0);
	private int id;
	private String name;

	public Thing(int x, int y, int identity, String name) {
		pos.setX(x);
		pos.setY(y);
		id = identity;
		this.name = name;
	}
	
	public int getX (){
		return pos.getX();
	}
	public int getY (){
		return pos.getY();
	}
	
	
}