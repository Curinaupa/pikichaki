package javaSE.stream;
@FunctionalInterface
public interface MyConverter {
    public String convertStr(String str);

    public static void isNull(String str) {
        if (str != null) {
            System.out.println("Str is not null");
        } else System.out.println("str is null");
    }
}
