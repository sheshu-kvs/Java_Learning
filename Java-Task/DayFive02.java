/*For loop is used to execute fixed number of the Times
 * in this we have the intialization,condition,incrementation/decrementation. 
 *        int num=10;
        for(int i=0;i<num;i++){
            System.out.println("The Numbers: "+i)
        }

         int num[]={10,20,30,40,50};
        for(int i=0;i<num.length;i++){
            System.out.println("Each element of the Array: "+num[i]);
        }
              for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" *"+" ");
            }
            System.out.println();
// the Even Number are the From the 1 20
              int num=20;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println("The Even Number Are the:"+i);
            }
        }
        }

        // Factorial
         Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scan.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("The Fact Of the Number is:"+fact);
          System.out.println("Enter the Number");
        int num=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
            reverse the String 
             Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String Name=scan.nextLine();
        for(int i=Name.length()-1;i>=0;i--){
            char ch=Name.charAt(i);
            System.out.print(+ch);
        }

             // for(int i=0;i<Name.length();i++){
            // System.out.print(Name.substring(0,2));
            // System.out.print(Name.substring(3));



            .equals is the Case Sensitive it will compare the both the values.
            the both the value should be the equal.


               String s1="Sheshu";
        String s2="Sheshu";
        String s3=new String("Sheshu");
        

        // if(s1==s2){
        //     System.out.println("References are the Equal");
        // }
        // else{
        //     System.out.println("References are not Equal");
        // }
        System.out.println(s1==s2);
        // it is used to the both the references are the same
        System.out.println(s1==s3);
        // .equals used to compare the both the values..
          int num=10;
        do{
            System.out.println(num);
            num--;
        }while(num>0);
        System.out.println("Blast!!");


        // multiplication of the table from the 1 to 10
        public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" X "+j+"="+(i*j));
            }
            System.out.println();
        }

// even Numbers

         int num=50;
      for(int i=0;i<=num;i++){
        if(i%2==0){
            System.out.println("Even Numbers"+i);
        }
      }


      using while the sum of the two Numbers

      int num[]={1,2,3,4};
        int sum=0;
        int index=0;
        do{
            sum=sum+num[index];
            // System.out.println(num[index]);
            index++;

        }while(num.length>index);
        System.out.println("the sum of the two Numbers"+sum);
  */
import java.util.Scanner;
public class DayFive02 {
    public static void main(String[] args) {
        // int num[]={1,2,3,4};
        // for(int i=num.length-1;i>=0;i--){
        //     System.out.print(num[i]+" ");
        // }
        // if(num)
        Scanner scan=new Scanner(System.in);
        Integer num=121;
        Integer originalNum=num;
        Integer rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
       if(originalNum.equals(rev)){
        System.out.println("Yes It is the Palindrome..");
       }
       else{
        System.out.println("Yes it is not the Plaindrome..");
       }

        // Integer a=10;
        // Integer b=10;
        // System.out.println(a.equals(b));
       
      
     
      
    }    
}
