public class ItalianCakeFactory implements CakeFactory {

    @Override
    public Cake createCake(String choice) {
        return new Tiramisu();
    }

}