package activity;

public class GroupActivity extends Activity {
    private int participants;

    public GroupActivity(String name, String type, double price, String link, String key, double accessibility, int participants) {
        super(name, type, price, link, key, accessibility);
        this.participants = participants;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\n" + participants + " participants will participate in this activity.");
    }

}
