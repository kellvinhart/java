import java.util.Scanner;
public class app{
    public static void main(Strin [] args){
        double secondRoot = 0;
        double firstRoot =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b : ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c : ");
        double c = sc.nextDouble();

        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);
        System.out.println("determinant : "+determinant);
        System.out.println("Square root : "+sqrt);

        if(determinant>0){
            firstRoot = (-b+sqrt)/(2*a);
            secondRoot =(-b - sqrt)/(2*a);
            System.out.println("Roots are : "+firstRoot+"and"+secondRoot);
        }else {
            System.out.println("Root is :"+(-b+sqrt)/(2*a));
        }
    }
}