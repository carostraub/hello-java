package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;

        // 1. Crea una variable con el resultado de cada operación aritmética.
        double suma = a + b;
        double resta = a - b;
        double mult = a * b;
        double div = a / b;
        double mod = a % b;

        // 2. Crea una variable para cada tipo de operación de asignación.
        int base = 4;
        int additionResult = base;
        additionResult += 4;

        int subtractionResult = base;
        subtractionResult -= 2;

        int multiplicationResult = base;
        multiplicationResult *= 2;

        int divisionResult = base;
        divisionResult /= 3;

        int modulusResult = base;
        modulusResult %= 2;



        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int num = 7;
        int num2 = 5;
        System.out.println(num ==(num2 + 2));
        System.out.println( num != num2);
        System.out.println(num > num2);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println( num2 != a);
        System.out.println(b >= num);
        System.out.println(base <= b);

        // 5. Utiliza el operador lógico and.
        System.out.println("Ejercicio 5");
        System.out.println(a == num2 && a > b);
        System.out.println(num > b && num > base);
        System.out.println(num2 >= base && a >= base);


        // 6. Utiliza el operador lógico or.
        System.out.println("ejercicio 6");
        System.out.println(a == num2 || base < b);
        System.out.println(num > b || num < b);
        System.out.println(base >= b || num2 <= num);

        // 7. Combina ambos operadores lógicos.
        System.out.println("Ejercicio 7:");
        System.out.println((a > base && a > b)|| base >= num);
        System.out.println((num == num2 || a == num2)&& a > base);
        // 8. Añade alguna negación.
        System.out.println(a != num2 || b < num);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(a++);
        System.out.println(++num2);
        System.out.println(-b);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println((a+1 == num)&& num2 + 1 ==7);
    }
}
