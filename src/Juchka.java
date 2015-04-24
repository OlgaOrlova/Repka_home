public class Juchka extends Heroes implements  Actions {
    @Override
    public void call(Heroes heroes) {
        ((Cat)heroes).pull();
    }

    @Override
    public void pull() {
        if (this.capacity== Repka.repkaOutOfEarth){
            System.out.println("Repka out of earth");

        }
        else{
            System.out.println("Juchka called cat");
            call(new Cat());
        }
    }
}
