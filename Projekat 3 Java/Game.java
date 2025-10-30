package vjezbenedelja7;

import java.util.*;

public class Game { 
    private Player player;
    private ArrayList<Enemy> enemies = new ArrayList<>();
    private ArrayList<String> eventLog = new ArrayList<>(); //nizovi

    public Game(Player player) { //konstruktor za pleyera
        this.player = player;
    }

    public void addEnemy(Enemy e) { //dodaje enemija u listu i zapisuje event
        enemies.add(e);
        eventLog.add("ADDED: " + e.toString());
    }

    public boolean checkCollision(Player p, Enemy e) { //provjerava je li se desio collision
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) { //Smanjuje hp igrača na osnovu damagea enemija
        int dmg = e.getDamage();
        if (e instanceof BossEnemy) dmg *= 2;
        int oldHP = p.getHealth();
        int newHP = Math.max(0, oldHP - dmg);
        p.setHealth(newHP);
        eventLog.add("HIT: Player by " + e.getType() + " for " + dmg +
                     " -> HP " + oldHP + " -> " + newHP);
    }

    public List<Enemy> findByType(String query) { //traži enemije čiji tip sadrži tekst
        List<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (e.getType().toLowerCase().contains(query.toLowerCase())) {
                result.add(e);
            }
        }
        return result;
    }

    public List<Enemy> collidingWithPlayer() { // vraća listu enemya koji su se sudarili sa playerom
        List<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) result.add(e);
        }
        return result;
    }

    public void resolveCollisions() { // rješava kolizije igrača i enemija
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                decreaseHealth(player, e);
            }
        }
    }

    public void printEventLog() { // Ispisuje događaje
        for (String log : eventLog) {
            System.out.println(log);
        }
    }

    public void printEnemies() { // -ll- enemije
        for (Enemy e : enemies) {
            System.out.println(e);
        }
    }

    public Player getPlayer() { 
        return player;
    }
}

