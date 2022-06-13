public class WorkSchedule {
    public static void main(String[] args) {
        int day = 0;  
        boolean holiday = true;

        if (holiday) {
            System.out.println("woohoo, no work!");
        } 
        if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }

    }
}