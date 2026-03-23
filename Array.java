public class Array implements ArrayInterface {

    private String[] members;
    private int size; 
    public Array(int capacity) {
      members = new String[capacity];
      size = 0;
    }
   

    public boolean insert(String name) {
      if (isFull()) {
        return false;
      }
      members[size] = name;
      size++; 
      return true;  
    }
  

  
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
  

    public int search(String name) {
      for (int i = 0; i < size; i++) {
        if (members[i].equals(name)) {
          return i;
        }
      }
      return -1;
    }
   

    public boolean update(String oldName, String newName) {
      int index = search(oldName);
      if (index == -1) {
        return false;
      }
      members[index] = newName;
      return true;
    }
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
 
    public boolean isFull() {
      return size == members.length; 
    }
  
  
  

  
    public boolean isEmpty() {
  
      return size == 0;
  
    }

    public int getCount() {
      return size;
    }
  
  }