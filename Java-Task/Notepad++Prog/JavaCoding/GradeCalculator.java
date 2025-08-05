package JavaCoding;

public class GradeCalculator {
    
    public static void main(String[] args) {
        int marks=90;
        if((marks>90) &&(marks>100)){
            System.out.println("Grade1..");
        }
        else if(marks>85 && marks<=90){
            System.out.println("Grade2 with the Distinction..");
        }
        else if((marks>=60) &&(marks<=80)){
            System.out.println("First Class..");
        }
    }
}
