package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Caro";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 28;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.59; //en verdad ni idea cuanto mido lol
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;
        System.out.println(likeProgramming);

        // 5. Declara una constante con tu email.
        String email = "carolina.straub@gmail.com";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'C';
        System.out.println(initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String location = "Chile";
        System.out.println(location);
        location = "Santiago";
        System.out.println(location);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 4;
        int b = 6;
        System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println(((Object)age).getClass().getSimpleName());
        System.out.println(((Object)height).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int noValue;
        noValue = 5;
        System.out.println(noValue);

    }
}
