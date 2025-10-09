package cetvrtanedelja;

public class Player1 {
	

	public class Player {
	    private int x;
	    private int y;
	    private int width;
	    private int height;
	    private int health;

	    public Player(int x, int y, int width, int height, int health) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.health = health;
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public void setHealth(int health) {
	        if (health < 0) {
	            this.health = 0;
	        } else if (health > 100) {
	            this.health = 100;
	        } else {
	            this.health = health;
	        }
	    }

	    public void ispisi() {
	        System.out.println("Player -> x: " + x + ", y: " + y +
	                           ", width: " + width + ", height: " + height +
	                           ", health: " + health);
	    }
	}


}
