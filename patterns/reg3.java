public class reg3 {
    public static void main(String[] args) {
        int rows=3;
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
