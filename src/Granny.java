public class Granny extends Heroes implements Actions{
    @Override
    public void call(Heroes heroes) {
        ((Grandchild)heroes).pull();
    }

    @Override
    public void pull() {
        if (this.capacity== Repka.repkaOutOfEarth){
        System.out.println("Repka out of earth");

    }
    else {
            System.out.println("Granny called grandchild");
            call(new Grandchild());
        }
    }
}
