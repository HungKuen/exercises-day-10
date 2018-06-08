package com.academy;

public class Tire {
    private String tire;
    private float weight;
    private String quality;

    public Tire(){
        this.tire = "Original";
        this.weight = 100f;
        this.quality = "Standard";

    }

   public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setTire(String tire) {
        this.weight = weight;
    }

    public String getTire() {
        return this.tire;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }


}
