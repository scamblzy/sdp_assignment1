# Phone Builder Pattern

## Description

This project demonstrates the **Builder design pattern** in Java.

The product is a `Phone` with several configurable characteristics:
- Brand
- Model
- Color
- Storage
- RAM

The Builder pattern allows phones to be constructed step by step and supports different phone configurations.

## Project Structure

- `Phone` - Product
- `PhoneBuilder` - Abstract Builder
- `IphoneBuilder` - Concrete Builder for iPhone
- `XiaomiBuilder` - Concrete Builder for Xiaomi
- `Main` - Client

## Building Phone Representations

### iPhone

```java
Phone iphone = new IphoneBuilder()
        .configureIphone()
        .setColor("Black")
        .build();
```

### Xiaomi

```java
Phone xiaomi = new XiaomiBuilder()
        .configureXiaomi()
        .setColor("White")
        .build();
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Compile the source code.
4. Run the `Main` class.

## Example Output

```text
Phone{Brand='Apple', Model='iPhone Duo', Color='Black', Storage=512, RAM=12}
Phone{Brand='Xiaomi', Model='Xiaomi 14', Color='White', Storage=256, RAM=8}
```