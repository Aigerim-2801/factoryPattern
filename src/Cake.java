public abstract class Cake {

    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void recipe();
    public abstract void cutIntoPieces();
    public void aboutCake(){
        System.out.println("I am "+name);
        System.out.println("You can get " + name + " at " + price + " tg.");
        cutIntoPieces();
    }

    @Override
    public String toString() {
        return name;
    }
}
