public class JapaneseCakeFactory implements CakeFactory {

    @Override
    public Cake createCake(String choice) { return new Cheesecake(); }

}
