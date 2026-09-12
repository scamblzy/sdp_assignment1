//product
public class Phone {
    private String brand;
    private String model;
    private String color;
    private int storage;
    private int ram;

    public Phone(){
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    //validation
    public void validate(){
        if (brand == null || brand.isBlank()){
            throw new IllegalArgumentException("Brand can't be empty");
        }

        if (model == null || model.isBlank()){
            throw new IllegalArgumentException("Model can't be empty");
        }

        if (color == null || color.isBlank()){
            throw new IllegalArgumentException("Color can't be empty");
        }

        if (storage <= 0) {
            throw new IllegalArgumentException("Storage can't be less than 0");
        }

        if (ram <= 0){
            throw new IllegalArgumentException("RAM can't be less than 0");
        }
    }

    //toString
    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", Color='" + color + '\'' +
                ", Storage=" + storage +
                ", RAM=" + ram +
                '}';
    }
}

