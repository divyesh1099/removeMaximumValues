import java.util.LinkedList;
import java.util.Scanner;
import java.lang.String;
public class removeMaximumValues{
    public static void main(String[] args) {
        LinkedList<String> al= new LinkedList<String>();
        Scanner sc= new Scanner(System.in);
        // Ask the lenth of the list
        System.out.println("Please enter number of elements");
        int size=sc.nextInt();
        //Ask for the elements in the list
        System.out.println("Please enter the elements");
        for(int i=0;i<=size;i++){
            al.add(sc.nextLine());
        }
        //remove maximum elements
        //Ask for the no of maximum elements to remove
        System.out.println("Enter the number of maximum numbers to remove all of their instances");
        int n=sc.nextInt();
        //Remove the largest value n number of times
        String t=al.get(0);
        for(int m=0;m<=n;m++){//Ye wala for lop is to remove the maximum values n number of times
        for(int i=0;i<=size;i++){
            if((t.compareTo(al.get(i)))>=0){
                t=al.get(i);
            }
        }
        //Mera ye remove chal nai ra
        al.remove(t);//meko BAS ye line me error aa raay, ye bata meko bas
        }
        // System.out.println(al.get(0).getType());
        System.out.println("TEST " +(al.get(0)).compareTo((al.get(1))));
        //Print the final list
        System.out.println("Here's the final List");
        for(int i=0;i<=size;i++){
            System.out.println(al.get(i));
        }
        sc.close();
    }
}