public class Lab45 {
    public static void main(String[] args) {
    int count =0;
        for(int i=0; i<24; i++){
            for(int j=0;j<60;j++){
                String hour = String.format("%02d", i);
                String min =String.format("%02d", j);
                if(hour.charAt(0)== min.charAt(1) && hour.charAt(1)==min.charAt(0)){
                    System.out.println(hour+":"+min);
                    count++;

                }
            }

        }
    }


}