// Builder
public abstract class PhoneBuilder {

    protected final Phone phone = new Phone();

    //setters
    public PhoneBuilder setBrand(String brand) {
        phone.setBrand(brand);
        return this;
    }

    public PhoneBuilder setModel(String model) {
        phone.setModel(model);
        return this;
    }

    public PhoneBuilder setColor(String color) {
        phone.setColor(color);
        return this;
    }

    public PhoneBuilder setStorage(int storage) {
        phone.setStorage(storage);
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        phone.setRam(ram);
        return this;
    }

    public Phone build() {
        phone.validate();
        return phone;
    }
}