// An 2d Array is the numer of the rows and the number of the columns




public class  DaySix02{
public static void main(String[] args){
	int a[][]={
		{1,2,3},
		{4,5,6},
	    {7,8,9}};
		
		// Modifying the 2d array
	// a[0][0]=10;
	// a[0][1]=20;
	// a[0][2]=30;
	// a[1][0]=40;
	// a[1][1]=50;
	// a[1][2]=60;
	// a[2][0]=70;
	// a[2][1]=80;
	// a[2][2]=90;

	
	
	
	int rows=a.length;
	int columns=a[0].length;
	
	
	// Addition of the  2d array
	int sum=0;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			sum=sum+a[i][j];
		}
			System.out.println();
		}
		
		System.out.print(sum);
		
		
	
	
	
	// for(int i=0;i<a.length;i++){
		// for(int j=0;j<a[i].length;j++){
			// System.out.print(a[i][j]+" ");
		// }
			// System.out.println();
		// }
	
	// 
	
	System.out.println("Number of the Rows "+rows);
	System.out.println("Number of the Columns "+columns);
	
	
	
	
	// System.out.println(a[][]);
		
		// System.out.println(a[0][1]);
		
	// an Array this is the 3 rows and the 3 columns
	
}
}