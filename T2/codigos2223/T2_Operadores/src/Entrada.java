public class Entrada {

    public static void main(String[] args) {

        // operarAritmeticos();
        // operadoresAsignacion();
        // operadoresRelacionales();
        operadoresLogicos();
    }

    private static void operarAritmeticos() {

        int numeroUno = 0;
        // monarios
        // ++ incremento en 1 a la variable que se aplique
        // -- decremento en 1 a la variable que se aplique
        // - cambio de signo
        numeroUno++; // 1
        numeroUno++; // 2
        numeroUno++; // 3
        numeroUno++; // 4
        System.out.println("El valor del número es: " + numeroUno);
        numeroUno = -8;
        numeroUno--; // -9
        numeroUno--; // -10
        System.out.println("El valor del número es: " + numeroUno);
        // solo útil con una asignacion -numeroUno; // -2
        // binarios
        numeroUno = 5;
        int numeroDos = 10;

        // suma +
        int suma = numeroUno + numeroDos;
        // La suma entre 5 y 10 es 15
        System.out.printf("La suma entre %d y %d es %d%n", numeroUno, numeroDos, suma);
        // resta -
        int resta = numeroUno - numeroDos;
        System.out.printf("La resta entre %d y %d es %d%n", numeroUno, numeroDos, resta);
        // multiplicación *
        int multiplicacion = numeroUno * numeroDos;
        System.out.printf("La multi entre %d y %d es %d%n", numeroUno, numeroDos, multiplicacion);
        // división /
        // 5/10 = 0.500000
        double division = (double) numeroUno / (double) numeroDos;
        System.out.printf("La división entre %d y %d es %.2f%n", numeroUno, numeroDos, division);
        // resto - módulo %
        int modulo = numeroDos % numeroUno;
        System.out.printf("Módulo entre %d y %d es %d%n", numeroDos, numeroUno, modulo);
        modulo = numeroUno % numeroDos;
        System.out.printf("Módulo entre %d y %d es %d%n", numeroUno, numeroDos, modulo);
    }
    public static void operadoresAsignacion() {
        // asignacion =
        int numeroUno = 10, numeroDos = 20;
        // +=
        numeroUno += numeroDos; // numero1 = 30
        System.out.printf("El valor de n1 es %d%n", numeroUno);
        // -=
        numeroUno -= 6; // numero1 = 30 - 6 // numero1 = 24
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        numeroUno *=2; // numero1 = 24 * 2
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        numeroUno /=2; // numero1 = 48/2
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        numeroUno %=5; // numero1 = 24%5
        System.out.printf("El valor de n1 es %d%n", numeroUno);

    }
    public static void operadoresRelacionales() {
        // relacionales o de comparación --> true / false
        int numeroUno = 9, numeroDos = 9;
        boolean resultado; // false
        // n1 > n2 --> ¿El n1 es más grande que el n2?
        resultado = numeroUno > numeroDos; // 10 > 9
        System.out.printf("El resultado de comparar (>) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);

        numeroUno = 10;
        numeroDos = 10;
        // >=
        resultado = numeroUno>= numeroDos; // 10 >= 10
        System.out.printf("El resultado de comparar (>=) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);


        // < n1 < n2
        numeroUno = 19;
        numeroDos = 10;
        resultado = numeroUno < numeroDos; // 19 < 10
        System.out.printf("El resultado de comparar (<) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);

        // <= n1 < n2
        numeroUno = 9;
        numeroDos = 10;
        resultado = numeroUno <= numeroDos; // 9 <= 10
        System.out.printf("El resultado de comparar (<=) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);


        numeroUno = 10;
        numeroDos = 10;
        // ==
        resultado = numeroUno == numeroDos; // 10 == 10
        System.out.printf("El resultado de comparar (==) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);

        // != n1 != n2
        numeroUno = 10;
        numeroDos = 10;
        resultado = numeroUno != numeroUno; // 10 != 10
        System.out.printf("El resultado de comparar (!=) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);

        // ! cambio de relación
        numeroUno = 7;
        numeroDos = 10;
        resultado = !(numeroUno<numeroDos); // 7 < 10 --> !(true) --> false
        System.out.printf("El resultado de comparar (!) %d con el %d es %b%n"
                ,numeroUno,numeroDos,resultado);

    }

    public static void operadoresLogicos(){
        &&
        ||
    }


}
