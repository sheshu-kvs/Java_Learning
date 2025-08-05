package JavaCoding;


/*A String is the Sequence of the Characters enclosed with the double quotes..
 * A string is the immutable which means cannot be changed..
 * A String can also changed using the String Buffer and  String Builder..
 * in the String pool  there are the constant pool and the non constant pool
 * in the Constant pool can be the without using the duplicates and the without using the new keyword..
 * in the non Constant pool can be the duplicates are the allowed and using the new keyword..   
 * == Or .equals
 * Are used to the == are used compare the references and the values ||.equals are used to the compare the Values.. 
*/


public class Strings {
    public static void main(String[] args) {
        // String str="Alex,Java";
        // String str1="AlexA";
        // // 
        // String str2="Alex";
        // char [] ch=str.toCharArray();
        // ch[0]='Z';
        // System.out.println(" "+ch[0]);
        // System.out.println(" "+ch[1]);
        // System.out.println(" "+ch[2]);
        // System.out.println(" "+ch[3]);
        // String str3=new String("Alex");
        
        // System.out.println(str==str2);
        // System.out.println(str.substring());

    //     if(str1==str3){
    //         System.out.println("references are the equal..");
    //     }
    //     else{
    //         System.out.println("References are not equal..");
    //     }
    //    if(str1.equals(str3)){
    //     System.out.println("the values are equal");
    //     }
    //     else{
    //         System.out.println("The Values are not Equal");
    //     }
    //     // if(){

    //     // }
    //     // else{

    //     // }

    //     System.out.println(str.substring(0,2));
    //     for(int i=0;i<str1.length();i++){
    //          char []ch=str1.toCharArray();
    //          System.out.println(str1.indexOf(ch[i]));

            //  the indexOf() are used only the index it will give the index values then it can be the if the given value is the
            // same what is the index are there for the first value it will print that index value only..
            // it will also check the case also for the given values..
            // }

            // =====String Methods====
            /* Mthods
             * concat
             * +
             * toLowerCase()
             * toUpperCase();
             * substring(index values);
             * indexOf(1);
             * valueOf() ::are used for the  type conversion.. 
             * equals
             * equalIgnoreCase
             * replace('actula value','replacing value')
            */


            // int a=123;
            // String str1=String.valueOf(a);
            // float b=14.5f;
            // String str2=String.valueOf(b);
            // double b1=14.345435;
            // String str3=String.valueOf(b1);
            // long b2=12345678890987654l;
            // String str4=String.valueOf(b2);

            // System.out.println("Convertong the Integer to the String:"+str1);
            // System.out.println("Converting the float to the String:"+str2);
            // System.out.println("Converting the Double to the String:"+str3);
            // System.out.println("Converting the Long to the String:"+str3);

            // AutoBoxing are used to the Converting the primitive datatype  to the wrapper class..



            // String str="Hello Java";
            int a=12345;
            Integer Wrapper=Integer.valueOf(a);
            System.out.println("Converting the primitive datatypes to the Wrapper Classes:"+Wrapper);
            float b=534444.12f;
            Float WrapperFloat=Float.valueOf(b);
            System.out.println(WrapperFloat);
            boolean primitivebool=true;
            Boolean b1=Boolean.valueOf(primitivebool);
            System.out.println("conveting the primitive bool to the Wrapper");
            String str="HeLLo";
            System.out.println(str.replace("H","hello"));
          
        }
    }
    
