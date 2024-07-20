package loops;

public class Continuekeyword {
    public static void main(String[] args) {

//       for (int num =1;num<51; num++){
//           if(num % 3 == 0){
//               continue;
//           }
//           System.out.println(num);
//       }

//        int num = 1;
//        while(num<51){
//            if(num % 3 == 0){
//                continue;
//            }
//            System.out.println(num);
//            num++;
//        }
        // output == 1
        //           2

        // because the continue keyword stops the whole iteration and moves to the firstt line of the while loop , that's why the output is stucked in 1 and 2 .
//        int num = 1;
//        while(num<51){
//            if(num % 3 == 0){
//                num++;
//                continue;
//            }
//            System.out.println(num);
//            num++;
//        }

        // LABELS
        // name given to the loops i.e we can specify the name of a particular loop.
        // mainly used in the nested loop , after the break statement .
        int num = 1;
        myloop: while(num<51){
            if(num % 3 == 0){
                continue myloop;
            }
            System.out.println(num);
            num++;
        }
        // in this case the myloop is the label i.e name of the while loop.
    }
}
