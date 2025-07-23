import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class DayTen04{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++){
a[i]=scan.nextInt();
}
missingNumber(a,n);
}
public static void missingNumber(int a[],int n){
int expected=n*(n+1)/2;
int actual=0;
for(int a1:a){
actual+=a1;
}

System.out.println(actual-expected);

}
}

<<<<<<< HEAD
// public class DayTen04{
// public static void main(String[] args){
	// int a[]={1,2,2,3,4};
	// int count=0;
	// for(int i=0;i<a.length-1;i++){
	// if(a[i]==a[i+1]){
		// count++;
	// }
	// else{
	// System.out.println(a[i]);
	// count=1;
	// }
	// if(a[i]!=a[i+1]){
		// System.out.println(a[i]);
	// }
	
// }
// }
// }
/*Second Largest of the Number..*/
// public class DayTen04{
// public static void main(String[] args){
	// int a[]={10,5,12,24,34};
	// int p=0;
	// int vp=0;
	// for(int i=0;i<a.length;i++){
		// if(a[i]>p){
			// vp=p;
			// p=a[i];
		// }
		// else if(a[i]>vp){
			// vp=a[i];
		// }
	// }
	// System.out.println("Second Largest Element is the :"+vp);
	
// }
// }

/*Merge two Sorted Arrays..*/


public class DayTen04{
public static void main(String[] args){
	int a1[]={-1,-2,1,5,7};
	int a2[]={2,4,6,8,-10,-11};
int n[]=merge(a1,a2);
for(int n1:n){
	System.out.print(n1+" ");
}
	


}
public static int[] merge(int a1[],int a2[]){
	int n1=a1.length;
	int n2=a2.length;
	int i=0,j=0,k=0;
	int []res=new int[n1+n2];
	while(i<n1 && j<n2){
		if(a1[i]<a2[j]){
		res[k++]=a1[i++];
		}
		else{
		res[k++]=a2[j++];
		}
=======
public class DayTen04{
public static void main(String[] args){
	int a[]={1,2,2,3,4};
	int count=0;
	for(int i=0;i<a.length-1;i++){
	if(a[i]==a[i+1]){
		count++;
	}
	else{
	System.out.println(a[i]);
	count=1;
	}
	if(a[i]!=a[i+1]){
		System.out.println(a[i]);
>>>>>>> c8e296b81ff23e9186dd3b26826c22fa73d7a054
	}
	
	while(i<n1){
		res[k++]=a1[i++];
	}
	while(j<n2){
		res[k++]=a2[j++];
	}
	return res;

}
<<<<<<< HEAD

}
=======
}
}
>>>>>>> c8e296b81ff23e9186dd3b26826c22fa73d7a054
