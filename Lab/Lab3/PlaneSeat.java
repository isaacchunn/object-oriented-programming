package Lab3;

public class PlaneSeat {
    // Instance variables
    private final int seatId;
    private boolean assigned;
    private int customerId;

    // Constructor
    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
        this.assigned = false;
        this.customerId = -1;
    }

    // Accessors and Mutators
    // - a get method that returns the seat number
    public int getSeatID() {
        return this.seatId;
    }

    // - a get method that returns the customer number
    public int getCustomerID() {
        return this.customerId;
    }

    // -a method that returns a boolean on whether the seat is occupied
    public boolean isOccupied() {
        return this.assigned;
    }

    // -a method that assigns a seat to a customer
    public void assign(int cust_id) {
        this.customerId = cust_id;
        this.assigned = true;
    }

    // - a method that unassigns a seat
    public void unAssign() {
        this.assigned = false;
    }

    @Override
    public String toString() {
        return seatId + "/" + customerId + "/" + this.assigned;
    }

}
