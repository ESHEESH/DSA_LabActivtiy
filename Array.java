public class Array implements ArrayInterface {

    private String[] members;
    private int size; 
    public Array(int capacity) {
      members = new String[capacity];
      size = 0;
    }
   
    /*
     * Algorithm: insert(String name)
     * 1. Check if array is full → if yes, return false
     * 2. Store name at index size
     * 3. Increment size
     * 4. Return true
     */
    public boolean insert(String name) {
      if (isFull()) {
        return false;
      }
      members[size] = name;
      size++; 
      return true;  
    }
  
    /*
     * Algorithm: delete(String name)
     * 1. Find index of name using search()
     * 2. If not found (index = -1), return false 
     * 3. Shift elements to the left from index 
     * 4. Decrease size 
     * 5. Return true 
     */
  
    public boolean delete(String name) {
  
      int index = search(name);
      if (index == -1) {
        return false;
      }
      for (int i = index; i < size - 1; i++) {
        members[i] = members[i + 1];
      }
      size--;
      return true;
    }
  
    /*
     * Algorithm: search(String name)
     * 1. Loop from index 0 to size-1
     * 2. Compare each element with name
     * 3. If found, return index
     * 4. If not found, return -1
     */
    public int search(String name) {
      for (int i = 0; i < size; i++) {
        if (members[i].equals(name)) {
          return i;
        }
      }
      return -1;
    }
   
    /* 
     * Algorithm: update(String oldName, String newName)
     * 1. Find index of oldName using search()
     * 2. If not found, return false 
     * 3. Replace value at index with newName
     * 4. Return true 
     */
    public boolean update(String oldName, String newName) {
      int index = search(oldName);
      if (index == -1) {
        return false;
      }
      members[index] = newName;
      return true;
    }
  
    /*
     * Algorithm: display()
     * 1. Check if array is empty → print message if true
     * 2. Loop from 0 to size-1
     * 3. Print each member
     */
    public void display() {
      if (isEmpty()) {
        System.out.println("No members registered.");
        return;
      }

      System.out.print("Registered members: ");
      for (int i = 0; i < size; i++) {
        System.out.print(members[i]); 
        if (i < size - 1) {  
          System.out.print(", ");
        } 
      }  
      System.out.println();
  
    }
   /*
     * Algorithm: isFull()
     * 1. Compare size with array length
     * 2. If equal, return true
     * 3. Otherwise, return false
     */  
    public boolean isFull() {
      return size == members.length; 
    }
  
  
  
    /*
     * Algorithm: isEmpty() 
     * 1. Check if size is 0 
     * 2. Return true if empty, else false  
     */
  
    public boolean isEmpty() {
  
      return size == 0;
  
    }
    /*
     * Algorithm: getCount() 
     * 1. Return the value of size
    */
    public int getCount() {
      return size;
    }
  
  }