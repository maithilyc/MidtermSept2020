package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {

        // Please implement anonymous class for interface laptop
        // Laptop laptop = new Laptop(){}

        // Create a new Laptop.
        // Since "Laptop" is an interface, none of its methods have concrete definitions.
        // A Laptop must implement two methods ramSize and monitorSize.
        Laptop laptop = new Laptop() {
            public void ramSize(int memorySize) {
                System.out.println("RAM size is " + memorySize);
            }

            public void monitorSize(int screenSize) {
                System.out.println("Monitor size is " + screenSize);
            }
        };

        laptop.ramSize(5000);
        laptop.monitorSize(400);
    }

}
