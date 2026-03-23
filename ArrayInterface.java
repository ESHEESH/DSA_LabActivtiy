package Activity;

public interface ArrayInterface {

  boolean insert(String name);

  boolean delete(String name);

  int search(String name);

  boolean update(String oldName, String newName);

  void display();

  boolean isFull();

  boolean isEmpty();

  int getCount();

}


  