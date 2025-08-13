package JavaCoding;

import java.util.Scanner;

public class Taks_Ans {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        String s1 = scan.nextLine();
        // replaceString(s1);
        replaceString2(s1);

        // System.out.println("Enter the Base:");
        // double base=scan.nextInt();
        // System.out.println("Enter the Exponenet");
        // double Expo=scan.nextInt();
        // powValue(base,Expo);

        // System.out.println("Enter the Number");
        // int n=scan.nextInt();
        // natu(n);

        // System.out.println("Enter the Number of the Array Elements");
        // int num=scan.nextInt();
        // int a1[]=new int[num];
        // for(int i=0;i<a1.length;i++){
        // a1[i]=scan.nextInt();
        // }
        // SumOf(a1);

        // System.out.println("Enter the Celsius:");
        // double celsius1=scan.nextDouble();

        // ConvertCelToFah(celsius1);

        // System.out.println("Enter the Principal:");
        // int p=scan.nextInt();
        // System.out.println("Enter the Time:");
        // float t=scan.nextFloat();
        // System.out.println("Enter the rate:");
        // int r=scan.nextInt();

        // simple(p,t,r);

        // System.out.println("Enter the Number:");
        // int num=scan.nextInt();
        // countNum(num);

        // System.out.println("Enter the Numbers to Swap:");
        // System.out.println("Enter the Num1");
        // int num1=scan.nextInt();
        // System.out.println("Enter the Num2");
        // int num2=scan.nextInt();
        // Swap(num1,num2);

        // System.out.println("Enter the String: ");
        // String str=scan.nextLine();
        // System.out.println("Enter the character to find..");
        // char char12=scan.next().charAt(0);
        // Ocuur1234(str,char12);

        // System.out.println("Enter the Right Angle Triangle Number:");
        // int num=scan.nextInt();
        // rigthAngle(num);

        // System.out.println("Enter the String:");
        // String str=scan.nextLine();
        // Upper(str);

        // System.out.println("Enter the Number: ");
        // int num=scan.nextInt();
        // sumofOdd(num);

        // Second Largest

        // System.out.println("Enter the Number");
        // int num=scan.nextInt();
        // int a1[]=new int[num];
        // for(int i=0;i<a1.length;i++){
        // a1[i]=scan.nextInt();
        // }
        // SecodLarge(a1);

        // remove Vowels

        // System.out.println("Enter the String:");
        // String str=scan.nextLine();

        // removeVowel(str);

        // Avg

        // System.out.println("Enter the Number you want ");
        // int num=scan.nextInt();
        // scan.nextLine();
        // System.out.println("Enter the Numbers in the same row seppareted space");
        // String numbers=scan.nextLine();
        // avg(num,numbers);

    }

    private static void replaceString2(String s1) {
        String t = "";
        String trimed = s1.trim();
        // System.out.println(trimed);

        // for(int i=0;i<trimed.length();i++){
        // char ch=trimed.charAt(i);
        // // if((ch==' ') && (!Charactch==' 'er.isWhitespace(ch))){
        // if(ch==' '){
        // t=t+ch+"-";
        // }
        // else{
        // t=t+ch;
        // }
        // }
        // System.out.println(t);
        String under = trimed.replaceAll("\\s+", "-");
        System.out.println(under);
    }

    private static void avg(int num, String numbers) {
        String val[] = numbers.split(" ");
        System.out.println(val.length);
        if (val.length != num) {
            System.out.println("Please enter the valid input Enter the three numbers");
            return;

        }
        try {
            // double num1=Double.parseDouble(val[0]);
            // double num2=Double.parseDouble(val[1]);
            // double num3=Double.parseDouble(val[2]);
            double sum = 0;
            double avg = 0;
            for (int i = 0; i < val.length; i++) {
                sum += Double.parseDouble(val[i]);
            }
            avg = sum / num;
            System.out.println("Average of the numbers" + avg);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private static void removeVowel(String str) {
        char vowels = "aeiouAEIOU".toLowerCase().charAt(0);
        String val = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(val);
    }

    private static void SecodLarge(int[] a1) {
        int p = 0, vp = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > p) {
                vp = p;
                p = a1[i];
            } else if (a1[i] > vp) {
                vp = a1[i];
            }
        }
        System.out.println(vp);
    }

    private static void sumofOdd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i = i + 2) {
            sum = sum + i;

        }
        System.out.println("Sum of the Odd Numbers " + sum);
    }

    private static void Upper(String str) {
        String upper = str.toUpperCase();
        System.out.println("Upercase String: " + upper);
    }

    private static void rigthAngle(int num) {

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void Avg(String val) {

    }

    private static void Ocuur1234(String str, char char12) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == char12) {
                count++;
            }
        }
        System.out.println("Occurance of the Entered character in the String: " + count);

    }

    private static void Swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The Num1 Val1 " + num1);
        System.out.println("The Num2 Val2 " + num2);
    }

    private static void simple(int p, float t, int r) {
        float val = (p * t * r) / 100;
        System.out.println("Simple Interst is " + val);
    }

    private static void ConvertCelToFah(double celsius1) {
        double fahern = (celsius1 * 9 / 5) + 32;
        System.out.println("Faherneheit Value: " + fahern);
    }

    public static void replaceString(String s1) {
        String changedString = s1.replaceAll("\\s", "_");
        System.out.println(" ");
        System.out.println("Changed String: " + changedString);
        // String s35=s1.replace('J','M');
        // System.out.println(s35);
    }

    private static void powValue(double base, double expo) {
        double val = Math.pow(base, expo);
        // System.out.println(val);
        int val2 = (int) val;
        System.out.println(val2);
    }

    private static void natu(int n) {
        // for(int i=1;i<=n;i++){
        // System.out.println(i);
        // }
        int i = 1;
        // while(i<=n){
        // System.out.println(i);
        // i++;
        // }
        do {
            System.out.println(i);
            i++;

        } while (i <= n);
    }

    private static void SumOf(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("The Sum of the All arraya Elements is: " + sum);
    }

    private static void countNum(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println("The Total Numbers Entered: " + count);
    }
}
