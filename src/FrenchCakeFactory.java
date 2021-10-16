public class FrenchCakeFactory implements CakeFactory {

    @Override
    public Cake createCake(String choice) { return new ThreeChocolates(); }

}
