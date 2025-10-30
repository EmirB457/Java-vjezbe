package vjezbenedelja7;

public class Player extends GameObject { //uzimamo atribute iz GameObjecta
    private String name;// atribute za ime i health
    private int health;

    public Player(String name, int x, int y, int width, int height, int health) { //konstruktori
        super(x, y, width, height);
        setName(name);
        setHealth(health);
    }

    public String getName() { return name; } //geteri i seter za ime igrača 
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) return;
        String[] parts = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(Character.toUpperCase(part.charAt(0)))
              .append(part.substring(1).toLowerCase()).append(" ");
        }
        this.name = sb.toString().trim(); 
    }

    public int getHealth() { return health; } //getter setter za health koji provjerava da li je health više ili jednako nuli ili manje ili jednako od 100
    public void setHealth(int health) {
        if (health >= 0 && health <= 100) this.health = health;
    }

    @Override
    public String toString() { //to string metoda za opis igrača
        return "Player[" + name + "] @ (" + getX() + "," + getY() + ") " +
               getWidth() + "x" + getHeight() + " HP=" + health;
    }
}
