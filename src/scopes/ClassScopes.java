package scopes;
class Algebra{
            int a , b;
    int sum(int p,int q){
        return p+q;
    }
    int sub(int a,int b){
        return a-b;
    }

}
public class ClassScopes {

    public static void main(String[] args){
     Algebra alg = new Algebra();
        System.out.println(alg.sum(4,5));
        System.out.println(alg.sub(44,55));
    }
}
