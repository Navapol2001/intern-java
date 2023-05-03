package navapol.proj;

public interface Animal {
//    default void live() {
//        System.out.println("Yo");
//    }
    default String live() {
        //System.out.println("Animal is live");
        return "Animal is live";
    }
}
