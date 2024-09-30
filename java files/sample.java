import java.util.Arrays;
import java.util.Scanner;
public class sample 
    // Class content goes here


{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("program which conatins all the basics");
        System.out.println("hello,world!");
        byte a = 127;// can only values ranging from -128 to 127
        int b = 997;//conatins 2 bytes of memory 
        long c = 9380411856L;//needs the suffix L/l otherwise compiler might treat as int
        float d=3.14F;//needs the suffix F/f otherwise compiler might treat as double
        double e=3.141592653589793238462643383279502884197D; //irrespective of D/d compiler knows its double 
        String name1="dhrubru";
        System.out.println("length of the name= "+name1.length());
        //string functions- conactenation,length,replace,obtaining substring 
        String name2="welcome";
        String name3= name1+" "+name2;
        String name4=name1.replace('r','x');
        System.out.println(name4);//prints the replaced name 
        System.out.println(name3);//prints the concated version of the string 
        System.out.println(name2.substring(0,3));//prints the substring according respective indices
        //in c++ or other languages when certain array does'nt contain any value then it has some garbage value stored, but in java we get default null values stored.
        //example- for int its 0. for boolean its False. for string its null etc.  
        float [] n1 = new float [3];
        n1[0]=65.9875F;
        n1[1]=75.124F;
        n1[2]=7.8907F;
        //arrays can be directly asigned using curly braces 
        //int a[]={23,45,56} (example)
        System.out.println(n1[0]);//gives unsorted value
        Arrays.sort(n1);
        System.out.println(n1[0]);//gives sorted value 
        int [][] n2 = {{23,45},{66,78}};
        System.out.println(n2[1][1]);
        int i=9;
        System.out.println(i++);//prints 9
        System.out.println(++i);//prints 11
        System.out.println(Math.max(23467,213454));//prints maximun value- similarlly we have min and random(range-0.0 to 1.0 ) function etc.
        System.out.println((int)(Math.random()*100));//here, we can type cast to get only int value but intially, we would get 0 (cause its the only considered int lower value than 1 in random function-) hence, to get proper value we multiply value with 100 first and then we type cast.
        System.out.println("enter your fav quote");
        String s1= sc.nextLine();//accepts the entire line of string rather just a word
        System.out.println(s1);
    } 


}  