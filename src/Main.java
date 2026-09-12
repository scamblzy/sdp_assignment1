//Client
public class Main {
    public static void main(String[] args) {

        Phone iphone = new IphoneBuilder()
                .configureIphone()
                .setColor("Black")
                .build();

        Phone xiaomi = new XiaomiBuilder()
                .configureXiaomi()
                .setColor("White")
                .build();

        System.out.println(iphone);
        System.out.println(xiaomi);
    }
}