public class pregunta2 {
    public static void main(String[] args) {
        int[] arrayDeEnteros = {1,2,3,4,5};
        int suma = 0;//se declara la variable suma,inicualizada en 0

        for (int i = 0;i< arrayDeEnteros.length;i++) {
            suma+= + arrayDeEnteros[i];//en este bloque actualizamos la variable suma, y va acumulando el valor de cada numero que puse en el array de enteros
        }
        System.out.println(" la suma de los enteros es: " + suma);
    }
}
