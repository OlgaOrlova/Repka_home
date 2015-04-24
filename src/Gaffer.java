public class Gaffer extends Heroes implements Actions {

    @Override
    public void call(Heroes heroes) {
        ((Granny)heroes).pull();
    }

    @Override
    public void pull() {
if (this.capacity== Repka.repkaOutOfEarth){
    System.out.println("Repka out of earth");

}
        else{
    System.out.println("Gaffer called granny");
             call(new Granny());}
    }
}
