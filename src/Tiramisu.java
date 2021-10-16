public class Tiramisu extends Cake{

    public Tiramisu(){
        setName("Tiramisu");
        setPrice(5400);
    }

    public void recipe() {
        System.out.println("\n<< Tiramisu Recipe >>");
        System.out.println("1. Carefully separate the yolks, combine them with sugar and whisk until smooth.");
        System.out.println("2. Brew coffee and pour some liqueur into it.");
        System.out.println("3. Dip savoyardi in coffee, and then put it on a plate.");
        System.out.println("4. Spread half of the cream evenly on top.");

    }

    @Override
    public void cutIntoPieces() {
        System.out.println("Also you can cut the Tiramisu into 8 pieces!");
    }
}