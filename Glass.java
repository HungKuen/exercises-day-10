package com.academy;

public class Glass {

    private String frontWindow;
    private String backWindow;
    private String doorWindows;
    private float weightFront;
    private float weightBack;
    private float weightWindow;
    private float totalweight;

    public Glass() {
        this.frontWindow = "Standardfront";
        this.backWindow = "Standardback";
        this.doorWindows = "StandardWindow";
        this.weightBack = 40f;
        this.weightFront = 40f;
        this.weightWindow = 40f;
        this.totalweight = this.weightBack+this.weightFront+this.weightWindow;
    }

    public String getFrontWindow() {
        return frontWindow;
    }

    public void setFrontWindow(String frontWindow) {
        this.frontWindow = frontWindow;
    }

    public String getBackWindow() {
        return backWindow;
    }

    public void setBackWindow(String backWindow) {
        this.backWindow = backWindow;
    }

    public String getDoorWindows() {
        return doorWindows;
    }

    public void setDoorWindows(String doorWindows) {
        this.doorWindows = doorWindows;
    }

    public float getTotalWeight() {
        return totalweight;
    }

    public void setWeight(float weight) {
        this.totalweight = weight;
    }
}
