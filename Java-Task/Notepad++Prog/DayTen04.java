// import java.util.Scanner;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// public class DayTen04{
// public static void main(String[] args){
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// int a[]=new int[n];
// for(int i=0;i<a.length;i++){
// a[i]=scan.nextInt();
// }
// missingNumber(a,n);
// }
// public static void missingNumber(int a[],int n){
// int expected=n*(n+1)/2;
// int actual=0;
// for(int a1:a){
// actual+=a1;
// }

// System.out.println(actual-expected);

// }
// }

public class DayTen04{
public static void main(String[] args){
	int a[]={1,2,2,3,4};
	int count=0;
	for(int i=0;i<a.length-1;i++){
	// if(a[i]==a[i+1]){
		// count++;
	// }
	// else{
	// System.out.println(a[i]);
	// count=1;
	// }
	if(a[i]!=a[i+1]){
		System.out.println(a[i]);
	}
	
}
}
}