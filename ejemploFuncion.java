import java.util.Scanner;

public class ejemploFuncion {
    public static void main(String[] args) { 
        //Metodo Principal
        int n1=0, n2=0, r = 0;
        Scanner scan = new Scanner(System.in);//Habilitas la función Scanner
        System.out.print("Ingresa numero 1:");
        n1 = scan.nextInt();
        System.out.print("Ingresa numero 2:");
        n2 = scan.nextInt();
        r = Suma(n1,n2);
        System.out.println(r);
    }

    public static int Suma(int a, int b){
        int res = a+b;
        return res;
    }





 
}