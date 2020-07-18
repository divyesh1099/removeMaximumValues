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
        int t=0;
        int counter=0;
        // System.out.println(t);
        for(int m=0;m<n;m++){//Ye wala for lop is to remove the maximum values n number of times
            for(int i=0;i<size;i++){
                if((al.get(1).compareTo(al.get(i)))<=0){
                    t=i;
                    // System.out.println(t);
                    // counter++;
                }
            }
            //REMOVE ALL INSTANCES OF BIGGEST ELEMENT KARNE KE LIYE LOOP
            for(int i=0;i<size;i++){
                // System.out.println("IIIIIII");
                if(t!=i){
                    // System.out.println("tttttttttt");
                    if(al.get(t).equals(al.get(i))){
                        // System.out.println("============");
                        // counter++;
                        al.remove(t);
                    }
                }
            }
        }
        
        // System.out.println("Counter:"+counter);
        // System.out.println("jsbdjcbjSBBSDC"+t);
        // System.out.println(al.get(0).getType());
        // System.out.println("TEST " +(al.get(0)).compareTo((al.get(1))));
        //Print the final list
        System.out.println("Here's the final List");
        // for(int i=0;i<size;i++){
        //     System.out.println(al.get(i));
        // }
        System.out.println(al);
        sc.close();
    }
}