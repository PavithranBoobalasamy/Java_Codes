enum OrderStatus {
    PLACED("Order placed successfully"),
    SHIPPED("Order shipped"),
    DELIVERED("Order delivered to customer"),
    CANCELLED("Order cancelled by user");

    private final String message;

    OrderStatus(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}
class Order {
    private int orderId;
    private OrderStatus status;

    Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void printStatus() {
        System.out.println("Order ID: " + orderId + " ➤ Status: " + status + " ➤ Message: " + status.getMessage());

        switch (status) {
            case PLACED:
                System.out.println("Prepare for shipping.");
                break;
            case SHIPPED:
                System.out.println("Out for delivery.");
                break;
            case DELIVERED:
                System.out.println("Thank customer!");
                break;
            case CANCELLED:
                System.out.println("Issue refund.");
                break;
        }
    }
}
public class EnumDemo {
    public static void main(String[] args) {
        Order o1 = new Order(101, OrderStatus.PLACED);
        Order o2 = new Order(102, OrderStatus.DELIVERED);
        Order o3 = new Order(103, OrderStatus.CANCELLED);

        o1.printStatus();
        System.out.println();

        o2.printStatus();
        System.out.println();

        o3.printStatus();

        System.out.println("\n=== Looping over Enum Values ===");
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status + " ➤ " + status.getMessage());
        }
    }
}
