package JavaCoding;
import java.util.*;
public class UniqueArray {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,3,4,5};
        int a2[]={11,0,11,0,3,4};
        int a3[]={1,2,3,-1,5,-1,10,-1};
        int a4[]={10,20,30,40,50,60};
        // if a[i]!=0 
        // duplicate(a);
        // unique(a);
        // uniquBala(a);
            //    shiftZerosEnd(a2);
               shiftZerosFront(a3);
        // duplicateBala(a);
        // uniqueBala(a);
        MyUnderStanding(a4);
}
private static void MyUnderStanding(int[] a4) {
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Number of the Elements in the Array:"+a4.length);
    System.out.println("Last index value of the Array"+(a4[a4.length-1]));
    }
private static void shiftZerosEnd(int[] a2) {
    int nonzer=0;
    for(int i=0;i<a2.length;i++){
         if(a2[i]!=0){
            a2[nonzer++]=a2[i];
         }
    }
    while(0>a2.length){
        a2[nonzer++]=0;
    }

    for(int i=0;i<a2.length;i++){
        System.out.println(a2[i]);
    }
   
    }
    private static void shiftZerosFront(int[] a2) {
    int nonzer=a2.length-1;
    System.out.println(nonzer);
    for(int i=a2.length-1;i>=0;i--){
         if(a2[i]!=-1){
            a2[nonzer--]=a2[i];
         }
    }
    while(nonzer>=0){
        a2[nonzer--]=-1;
    }
System.out.println(" ");
System.out.println(" ");
    for(int i=0;i<a2.length;i++){
    System.out.println(a2[i]);
    }
   
    }
public static void unique(int a[]){
     HashSet<Integer> seen1 = new HashSet<>();
    HashSet<Integer> duplicates1 = new HashSet<>();
    ArrayList<Integer> uniqueList = new ArrayList<>();

    // First pass: Identify duplicates
    for (int num : a) {
        if (seen1.contains(num)) {
            duplicates1.add(num);
        } else {
            seen1.add(num);
        }
    }

    // Second pass: Collect elements that are not duplicates
    for (int num : a) {
        if (!duplicates1.contains(num)) {
            uniqueList.add(num);
        }
    }

    // Convert to array
    int[] uniqueArray = new int[uniqueList.size()];
    for (int i = 0; i < uniqueList.size(); i++) {
        uniqueArray[i] = uniqueList.get(i);
    }

    System.out.println("Unique elements: " + Arrays.toString(uniqueArray));
}
public static void duplicate(int a[]){
     HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        ArrayList<Integer> aarr=new ArrayList<>();
        for(int a1:a){
            if(seen.contains(a1) && (!duplicates.contains(a1))){
                duplicates.add(a1);
                aarr.add(a1);

            }
            seen.add(a1);
        }
        int dup[]=new int[aarr.size()];
        for(int i=0;i<aarr.size();i++){
            dup[i] = aarr.get(i);
        }
        System.out.println("Duplicates in the Array "+Arrays.toString(dup));
}

public static void uniquBala12(int a[]){
    int uniq=0;
    int count=1;
    Arrays.sort(a);
    for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            count++;
        }else{
            if(count==1){
                uniq++;

            }
            count=1;
        }
    }
    if(count==1){
        uniq++;
    }

}
public static void duplicateBala(int a[]){
    Arrays.sort(a);
    int count=1;
    int dupCount=0;
    for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            count++;
        }
        else{
            if(count>1){
                // System.out.println(a[i]);
                dupCount++;
            }
            count=1;
        }
    }
    if(count>1){
        //  System.out.println(a[a.length-1]);
        dupCount++;

    }
     int duplicates[]=new int[dupCount];
     int index=0;
     count=1;
     for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            count++;
        }
        else{
            if(count>1){
                duplicates[index++]=a[i];
            }
            count=1;
        }
     }
     if(count>1){
        duplicates[index++]=a[a.length-1];
     }

     System.out.println("\nDuplicate Elements: "+Arrays.toString(duplicates));
   
}
public static void uniqueBala(int a[]){
    Arrays.sort(a);
    int count=1;
    int dupCount=0;
    for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            count++;
        }
        else{
            if(count==1){
                // System.out.println(a[i]);
                dupCount++;
            }
            count=1;
        }
    }
    if(count==1){
        //  System.out.println(a[a.length-1]);
        dupCount++;

    }
     int duplicates[]=new int[dupCount];
     int index=0;
     count=1;
     for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            count++;
        }
        else{
            if(count==1){
                duplicates[index++]=a[i];
            }
            count=1;
        }
     }
     if(count==1){
        duplicates[index++]=a[a.length-1];
     }

     System.out.println("Unique"+Arrays.toString(duplicates));
   
}
}