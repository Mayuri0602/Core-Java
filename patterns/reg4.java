public class reg4 {
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


        for(int i=rows;i>=1;i--){
            for(int k=1;k<=rows-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
