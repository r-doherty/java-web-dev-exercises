package exercises.technology;

public class Computer extends AbstractEntity {

    // Fields & Properties

    private String manufacturer;
    private double ram;
    private boolean touchScreen;

    // Constructor

    public Computer (String manufacturer, double ram, boolean touchScreen)
    {
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.touchScreen = touchScreen;
    }

    // Getters & Setters

    public String getManufacturer() {
        return manufacturer;
    }

    private void setManufacturer(String newManufacturer)
    {
        manufacturer = newManufacturer;
    }

    public double getRAM() {
        return ram;
    }

    private void setRAM(double newRAM)
    {
        ram = newRAM;
    }

    public boolean getTouchScreen() {
        return touchScreen;
    }

    private void setTouchScreen(boolean touchCapability)
    {
        touchScreen = touchCapability;
    }

    // Instance Methods

    public double sumNumbers(double numOne, double numTwo)
    {
        return numOne + numTwo;
    }

    public boolean divisibleBy(double numberToBeDivided, double divisor)
    {
        if(numberToBeDivided % divisor == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
