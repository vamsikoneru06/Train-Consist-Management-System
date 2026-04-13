
package main;

public class uc14 {
    public static void main(String[] args) {}

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    public static class Bogie14 {
        int capacity;

        Bogie14(int capacity) throws InvalidCapacityException {
            if(capacity <= 0)
                throw new InvalidCapacityException("Capacity must be > 0");
            this.capacity = capacity;
        }
    }
}