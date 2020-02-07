package exercises.technology;

public class Laptop extends Computer {

    private boolean unibodyDesign;

    public Laptop (String manufacturer, double ram, boolean touchScreen, boolean unibodyDesign) {
        super(manufacturer, ram, touchScreen);
        this.unibodyDesign = unibodyDesign;
    }

    // Getters & Setters

    public boolean isUnibodyDesign() {
        return unibodyDesign;
    }

    private void setUnibodyDesign (boolean designChange) {
        unibodyDesign = designChange;
    }

    // Instance Methods

    public void email(String emailBody) {
        System.out.println(emailBody);
    }

}
