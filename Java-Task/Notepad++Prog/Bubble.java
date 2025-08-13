public class Bubble{
public static void main(String[] args){
int a[]={10,12,0,1,90,11,14,1};
int n=a.length;
System.out.println(n);
for(int i=0;i<a.length;i++){
for(int j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int a1:a){
	System.out.print(a1+" ");
}
}
}