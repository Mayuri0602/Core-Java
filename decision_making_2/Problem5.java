import java.util.Scanner;

public class Problem5{
    public static void main(String[] args){
        System.out.println("Select Menu category: \n 1:Rajasthani  2: South Indian  3: Chinese");
        Scanner sc=new Scanner(System.in);
        int n;

        n= sc.nextInt();

        if(n==1){
            System.out.println("Rajasthani Food:\n Dal-Baati - Rs.80\n Poori-Sabji - Rs.60\n Bajre ki roti-Sabji - Rs.100\n Platter - Rs.220\n");
        }

        else if(n==2){
            System.out.println("South Indian Food:\n Uttapam - Rs.40\n Sambhar Vada - Rs.40\n Idli Sambhar - Rs.60\n Spcl platter - Rs.180\n");
        }

        else if(n==3){
            System.out.println("Chinese Food:\n Chowmein - Rs.40\n Gravy Manchurian - Rs.80\n Spring Rolls - Rs.60\n Steam Paneer Momo - Rs.80\n");
        }

        else{
            System.out.println("Select valid category(1-3)");
        }
    }
}
