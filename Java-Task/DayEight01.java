import java.util.Arrays;
public class DayEight01 {
    public static void main(String[] args) {
        int num[]={43,12,12,2,3,4,14,4,23};
        Arrays.sort(num);
        int count=1;
        for(int i=0;i<num.length-1;i++){
            if(num[i]==num[i+1]){
              count++;
          }
          else{
            if(count==1){
                System.out.println(num[i]);
            }
            count=1;
          }
        }
        System.out.print(num[num.length-1]);
    }
}
