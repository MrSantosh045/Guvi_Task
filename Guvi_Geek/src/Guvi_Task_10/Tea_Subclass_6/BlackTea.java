package Guvi_Task_10.Tea_Subclass_6;

public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Black Tea with hot water, black tea leaves, and sugar (optional)...");
            isPrepared = true;
        } else {
            System.out.println("Black Tea is already prepared.");
        }
    }
}


