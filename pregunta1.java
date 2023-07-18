public class pregunta1 {
    public static void main(String[] args) {
        int i = 2;
        while ( i <=100) { //en el bucle while se verifica si i es divisible por 2 utilizando0 "%" para calcular el residuo de el calculo
            if (i % 2 == 0) { //si el residuo es 0 significa que es par
                System.out.println(i); //entonces de imprime
            }
            i++; //despues de imprimir el numero par se incrementa el valor i en 2,entonces el bucle se va a seguir imprimiendo

        }
    }
}
