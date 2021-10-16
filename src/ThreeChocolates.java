public class ThreeChocolates extends Cake{


    public ThreeChocolates(){
        setName("ThreeChocolates");
        setPrice(8600);
    }

    public void recipe() {
        System.out.println("\n<< ThreeChocolates Recipe >>");
        System.out.println("1. Beat the softened butter with sugar and add the melted chocolate, mix.");
        System.out.println("2. Beat the eggs into a homogeneous mass, add to the chocolate mixture.");
        System.out.println("3. Sift flour with baking powder and salt, mix.");
        System.out.println("4. Put in a preheated 180 degree oven for 15-20 minutes.");

    }

    @Override
    public void cutIntoPieces() {
        System.out.println("Also you can cut the ThreeChocolates into 12 pieces!");
    }
}