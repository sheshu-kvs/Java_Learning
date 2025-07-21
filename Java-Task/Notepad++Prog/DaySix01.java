// An Array is the Collection of the Homegenous elements whic means
// An Array is the DataStructure that allows you to store the multiple values in the single variable





public class DaySix01{
public static void main(String[] args){
  // int a[]=new int[5];
  // Here the creating the array with the 5 elements now we need to intialize that array.
  // a[0]=15;
  // a[1]=20;
  // a[2]=25;
  // a[3]=30;
  // a[4]=35;
  
  // we can also decalre the array like this
  // int a[]={10,20,30,40,50};
  
  
  // Now we can modify the array elements 
  // a[4]=90;
  
  // we can find the length of the array using the lenght
  // System.out.println(a.length);
  
  // for(int i=0;i<a.length;i++){
	  // System.out.print(a[i]+" ");
  // }
  
  
  // we can also use the enhance for loop to fetch the each array elements
  
  // for(int num:a){
	  // System.out.print(num+" ");
  // }
  
  
  // Some Coding Questions on the Array
  // Max element in the Array
  
  // int a[]={119,252,100,90,50};
  
  // int max=Integer.MIN_VALUE;
  // for(int i=0;i<a.length;i++){
	  // if(a[i]>max){
		  
	  // max=a[i];
  // }
  // }
  // System.out.println(max);
  
  // Reverse an Array
  
  // Using the for loop
  // int a[]={1,2,3,4};
// for(int i=a.length-1;i>=0;i--){
	// System.out.print(a[i]+" ");
// }

// Using the while loop

 // int a[]={1,2,3,4};
 // int start=0;
 // int end=a.length-1;
 // while(start<end){
// int temp = a[start];
// a[start]=a[end];
// a[end]=temp;

// start++;
// end--;
 // }
 
 
 // for(int num:a){
	 // System.out.println(num+"");
 // }\
 
 
 
 // using the do while
  int a[]={1,2,3,4};
  int start=0;
  int end=a.length-1;
  do{
	  int temp=a[start];
	  a[start]=a[end];
	  a[end]=temp;
	  start++;
	  end--;
  }
  while(start<end);
  
  
  for(int num:a)
  {
	  System.out.print(num);
  }

}
}