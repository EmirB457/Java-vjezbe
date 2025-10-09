package cetvrtanedelja;

public class Game1 {
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
		System.out.println("Enemy - X: " + x + ", Y: " + y + ", Width: " + width + ", Height: " + height + ", Health: " + health + ", Damage: " + damage);
	}

	public class Game {
		public static void main(String[] args) {
		    Player igrac = new Player(10, 10, 20, 20, 100);
		    Enemy neprijatelj = new Enemy(15, 15, 20, 20, 30);

		    decreaseHealth(igrac, neprijatelj);
		}

	    public static boolean checkCollision(Player p, Enemy e) {
	        return (p.getX() < e.getX() + e.getWidth() &&
	                p.getX() + p.getWidth() > e.getX() &&
	                p.getY() < e.getY() + e.getHeight() &&
	                p.getY() + p.getHeight() > e.getY());
	    }

	    public static void decreaseHealth(Player p, Enemy e) {
	        if (checkCollision(p, e)) {
	            int novoHealth = p.getHealth() - e.getDamage();
	            if (novoHealth < 0) {
	                novoHealth = 0;
	            }
	            p.setHealth(novoHealth);
	            System.out.println("Kolizija! Health smanjen na: " + p.getHealth());
	        }
	    }

	    public static void main(String[] args) {
	        Player igrac = new Player(10, 10, 20, 20, 100);
	        Enemy neprijatelj1 = new Enemy(15, 15, 20, 20, 30, 40);
	        Enemy neprijatelj2 = new Enemy(100, 100, 20, 20, 40, 50);

	        igrac.ispisi();
	        neprijatelj1.ispisi();
	        neprijatelj2.ispisi();

	        decreaseHealth(igrac, neprijatelj1); // Sudar
	        decreaseHealth(igrac, neprijatelj2); // Nema sudara

	        igrac.ispisi();
	    }
	}

}
