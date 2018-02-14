/**
 * Created by WelCome1 on 10/02/2018.
 */
public class Calculation {
    public  static void addition(int c, int d){
        System.out.println(c+d);
    }
    public static void subtraction(int c, int d){
        System.out.println(c-d);
    }
    public void multi(int c, int d){
        System.out.println(c*d);
    }

    public void div(int c, int d){
        System.out.println(c/d);
    }

    public static void main(String arg[]){
        int c = 2;
        int d = 2;

        addition(c, d);
        subtraction(c,d);
        Calculation sree = new Calculation();
        sree.multi(c,d);
        sree.div(c,d);


    }
}
