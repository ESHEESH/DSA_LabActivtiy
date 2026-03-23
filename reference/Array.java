package reference;

public class Array implements ArrayInterface {
    private String[] elements;
    private int size = 0;

    public Array() {
        this(10);
    }

    public Array(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }

        elements = new String[capacity];
    }

    // Algorithm:
    // 1. Check if the array is full.
    // 2. If full, return false.
    // 3. If not full, insert the new value into the next available position.
    // 4. Increase the element count by 1.
    public boolean insert(String name) {
        if (isFull()) {
            return false;
        }

        elements[size] = name;
        size++;
        return true;
    }

    // Algorithm:
    // 1. Compare the current element count with the array capacity.
    // 2. Return true if size is equal to capacity; otherwise, return false.
    public boolean isFull() {
        return size >= elements.length;
    }
}
