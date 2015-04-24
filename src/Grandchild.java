public class Grandchild extends Heroes implements Actions {
    @Override
    public void call(Heroes heroes) {
        ((Juchka)heroes).pull();
    }

    @Override
    public void pull() {
        if (this.capacity== Repka.repkaOutOfEarth){
            System.out.println("Repka out of earth");

        }
        else call(new Juchka());

    }
}
