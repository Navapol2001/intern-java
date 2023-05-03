package navapol.proj;

public class AquaticAnimal implements Animal {
    @Override
    //void
    public String live() {
        Animal.super.live();
        return "Yo";
        //System.out.println("Yo");
    }
}
