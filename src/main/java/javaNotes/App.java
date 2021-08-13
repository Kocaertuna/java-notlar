package javaNotes;

import static javaNotes.Printer.*;

/**
 * Hello world!
 *
 */
public class App {

    public static String myName = "Tuna";

    public static String myTutorsName = "Umut";

    public static String ageString = "99";

    public static String emptyL;

    public static Integer myAge = 17;

    public static int myHeight = 180;

    public static boolean ehliyetAlabilmeKosulu = myAge >= 18;

    public static void main( String[] args ) {

        System.out.println( "Hello World!" );

        System.out.println(Integer.parseInt(ageString)*2);

        System.out.println(ehliyetAlabilmeKosulu);

        if (ehliyetAlabilmeKosulu){
            System.out.println("Ehliyet alabilirim");
        }
        else if (Integer.parseInt(ageString) > 100){
            System.out.println("Araba kullanmak için fazla yaşlısın koçum");
        }
        else {
            System.out.println("Ehliyet alamam");
        }

        sumOperation(31234,2451234);

        subOperation(23,5);

        impOperation(5,60);

        divOperation(60,3);

        print(123);

        print("Hello");

        print(true);

        print(2134123);

        sweetOrSour("Elma");
        sweetOrSour("Karpuz");
        sweetOrSour("Mahmut");


    }

    public static void sumOperation(int number1, int number2){

        int sum = number1 + number2;

        System.out.println("Result is: " + sum);

    }

    public static void subOperation(int number3, int number4){

        int sub = number3 - number4;

        System.out.println("Result is: " + sub);
    }

    public static void impOperation(int number5, int number6){

        int imp = number5 * number6;

        System.out.println("Result is: " + imp);

    }

    public static void divOperation(int number7, int number8) {

        int div = number7 / number8;

        System.out.println("Result is: " + div);

    }

    public static void sweetOrSour(String fruitName) {

        switch(fruitName){

            case "Vişne":

            case "Elma":
                print("Sour");
                return;

            case "Armut":

            case "Karpuz":
                print("Sweet");
                return;

            default:
                print("no fruit called "+ fruitName + " was defined");
        }

    }

    public static void process(String results){

        switch (results){

            case "+":
                print("Toplama");
                return;

            case "-":
                print("Çıkarma");
                return;

            case "*":
                print("Çarpma");
                return;

            case "/":
                print("Bölme");
                return;

        }

    }
}
