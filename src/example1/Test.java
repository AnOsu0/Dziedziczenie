package example1;

public class Test {
    public static void main(String[] args) {

        Tire tire1 = new Tire("Michelin","8978","super","winter",
                3, 4);
        System.out.println(tire1.getIdNUmber() + " " + tire1.getSize());
    }
}
