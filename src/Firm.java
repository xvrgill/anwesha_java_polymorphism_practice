public class Firm {
    public static void main(String[] args) {
        Staff personnel = new Staff();
        // Embedded vacation day function call in below function to support clear printing
        personnel.payday();
        // Alternative solution is to call vacationDaysExplicit method - this is duplicitous if both functions called in one location
        // vacationDaysExplicit can be called separately if only basic info is needed including vacation days
    }
}