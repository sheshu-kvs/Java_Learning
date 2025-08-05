import java.util.*;



public class ArraysExamples {
    public static void main(String[] args) {
        // to declare the array we are using the square brackets
        // int a[]={10,20,30,40,50};
        // System.out.println("\n"+a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);
        // // System.out.println(a[5]);
        // // will get the exception like the Array Index Out of Bounds this value is not present in the array..
        // // System.out.println(a[6]);
        // // to access the array elements we can use the loops..
        // for(int i=0;i<a.length;i++){
        //     System.out.print("The array Elements:"+a[i]);
        // }

        // ====Using the Scanner class we can assign the values in the array===
        //  Scanner scan=new Scanner(System.in);

        //  int n=scan.nextInt();
        // //  to create the array we need to create the array object..
        // int a[]=new int[n];
        // System.out.println("Enter the array Elements..");
        // for(int i=0;i<a.length;i++){
        //     a[i]=scan.nextInt();

        // }
        // System.out.println("The array elements inside the array");
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        // int num=scan.nextInt();
        // String[] names=new String[num];
        // System.out.println("Enter the Names in the array that can be stored");
        // for(int i=0;i<names.length;i++){
        //     names[i]=scan.next();
        // }
        // System.out.println("Displaying the entered Names in the array..");
        // for(int i=0;i<names.length;i++){
        //     System.out.println(names[i]);
        // }
        // int i=0;
        // while(i<names.length){
        //  System.out.println(names[i]);
        //  i++;
        // }
        // int i=0;
        // do{
        //     System.out.println(names[i]);
        //     i++;
        // } while(i<names.length);




        // ====MultiDimensional Array====
       /*An multidimensional array are used to store the data in the table form like the rows and the columns 
        * this are used to {{curly braces of the each array}}
       */


//        int a[][]={{1,2,3},
//                   {4,5,6,7},
//                   {340,34,43,3445},
//                    {4}};
//     //    for(int i=0;i<a.length;i++){
//     //     for(int j=0;j<a[i].length;j++){
//     //         System.out.println(a[i][j]);

//     //     }
//     //    }
//     for(int i=0;i<a.length;i++){ //i is the rows
// // for(int j=0;j<a[i]){
// // System.out.println("Rows"+a[i].length);
// for(int j=0;j<a[i].length;i++){
//     System.out.println("\nRows and the Columns:"+a[i][j]);
// }
// // }  //j is the roows..
//     }
    // System.out.println("a length"+a.length);

 int a[][]={{1,2,3},
            {4,5,6,7},
            {340,34,43,3445},
            {4}};

                    for(int i=0;i<a.length;i++){
                        for(int j=0;j<a[i].length;j++){
                            System.out.println("Data in the Tables"+a[i][j]);
                        }
                    }


    }
    
}
