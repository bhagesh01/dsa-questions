package loops;

public class breakKeyword {
    public static void main(String[] args) {
        int num = 1;
        int n =10;
        while(num<n){
            System.out.println(num);
            if(num == 5 ){
                break;
            }
            num++;
        }
    }
}
