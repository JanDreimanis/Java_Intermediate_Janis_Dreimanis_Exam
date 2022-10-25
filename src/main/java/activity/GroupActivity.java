package activity;

public class GroupActivity extends Activity {
    private int participant;

    public GroupActivity(String name, String type, double price, String link, String key, double accessibility, int participant) {
        super(name, type, price, link, key, accessibility);
        this.participant = participant;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\n" + participant + " will participate in this activity.");
    }

}
