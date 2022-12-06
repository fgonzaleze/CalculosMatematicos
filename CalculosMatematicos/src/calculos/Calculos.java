package calculos;

public class Calculos {

	public class calculoMatematico {
		 //calcular minimo comun multiplo
	    public static void minimoComunMultiplo(){
	        int menor = 0;
	        int mayor = 0;
	        int n1 = 0;
	        int n2 = 0;
	        if(n1 < n2){
	            menor = n1;
	            mayor = n2;
	        }else{
	            menor = n2;
	            mayor = n1;
	        }
	        for (int i = menor; i >=1 ; i--) {
	            for (int j = i; j >=1; j--) {
	                if(i % j == 0 && mayor % j == 0) {
	                    mayor = j;
	                    break;
	                }
	            }
	            break;
	        }
	        int mcm = (n1 / mayor) * n2;
	        System.out.println("El Mínimo Común Múltiplo es " + mcm);
	    }
	    //calcular cuantos primos hay de 1 a n
	    public static void primos1aN(){
	        int n = 0;
	        int contP = 0;
	        boolean primo;
	        for (int i = n; i >1; i--) {
	            primo = true;
	            for (int j = i-1; j>=2 ; j--) {
	                if(i%j==0){
	                    primo=false;
	                    break;
	                }
	            }
	            if (primo!=false){
	                System.out.println(i+" es primo.");
	                contP++;
	            }
	        }
	    }
	    //nos calcula el maximo comun divisor
	    public static void maximoComunDivisor(){
	        int n1 = 0;
	        int n2 = 0;
	        int menor;
	        int mayor;
	        int mcd;
	        if(n1 < n2){
	            menor = n1;
	            mayor = n2;
	        }
	        else{
	            menor = n2;
	            mayor = n1;
	        }
	        //
	        for (int i = menor; i >=1 ; i--) {
	            for (int j = i; j >=1; j--) {
	                if(i % j == 0 && mayor % j == 0) {
	                    mcd = j;
	                    break;
	                }
	            }
	            break;
	        }
	    }
	    //nos dice cuantas cifras tiene un numero
	    public static void contarCifras(){
	        int n = 0;
	        int cont=0;
	        while(n!=0){
	            n/=10;
	            cont++;
	        }
	    }
	    //nos dice si un numero es capicua o no
	    public static void capicua(){
	        int aux;
	        int n=0;
	        int inverso=0;
	        int cifra;
	        aux=n;
	        while(aux!=0){
	            cifra = aux % 10;
	            aux/=10;
	            inverso=(inverso*10)+cifra;
	        }
	        //comparar ambas variables para saber si el numero es capicua
	        if(inverso==n){
	            System.out.println("El numero es capicua.");
	        }else {
	            System.out.println("El numero no es capicua.");
	        }
	    }
	    //nos calcula al valor absoluto de un numero
	    public static void valorAbsoluto(){
	        int valorAbsoluto;
	        int numero=0;
	        valorAbsoluto=numero<0 ? numero*(-1) : numero;
	    }
	    //nos dice si un numero es par
	    public static void par(){
	        int numero=0;
	        if ((numero%2)==0){
	            System.out.println("El numero insertado es par.");
	        }
	        else {
	            System.out.println("El numero insertado es impar.");
	        }
	    }
	    //nos dice si un numero es primo o no
	    public static void primo(){
	        int n=0;
	        boolean primo=true;
	        for (int i = 2; i < n; i++) {
	            primo=true;
	            if (n%i==0){
	                primo=false;
	                break;
	            }
	        }
	    }

	}
}


