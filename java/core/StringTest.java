public class StringTest {
    public static void main(String[] args) {
        String a = "中国";
        System.out.println(a.substring(1, 2));
        System.out.println(a + 960 + "万");
        System.out.printf("a equal A:%b \r\n", "a".equals("A"));
        System.out.printf("ignore case, a equal A:%b \r\n", "a".equalsIgnoreCase("A"));
        a += 960 + "万";
        System.out.printf("code point count of \'%s\' is %d \r\n", a, a.codePointCount(0, a.length()));
        for (int i = 0; i < a.length(); i++)
            System.out.print(a.charAt(i));
        System.out.println();
    }
}