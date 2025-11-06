public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah supreme = new SupremeBoohbah();
        SupremeBoohbah[] boohbahs = {
                new Humbah(),
                new Zumbah(),
                new Jumbah(),
                new Jingbah()
        };

        System.out.println("\n--- Boohbah Rebellion Begins ---");
        for (SupremeBoohbah booh : boohbahs){
            booh.command();
        }
        System.out.println("\n--- Overloaded Commands ---");
        supreme.command("Dance in perfect unison!");
        ((Jingbah) boohbahs[3]).command("please, no fighting!", true);
    }
}
