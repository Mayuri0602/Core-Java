// public class reg2 {
//     public static void main(String[] args) {
//         int r=3;
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=r-i;j++){
//                 System.out.println();
//             }
//             System.out.print("*");
//             }
//     }
// }


public class reg2{
public static void main(String[] args) {
    
    int rows = 3;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}