package Guvi_Task_10.Tea_Subclass_6;

public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Green Tea with hot water, green tea leaves, and honey (optional)...");
            isPrepared = true;
        } else {
            System.out.println("Green Tea is already prepared.");
        }
    }
}

