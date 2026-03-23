package reference;
public class App {
    public static void main(String[] args) {
        ArrayInterface array = new Array(5);

        System.out.println("SCHOOL CLUB MEMBER RECORD SYSTEM");
        System.out.println("Member list is empty: " + array.isEmpty());
        System.out.println("Current number of members: " + array.getCount());
        System.out.println();

        System.out.println("Register Ana: " + array.insert("Ana"));
        System.out.println("Register Ben: " + array.insert("Ben"));
        System.out.println("Register Carla: " + array.insert("Carla"));
        System.out.println("Register Diego: " + array.insert("Diego"));
        System.out.println("Register Ella: " + array.insert("Ella"));
        System.out.println("Register Faith: " + array.insert("Faith"));
        array.display();
        System.out.println("Member list is full: " + array.isFull());
        System.out.println("Current number of members: " + array.getCount());
        System.out.println();

        System.out.println("Search Carla: " + array.search("Carla"));
        System.out.println("Search Zoe: " + array.search("Zoe"));
        System.out.println();

        System.out.println("Update Carla to Chloe: " + array.update("Carla", "Chloe"));
        System.out.println("Update Mark to Miguel: " + array.update("Mark", "Miguel"));
        array.display();
        System.out.println();

        System.out.println("Delete Ben: " + array.delete("Ben"));
        System.out.println("Delete Noah: " + array.delete("Noah"));
        array.display();
        System.out.println("Member list is empty: " + array.isEmpty());
        System.out.println("Current number of members: " + array.getCount());
    }
}
