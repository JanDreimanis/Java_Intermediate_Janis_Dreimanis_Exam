package activity;

import preparation.Preparation;

abstract class Activity {
    private String name;
    private String type;
    private double price;
    private String link;
    private String key;
    private double accessibility;


    public Activity() {
    }


    public Activity(String name, String type, double price, String link, String key, double accessibility) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.link = link;
        this.key = key;
        this.accessibility = accessibility;
    }


    public String getType() {
        return type;
    }

    public void printInfo() {
        System.out.println("Activity: " + name + " (" + type + ")");
    }


}
