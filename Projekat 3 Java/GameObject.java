package vjezbenedelja7;

//Semir Bralić 23/050; Emir Balijagić 23/083

public class GameObject {
    private int x, y, width, height; //atributi

    public GameObject(int x, int y, int width, int height) { //konstruktor
        setX(x); setY(y); setWidth(width); setHeight(height);
    }

    public int getX() { return x; } // geteri i seteri za koordinate, širinu i visinu
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getWidth() { return width; }
    public void setWidth(int width) {
        if (width > 0) this.width = width;
    }

    public int getHeight() { return height; }
    public void setHeight(int height) {
        if (height > 0) this.height = height;
    }

    public boolean intersects(GameObject other) {  //metoda koja provjerava koliziju
        return this.x < other.x + other.width &&
               this.x + this.width > other.x &&
               this.y < other.y + other.height &&
               this.y + this.height > other.y;
    }

    @Override
    public String toString() {  //tekstualni opis objekta
        return "GameObject @ (" + x + "," + y + ") " + width + "x" + height;
    }
}
