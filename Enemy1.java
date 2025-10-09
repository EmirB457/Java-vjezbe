package cetvrtanedelja;

public class Enemy1 {
	

	public class Enemy {
	    private int x;
	    private int y;
	    private int width;
	    private int height;
	    private int health;
	    private int damage;

	    public Enemy(int x, int y, int width, int height, int health, int damage) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.health = health;
	        this.damage = damage;
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
	        this.health = health;
	    }

	    public int getDamage() {
	        return damage;
	    }

	    public void setDamage(int damage) {
	        this.damage = damage;
	    }

	    public void ispisi() {
	        System.out.println("Enemy -> x: " + x + ", y: " + y +
	                           ", width: " + width + ", height: " + height +
	                           ", health: " + health + ", damage: " + damage);
	    }
	}


}
