import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numeor inteiro");
        numero = leia.nextInt();
        for(int cont = 0; cont <=10; cont ++){
            System.out.println(numero+" x "+cont+" ="+numero*cont);
        }
    }
}
