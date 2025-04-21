import java.util.HashSet;
import java.util.Scanner;

public class HashSets{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        HashSet<String> set1 =new HashSet<>();
        HashSet<String> set2 =new HashSet<>();
       
        System.out.println("Enter the no. of elements for set1 :");
        int a=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<=a;i++){
            String element=sc.nextLine();
            set1.add(element);
        }
        System.out.println("Enter the no. of elements for set2 :");
        int b=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<=b;i++){
            String element=sc.nextLine();
            set2.add(element);
        }
        System.out.println("Set 1:"+set1);
        System.out.println("Set 2:"+set2);
        if(set1.equals(set2)){
            System.out.println("Both HashSets are equal");
        }
        else{
            System.out.println("Both HashSets are not equal");
        }
        if(set1.containsAll(set2)){
            System.out.println("Set 2 is a subset of set 1");
        }
        else{
            System.out.println("Set 2 is not subset of set 1");
        }
        sc.close();
    }
}
