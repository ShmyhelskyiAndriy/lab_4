public class Lab4 {
    public static void main(String[] args) {
        //task 1 (for)
        System.out.println("for");
        for(int i=500; i<=650; i=i+10) {
            System.out.println(i);
        }
        //task 1(while)
        System.out.println("while");
        int i = 500;
        while(i<=650) {
            System.out.println(i);
            i = i + 10;
        }
        //task 1(do-while)
        System.out.println("do-while");
        int n = 500;
        do {
            System.out.println(n);
            n = n + 10;
        }while(n<=650);
    }
}