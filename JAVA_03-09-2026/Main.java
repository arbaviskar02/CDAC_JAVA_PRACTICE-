public class Main {
    public static void main(String[] String) {
        Train expressTrain = new Train(12626, "New Delhi", "Bengaluru", 50);

        expressTrain.displayTrainInfo();

        expressTrain.bookTicket(15);
        expressTrain.displayTrainInfo();

        expressTrain.bookTicket(40);
        expressTrain.displayTrainInfo();
    }
}