// Concrete Builder1
public class IphoneBuilder extends PhoneBuilder {

    public PhoneBuilder configureIphone() {
        return setBrand("Apple")
                .setModel("iPhone Duo")
                .setStorage(512)
                .setRam(12);
    }
}