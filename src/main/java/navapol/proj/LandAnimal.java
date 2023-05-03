package navapol.proj;

public class LandAnimal implements Animal {
    @Override
    //void
    public String live() {
        Animal.super.live();
        //System.out.println("Hell Yeah");
        return "Hell Yeah";

    }
}
