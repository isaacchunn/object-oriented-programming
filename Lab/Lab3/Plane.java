package Lab3;

public class Plane {
    public static final int MAX_SEATS = 12;
    // Instance variable containing information on then seats in the plane. It is
    // declared as an array of 12 seat objects
    private PlaneSeat[] seat;
    // Instance variable containing information on the number of empty seats
    private int numEmptySeat;

    public static void print(PlaneSeat[] seats) {
        for (PlaneSeat planeSeat : seats) {
            System.out.println(planeSeat);
        }
    }

    // Constructor
    public Plane() {
        //Initialize the seats
        seat = new PlaneSeat[MAX_SEATS];
        // Loop through and assign a seat id to each object in seat
        for (int i = 0; i < seat.length; i++) {
            this.seat[i] = new PlaneSeat(i + 1);
        }
        this.numEmptySeat = MAX_SEATS;
    }

    // Instance variables

    // - a method to sort the seats according to ascending order of customerID
    // copy of the original seat array is used for sorting instead of original
    public PlaneSeat[] sortSeats() {
        // Deep copy
        PlaneSeat[] sorted = this.seat.clone();
        // print(sorted);
        // Bubble sort for now... to get it to work
        for (int i = 0; i < sorted.length; i++) {
            if (!sorted[i].isOccupied())
                continue;
            for (int j = i; j < sorted.length; j++) {
                // if previous one was larger, move this index forward (a lot of wasted
                // repetitions though)
                if (!sorted[j].isOccupied())
                    continue;
                if (sorted[j].getCustomerID() < sorted[i].getCustomerID()) {
                    PlaneSeat temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
            }
        }
        return sorted;
    }

    // - a method to display the number of empty seats
    public void showNumEmptySeats() {
        System.out.println("There are " + this.numEmptySeat + " empty seats");
    }

    // - a method to display the list of empty seats
    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (int i = 0; i < seat.length; i++) {
            if (!seat[i].isOccupied())
                System.out.println("SeatID " + seat[i].getSeatID());
        }
    }

    // - a method to display the assigned seats with seat id and customer id
    // - if bySeatId is true, the order will be by seatID, else order is by customer
    // ID
    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("The seat assignments are as follow:");
        if (bySeatId) {
            for (int i = 0; i < seat.length; i++) {
                if (seat[i].isOccupied()) {
                    System.out.println(
                            "SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID()
                                    + ".");
                }
            }
        } else {
            PlaneSeat[] sortedSeats = sortSeats();
            for (int i = 0; i < sortedSeats.length; i++) {
                if (sortedSeats[i].isOccupied()) {
                    System.out.println(
                            "SeatID " + sortedSeats[i].getSeatID() + " assigned to CustomerID "
                                    + sortedSeats[i].getCustomerID()
                                    + ".");
                }
            }
        }
    }

    // - a method that assigns a customer ID to an empty seat
    public void assignSeat(int seatId, int cust_id) {
        // Try to assign
        // IF seat already occupied, print error and just return
        if (seat[seatId - 1].isOccupied()) {
            System.out.println("Seat already assigned to a customer.");
            return;
        }

        // Else call assign
        seat[seatId - 1].assign(cust_id);
        // Update our num empty seats
        this.numEmptySeat--;
        System.out.println("Seat Assigned!");
    }

    // A method that unassigns a seat
    public void unAssignSeat(int seatId) {
        // Call unassign function
        this.seat[seatId - 1].unAssign();
        // Increment number of empty seats
        this.numEmptySeat++;
        System.out.println("Seat Unassigned!");
    }
}
