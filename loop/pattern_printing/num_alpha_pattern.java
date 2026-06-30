package loop.pattern_printing;

public class num_alpha_pattern {
    public static void main(String[] args) {
        boolean isNumState = true;
        int limit = 1;
        int y=6;


        for (int i = 1; i <=y; i++){
            if(isNumState){
                for(int j=1;j<=limit;j++){
                    System.out.print(j+" ");
                }
                limit++;
            }else{
                for(int j=0;j<limit;j++){
                    System.out.print((char)('A'+j)+" ");
                }
                limit++;
            }
            isNumState=!isNumState;
            System.out.println();
        }
    }
}
