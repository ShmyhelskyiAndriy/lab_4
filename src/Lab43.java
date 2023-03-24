public class Lab43 {
    public static void main(String[] args) {
        for(float i=1; i<=10; i++){
            float n =  10/i;
            if (Math.round(n)==n){
                System.out.println(i);
            }
        }
    }
}
