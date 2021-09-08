public class gasReader {
    public static void main(String[] args) {
        int milesTillEmpty = 76;
        if (milesTillEmpty < 40) {
            System.out.println("Gas tank low, refuel immediately!");
        } else {
            System.out.println("You have " + milesTillEmpty + " miles till empty.");
        }
    }
}
