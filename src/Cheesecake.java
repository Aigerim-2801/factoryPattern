public class Cheesecake extends Cake{

    public Cheesecake(){
        setName("Cheesecake");
        setPrice(3200);
    }

    public void recipe() {
        System.out.println("\n<< Cheesecake Recipe >>");
        System.out.println("1. Chop the cookies in a blender, add the melted butter to it and mix well.");
        System.out.println("2. Bake in a preheated 180 °C oven for 10 minutes. Then pull out and let the base cool.");
        System.out.println("3. Mix cheese and powdered sugar, sour cream and flour, egg.");
        System.out.println("4. Bake for 45 minutes at 160 ° C.");

    }

    @Override
    public void cutIntoPieces() {
        System.out.println("Also you can cut the Cheesecake into 4 pieces!");
    }
}

