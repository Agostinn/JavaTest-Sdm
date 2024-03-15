public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        System.out.println(c1);

        Cliente c2 = new Cliente(1L, "Matheus", "2345678765432");
        System.out.println(c2);

        Cliente c3 = new Cliente(1L, "Matheus", "2345678765432");
        System.out.println(c3);
        if (c2.equals(c3)) {
            System.out.println("Iguais");
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
