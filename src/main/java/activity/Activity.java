package activity;

abstract class Activity {
    private String name;
    private String type;
    private double price;
    private int participant;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(double accessibility) {
        this.accessibility = accessibility;
    }

    public void printInfo() {
        System.out.println("Activity: " + name + " (" + type + " )");
    }

    String printAllInfo() {
        String info = "Information about activity is above.";
        System.out.print("Name: " + name + " | " + "Type: " + type + " | "
                + "Price: " + price + " | " + " Link:" + link + " | "
                + "Key: " + key + " | "
                + "accessibility = " + accessibility + "\n");
        return info;
    }




}
