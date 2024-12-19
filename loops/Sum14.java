
    
import java.util.Scanner;
public class Sum14{
    public static void main(String[] args){
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the even or odd:");
        String name=oc.next();
        if(name.equals("even")){
            System.out.print("Enter the type:");
            String type=oc.next();
            if(type.equals("type1")){
                for(int i=1;i<=100;i++){
                    if(i%2==0){
                        System.out.print(i+" ");
                    }
                }
            }
            else if(type.equals("type2")){
                int sum=0;
                for(int i=1;i<=100;i++){
                    if(i%2==0){
                        sum=sum+i;
                    }
                }
                System.out.print(sum);
            }
            else if(type.equals("type3")){
                System.out.print("Enter the starting point:");
                int start=oc.nextInt();
                System.out.print("Enter the ending point:");
                int end=oc.nextInt();
                for(int i=start;i<=end;i++){
                    if(i%2==0){
                        System.out.print(i+ " ");
                    }
                }
            }
            else if(type.equals("type4")){
                System.out.print("Enter the starting point:");
                int start=oc.nextInt();
                System.out.print("Enter the ending point:");
                int end=oc.nextInt();
                int sum=0;
                for(int i=start;i<=end;i++){
                    if(i%2==0){
                        sum=sum+i;
                    }
                }
                System.out.println(sum);
            } 
        }
        if(name.equals("odd")){
            System.out.print("Enter the type:");
            String type=oc.next();
            if(type.equals("type1")){
                for(int i=1;i<=100;i++){
                    if(i%2==1){
                        System.out.print(i+" ");
                    }
                }
            }
            else if(type.equals("type2")){
                int sum=0;
                for(int i=1;i<=100;i++){
                    if(i%2==1){
                        sum=sum+i;
                    }
                }
                System.out.print(sum);
            }
            else if(type.equals("type3")){
                System.out.print("Enter the starting point:");
                int start=oc.nextInt();
                System.out.print("Enter the ending point:");
                int end=oc.nextInt();
                for(int i=start;i<=end;i++){
                    if(i%2==1){
                        System.out.print(i+ " ");
                    }
                }
            }
            else if(type.equals("type4")){
                System.out.print("Enter the starting point:");
                int start=oc.nextInt();
                System.out.print("Enter the ending point:");
                int end=oc.nextInt();
                int sum=0;
                for(int i=start;i<=end;i++){
                    if(i%2==1){
                        sum=sum+i;
                    }
                }
                System.out.println(sum);
            } 
        }
        
    }

}
