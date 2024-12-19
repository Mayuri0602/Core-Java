public class Sum6 {
    public static void main(String[] args) {
                for(int i=1;i<=100;i++){
                    int num=i;
                    int sum=0;
                    for(int j=2;j<num;j++){
                        if(num%j==0){
                            sum=1;
                        }
                    }
                    if(sum==0){
                        System.out.print(i+" ");
                    }
                }
                
            }
        }  
