import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("¿Cuál es el mayor?, pon primero el numero que quieres evaluar");
        Scanner sc = new Scanner(System.in);
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();

        if(numero1>numero2){
            System.out.println("Mayor");
        }else{
            if(numero1<numero2){
                System.out.println("Menor");
            }else{
                System.out.println("Igual o no es posible");
            }
        }

        System.out.println(numero1>numero2 ? "Mayor" : System.out.println(numero1<numero2 ? "Menor"));
    }
}