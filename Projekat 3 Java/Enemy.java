package vjezbenedelja7;

public class Enemy extends GameObject { //preuzima atribute iz GameObject klase
    private String type; //atributi za tip, damage, health
    private int damage;
    private int health;

    public Enemy(String type, int x, int y, int width, int height, int damage, int health) { //konstruktor
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() { return type; } //geter i seter za tip enemija
    public void setType(String type) {
        if (type != null && !type.trim().isEmpty()) {
            this.type = type.trim();
        }
    }

    public int getDamage() { return damage; } //geter seter za damage koji takođe provjerava je li damage veći od nula ili manje od 100
    public void setDamage(int damage) {
        if (damage >= 0 && damage <= 100) this.damage = damage;
    }

    public int getHealth() { return health; } //geter seter
    public void setHealth(int health) {
        if (health >= 0 && health <= 100) this.health = health;
    }

    @Override
    public String toString() { //to string metoda
        return "Enemy[" + type + "] @ (" + getX() + "," + getY() + ") " +
               getWidth() + "x" + getHeight() + " DMG=" + damage + " HP=" + health;
    }
}
