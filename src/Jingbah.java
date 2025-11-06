public class Jingbah extends SupremeBoohbah {
    Jingbah(){
        super();
        name = "Jingbah";
        System.out.println(name + " seeks harmony between Supreme and Rebels");
    }
    @Override
    public void command(){
        System.out.println(name +" says: Lets all take a deep breath");
    }

    public void command(String message, boolean whisper) {
        if (whisper == true){
            System.out.println(name+ " softly says: " + message);
        }else{
            System.out.println(name + "loudly says: " + message);
        }
    }
}

