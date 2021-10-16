import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cake cake = null;

        System.out.println("Which Cake you would like to eat Cheesecake/Tiramisu/ThreeChocolates : ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        scanner.close();
        CakeFactory cakeFactory= new ItalianCakeFactory() ;
        cake=cakeFactory.createCake(choice);
        if (choice.equals("Cheesecake")) {
            cake = new Cheesecake();
        } else if (choice.equals("Tiramisu")) {
            cake = new Tiramisu();
        } else if (choice.equals("ThreeChocolates")) {
            cake = new ThreeChocolates();
        }

        cake.aboutCake();
        cake.recipe();
    }
}