public class Primitive {
    public static void main(String[] args) {
        testByte();
        testShort();
        testInt();
        testLong();
        testFloat();
        testDouble();
        testBoolean();
        testChar();
    }

    private static void testChar() {
        System.out.println();
        System.out.println("char");
        char a = '王';
        System.out.println("" + a + '子');
    }

    private static void testBoolean() {
        System.out.println();
        System.out.println("boolean");
        System.out.printf("%s   %s \r\n", true, false);
    }

    private static void testDouble() {
        System.out.println();
        System.out.println("double");
        System.out.printf("min=%e max=%e \r\n", Double.MIN_VALUE, Double.MAX_VALUE);
        double a = 32.1;
        double b = 3.23;
        System.out.printf("%f + %f =%f \r\n", a, b, a + b);
    }

    private static void testFloat() {
        System.out.println();
        System.out.println("float");
        System.out.printf("min=%f max=%f \r\n", Float.MIN_VALUE, Float.MAX_VALUE);
        float a = 32f;
        float b = 3.23f;
        System.out.printf("%f + %f =%f \r\n", a, b, a + b);
    }

    private static void testInt() {
        System.out.println();
        System.out.println("int");
        int a = Integer.MAX_VALUE;
        System.out.printf("min=%d max=%d \r\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int b = 2;
        System.out.printf("%d + %d =%d \r\n", a, b, a + b);
    }

    private static void testShort() {
        System.out.println();
        System.out.println("short");
        System.out.printf("Short min=%d max=%d \r\n", Short.MIN_VALUE, Short.MAX_VALUE);
    }

    private static void testByte() {
        System.out.println();
        System.out.println("byte");
        System.out.printf("min=%d max=%d \r\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
    }

    private static void testLong() {
        System.out.println();
        System.out.println("long");
        System.out.printf("min=%d max=%d \r\n", Long.MIN_VALUE, Long.MAX_VALUE);
    }
}