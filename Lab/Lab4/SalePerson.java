package Lab4;

//Question 5, implements the comparable interface
public class SalePerson implements Comparable<Object> {

    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson() {
        this.firstName = "First";
        this.lastName = "Last";
        this.totalSales = 0;
    }

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return this.lastName + "," + this.firstName + ": " + this.totalSales;
    }

    public boolean equals(Object o) {
        // if same object return true as equals is guaranteed
        if (this == o)
            return true;

        // Else can check class
        if (o == null || getClass() != o.getClass())
            return false;

        // // Can also do
        // if (!(o instanceof SalePerson))
        // return false;

        // Then we can cast our object
        SalePerson other = (SalePerson) o;

        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }

    @Override
    public int compareTo(Object o) {
        // if same object return true as equals is guaranteed
        if (this == o)
            return 0;
        // Else can check class
        if (o == null || getClass() != o.getClass())
            return 0;

        // Else we can do our casting
        SalePerson other = (SalePerson) o;

        // Do comparisons among objects
        // Check the names first
        if (this.totalSales < other.totalSales)
            return -1;
        else if (this.totalSales > other.totalSales)
            return 1;

        // Else its equal so we return compare to based on name
        // Inverse the result as we want ascending order, but we are doing descending
        // insertion.
        return this.lastName.compareTo(other.lastName) * -1;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }

}
