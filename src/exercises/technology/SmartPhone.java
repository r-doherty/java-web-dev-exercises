package exercises.technology;

public class SmartPhone extends Computer {

    private String cameraModel;

    public SmartPhone (String manufacturer, double ram, boolean touchScreen, String cameraModel){
        super(manufacturer, ram, touchScreen);
        this.cameraModel = cameraModel;
    }

    // Getters & Setters

    public String getCameraModel() {
        return cameraModel;
    }

    private void setCameraModel (String newCamera) {
        cameraModel = newCamera;
    }

    // Instance Methods

    public void openApp(String appName) {
        System.out.println("Opening ... " + appName);
        System.out.println(appName + " is now open! Have fun!");
    }

}
