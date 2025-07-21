


import java.util.*;			
public class DaySeven01{
	
public static void main(String[] args){
	
	
	/* To count the array elements..*/
 int num[]={10,20,30,40};
 int count=0;
 for(int i=0;i<num.length;i++){
	 count++;
}
System.out.println(count);
// System.out.println(num.length);


print the even  Numbers  in the array

int num[]={10,20,2,30,4,50,6,70};
for(int i=2;i<num.length;i=i+2){
System.out.println(num[i]);
}
}
}

Print even-indexed elements (0, 2, 4, 

 int num[]={10,20,2,30,4,50,6,70};
for(int i=0;i<num.length;i=i+2){
System.out.println(num[i]);
}
}
}


// Find the index of a given element (Linear Search).

 // int num[]={10,20,2,30,4,50,6,70};
 
 // int target=6;
// for(int i=0;i<num.length;i=i+1){
// System.out.println(num[i]);
// if(num[i]==target){
	// System.out.println(i);
// }


// }
// }
// }


// Check if an element exists in an array.




// int num[]={10,20,2,30,4,50,6,70};
 
// int target=790;
// for(int i=0;i<num.length;i=i+1){
// System.out.println(num[i]);
// if(num[i]==target){
	// System.out.println("Element Present at this index"+i);
// }
// }

	// System.out.println("The Element not present in the array:");
// }
// }
// }



// Find the largest element in an array.



// int num[]={-1,-12,0,5,1,-34};
// int large=num[0];

// for(int i=0;i<num.length;i++){
	// if(num[i]>large){
		// large=num[i];
	// }
// }
// System.out.println("The Largest element is the:"+large);
// }
// }



// Find the smallest element in an array.



// int num[]={-1,-12,0,5,1,-34};
// int small=num[0];

// for(int i=0;i<num.length;i++){
	// if(num[i]<small){
		// small=num[i];
	// }
// }
// System.out.println("The Smallest element is the:"+small);
// }
// }



// Count occurrences of a number in an array.

// int num[]={1,2,1,1,2,3,4,4};
// int num[]={1,5,1,3,4,3,4,23,2};


// Arrays.sort(num);





// int count=1;

// for(int i=0;i<num.length-1;i++){
	// if(num[i]==num[i+1]){
		// count++;
	// }
	// else{
		// System.out.println(num[i]+":"+count);
		// count=1;
	// }
// }
// System.out.println(num[num.length-1]+":"+count);
// }
// }


// or

int num[]={1,5,1,3,4,3,4,23,2};
int n=num.length;

boolean visited[]=new boolean[n];


for(int i=0;i<num.length;i++){
	if(visited[i]){
		continue;
	}
int count=1;
for(int j=i+1;j<num.length;j++){
	if(num[i]==num[j]){
		count++;
		visited[j]=true;
	}
}
System.out.println(num[i]+":"+count);
}
}
}
	
