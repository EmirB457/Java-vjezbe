package vjezbenedelja7;

public class TestGame {

	public static void main(String[] args) {
		
		Player p = new Player(" peTar petrović ", 10, 5, 32, 32, 85); //kreira se player
        Game game = new Game(p);// kreira se game i povezuje sa igračem

        	MeleeEnemy e1 = new MeleeEnemy("Orc", 15, 5, 16, 16, 10, 50);// kreira se enemy koji koristi melee oružje
		    game.addEnemy(e1);// dodaje ga

		    String input = "Goblin;12,5;16x16;20;boss"; //dodaje se goblin
		    String[] parts = input.split(";"); // string ide u pojedinačne djelove
		    String type = parts[0];
		    String[] pos = parts[1].split(",");
		    String[] size = parts[2].split("x");
		    int damage = Integer.parseInt(parts[3]);
		    String enemyType = parts[4];

		        Enemy e2;
		        if (enemyType.equalsIgnoreCase("boss")) { //za boss enemije
		            e2 = new BossEnemy(type, Integer.parseInt(pos[0]), Integer.parseInt(pos[1]),
		                               Integer.parseInt(size[0]), Integer.parseInt(size[1]),
		                               damage, 120);
		        } else {
		            e2 = new MeleeEnemy(type, Integer.parseInt(pos[0]), Integer.parseInt(pos[1]),
		                                Integer.parseInt(size[0]), Integer.parseInt(size[1]),
		                                damage, 60);
		        }
		        game.addEnemy(e2); //dodaje druge enemije

		        System.out.println("📋 Svi neprijatelji:"); //ispisuje sve neprijatelje
		        game.printEnemies();

		        System.out.println("\n🔍 Pretraga po tipu 'gob':"); //provjerava enemije koji sadrže gob da vidimo je li goblin
		        for (Enemy e : game.findByType("gob")) {
		            System.out.println(e);
		        }

		        System.out.println("\n🧍 Stanje igrača prije kolizije:");
		        System.out.println(game.getPlayer()); // Pokazuje player health prije kolizije

		        game.resolveCollisions(); // metoda za kolizije

		        System.out.println("\n🧍 Stanje igrača nakon kolizije:");
		        System.out.println(game.getPlayer()); //player health nakon kolizije

		        System.out.println("\n📜 Dnevnik događaja:"); //printuje događaje
		        game.printEventLog();
		    }
		}
