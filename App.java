public class App {
  
    public static void main(String[] args) {
      Array club = new Array(5);

      System.out.println("SCHOOL CLUB MEMBER RECORD SYSTEM");
      System.out.println("Member list is empty: " + club.isEmpty()); 
      System.out.println("Current number of members: " + club.getCount());  
      System.out.println(); 
      System.out.println("Register Ana: " + club.insert("Ana"));
      System.out.println("Register Ben: " + club.insert("Ben"));  
      System.out.println("Register Carla: " + club.insert("Carla")); 
      System.out.println("Register Diego: " + club.insert("Diego")); 
      System.out.println("Register Ella: " + club.insert("Ella"));
      System.out.println("Register Faith: " + club.insert("Faith"));   
      club.display();
      System.out.println("Member list is full: " + club.isFull());
      System.out.println("Current number of members: " + club.getCount());
      System.out.println();
      System.out.println("Search Carla: " + club.search("Carla"));
      System.out.println("Search Zoe: " + club.search("Zoe"));
      System.out.println();  
      System.out.println("Update Carla to Chloe: " + club.update("Carla", "Chloe"));
      System.out.println("Update Mark to Miguel: " + club.update("Mark", "Miguel"));
      club.display();
      System.out.println(); 
      System.out.println("Delete Ben: " + club.delete("Ben"));
      System.out.println("Delete Noah: " + club.delete("Noah"));
      club.display();
      System.out.println("Member list is empty: " + club.isEmpty());
      System.out.println("Current number of members: " + club.getCount());
    }
  
  }