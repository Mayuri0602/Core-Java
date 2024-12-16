import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        int income=sc.nextInt();
        if(income<=10000){
            System.out.println("No tax");
        }
        else if(income>=10001 && income<=30000){
            double tax=income-((income*10)/100);
            System.out.println("Income after the tax "+tax);
        }
        else if(income>=30001 && income<=50000){
            double tax=income-((income*20)/100);
            System.out.println("Income after the tax "+tax);
        }
        else{
            double tax=income-((income*30)/100);
            System.out.println("Income after the tax"+tax);
        }
    }
}


// import java.util.*;
// public class Problem1{
//     public static void main(String[] args){
//         Scanner oc=new Scanner(System.in);
//         System.out.print("Enter income:");
//         int income=oc.nextInt();
//         int tax;
//         int totalamount;
//         if(income>=10001 && income<30000){
//             tax=(income*10)/100;
//             totalamount=income-tax;
//             System.out.print("Income after the tax:"+totalamount);
//         }
//         else if(income>=30001 && income<50000){
//             tax=(income*20)/100;
//             totalamount=income-tax;
//             System.out.print("Income after the tax:"+totalamount);
//         }
//          else if(income>50000){
//             tax=(income*30)/100;
//             totalamount=income-tax;
//             System.out.print("Income after the tax:"+totalamount);
//         }
//     }
// }