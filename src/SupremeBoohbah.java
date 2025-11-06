public class SupremeBoohbah {
    protected String name;
    SupremeBoohbah(){
        name = "Zing Zing Zingbah";
        System.out.println("SupremeBoohbah awakens!");
    }
    public void command() {
        System.out.println("All must obey " + name);
    }
    public void command(String message){
        System.out.println(name + " proclaims: "+message);
    }

    @Override
    public String toString() {
        return "SupremeBoohbah: " + name;
    }
}
