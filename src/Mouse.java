public class Mouse extends Heroes implements  Actions {
    private int capacity=1;
    @Override
    public void call(Heroes heroes) {

    }

    @Override
    public void pull() {
        if (this.capacity== Repka.repkaInTheEarth){
            System.out.println("Repka in the earth");

        }
        else{ System.out.println("Repka is our!");
        Repka.victory=true;
        }
    }
}
