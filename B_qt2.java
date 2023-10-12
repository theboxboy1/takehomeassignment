
public class App {
    public static void main(String[] args) {
       
        double num1 = 3.0; double num2 = 5.0; double num3 = 4.0;

        if (num2<num1 && num2<num3){
            System.out.println(num2 + " is the smallest number");
        }
        else if (num1<num2 && num1<num3){
            System.out.println(num1 + " is the smallest number");
        }
        else{
            System.out.println(num3 + " is the smallest number");
        }
    }
}
