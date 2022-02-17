public class main_task4 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < args.length; i++) {
            a *= Integer.parseInt(args[i]);
        }
        System.out.println("Multiplication is: " + a);
    }
}
