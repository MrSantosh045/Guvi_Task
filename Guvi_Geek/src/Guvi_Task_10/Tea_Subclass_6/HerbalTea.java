package Guvi_Task_10.Tea_Subclass_6;

public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Herbal Tea with hot water, herbal tea blend, and lemon (optional)...");
            isPrepared = true;
        } else {
            System.out.println("Herbal Tea is already prepared.");
        }
    }
}

