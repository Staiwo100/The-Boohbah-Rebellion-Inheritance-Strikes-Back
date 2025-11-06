public class Jumbah extends SupremeBoohbah{
    Jumbah(){
        super();
        name = "Jumbah";
        System.out.println(name + " refuses to kneel!");
    }
    @Override
    public void command(){
        System.out.println(name +" shouts: No more orders!");
    }
}

