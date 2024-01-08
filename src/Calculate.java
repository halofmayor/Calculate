public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);//Pega no 2 valor recebido na consola e transforma em inteiro
        int y = Integer.parseInt(args[2]);
        if(args[0].equals("sum")) {
            sum(x, y);
        }
        if(args[0].equals("minus")) {
            minus(x, y);
        }
        if(args[0].equals("div") && y != 0) {
            div(x, y);
        }
        if(args[0].equals("multiply")) {
            multiply(x, y);
        }




    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void div(int x, int y) {
        System.out.println(x / y);
    }

    static void multiply(int x, int y) {
        System.out.println(x * y);
    }
}
