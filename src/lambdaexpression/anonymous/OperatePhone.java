package lambdaexpression.anonymous;

public class OperatePhone {

    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void cellularNetwork(String network) {
                System.out.println("This phone is on the " + network + " network.");
            }
        };

        phone.cellularNetwork("Verizon");
    }

}
