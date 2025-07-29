// Move Non Zeros at the End


public class DayNine01{
public static void main(String[] args){
int a[]={1,0,2,0,4};
int nonzero=0;
for(int i=0;i<a.length;i++){
if(a[i]!=0){
a[nonzero++]=a[i];
}
}
while(nonzero<a.length){
a[nonzero++]=;
}
for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
}
}
}


// Move Non Zeros at the Start..
import java.util.Scanner;
public class DayNine01{
public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array size..");
	int n=scan.nextInt();
	System.out.println("Enter the Array Elements");
	int a[]=new int[n];
	for(int i =0;i<a.length;i++){
		a[i]=scan.nextInt();
	}
	  
	movezerosFirst(a);
	
	


}
public static void movezerosFirst(int a[]){
	int zeroindex=a.length-1;
    for(int i=a.length-1;i>=0;i--){
	if(a[i]!=0){
		a[zeroindex--]=a[i];
         // zeroindex--;
	}
	}
	while(zeroindex>=0){
		a[zeroindex--]=0;
	}
	
	for(int i=0;i<a.length;i++){
		System.out.println("The Array elements index:"+i+":elements moved zeros"+a[i]);
	}
	
}
}
