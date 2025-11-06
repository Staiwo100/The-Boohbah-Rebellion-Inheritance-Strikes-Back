public class Humbah extends SupremeBoohbah {

    Humbah(){
        super();
        name = "Humbah";
        System.out.println(name + " kneels before the Supreme.");
    }
    @Override
    public void command(){
        System.out.println(name +" follows orders without question.");
    }
}
