// interface Greeting{
//     void message();
// }

// Using the Paramaters

interface calculator{
    void add(int a,int b);
}


public class Lamda123 {
    public static void main(String[] args) {
            // create the anonymous class with the Name of the Interface..
            // Using the Without the Lamda
//     //     Greeting m1 = new Greeting(){
//     //     public void message(){
//     //         System.out.println("Hey Hello Godd morning..");
//     //     } 
//     // };
//     // m1.message();        
//     // }
// // using the Lamda 

// Greeting g1= ()-> System.out.println("Saya Hello Morning");
// g1.message();


// calculator c1= new calculator(){
//     public void add(int a,int b){
//         // return a+b;
//         System.out.println(a+b);
//     }
// }; 
// System.out.println("");
// // System.out.println(c1.add(20, 30));
// // when wew are returing we need to print that
// c1.add(50, 60);
 

// Using the Lamda


calculator c1= (a,b)->{
    System.out.println(a+b);

};
c1.add(200, 30);

    }
}
