public class Cat extends Heroes implements Actions {
    @Override
    public void call(Heroes heroes) {
        ((Mouse)heroes).pull();
    }

    @Override
    public void pull() {
        if (this.capacity== Repka.repkaOutOfEarth){
            System.out.println("Repka out of earth");

        }
        else {
            System.out.println("Cat called mouse");
            call(new Mouse());
        }
    }
}
