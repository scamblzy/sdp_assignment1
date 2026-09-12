// Concrete Builder2
public class XiaomiBuilder extends PhoneBuilder {

    public PhoneBuilder configureXiaomi() {
        return setBrand("Xiaomi")
                .setModel("Xiaomi 14")
                .setStorage(256)
                .setRam(8);
    }
}