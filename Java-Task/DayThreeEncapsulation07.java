/*oop's Concepts
--Encapsulation
 * Each and every object is the important part that is the data to provide the security to that data we are using the private
 * Keyword controlled access through the setters and the getters.
 * to access that varible we need to use the private keyword..
 * 
 * example
 * class Alex {

    private int id;
    private String Name;
    private String Address;

    // to controlled access through the setters and getters
    // public Alex(int id, String Name, String Address) {
    //     this.id = id;
    //     this.Name = Name;
    //     this.Address = Address;
    // }
    public void SetId(int id) {
        this.id = id;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetAddress(String Address) {
        this.Address = Address;
    }

    public int getid() {
        return id;

    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

}

public class DayThree07 {

    public static void main(String[] args) {
        Alex a = new Alex();
        a.SetId(101);
        a.SetName(" Kumar");
        a.SetAddress("Mantralaya");
        System.out.println(a.getid());
        System.out.println(a.getName());
        System.out.println(a.getAddress());

    }
}
    /*Inhertency *
    A inhertency is the Accquiring the properties and the behaviours from the class to the another class/

 */
class Alex {

    private int id;
    private String Name;
    private String Address;

    // to controlled access through the setters and getters
    // public Alex(int id, String Name, String Address) {
    //     this.id = id;
    //     this.Name = Name;
    //     this.Address = Address;
    // }
    public void SetId(int id) {
        this.id = id;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetAddress(String Address) {
        this.Address = Address;
    }

    public int getid() {
        return id;

    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "Id:" + id + "Name" + Name + "Address:" + Address;
    }

}

public class DayThreeEncapsulation07 {

    public static void main(String[] args) {
        Alex a = new Alex();
        a.SetId(101);
        a.SetName(" Kumar");
        a.SetAddress("Mantralaya");
        a.getid();
        a.getName();
        a.getAddress();

    }
}
