import java.util.ArrayList;

public class ArraLst1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(90);
        a1.add(60);

        System.out.println(a1.remove(2));
        System.out.println(a1);
    }
    
}
