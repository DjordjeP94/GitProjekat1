import com.sun.jdi.request.StepRequest;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        boolean res = (10 == 10);
//        String ime = "Pera";
//        if (10 == 10 && 5<43 && true) {
//            System.out.println("Tacno");
//        } else if (10 < 5) {
//            System.out.println("Drugi uslov je tacan");
//        } else if (ime.equals("Pera")) {
//            System.out.println("Ime je tacno");
//
//        } else {
//            System.out.println("Nista od navedenog nije tacno");

        //      }
//        if (10 == 10 && 5<43 && true){
//            if (15==15) {
//                if (ime.contains("z"))
//                    System.out.println("Ne sadrzi");
//            }
//                System.out.println("Sadryi slovo a");
//            }
//        System.out.println("Tacno");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesite prvi broj: ");
//        int operand1 = scanner.nextInt();
//        System.out.println("Unesite drugi broj: ");
//        int operand2 = scanner.nextInt();
//        System.out.println("Unesite racunsku operaciju: ");
//        String operator = scanner.next();
//
//        if (operator.equals("+")) {
//            System.out.println("Rezultat sabiranja je: " + (operand1 + operand2));
//        } else if (operator.equals("-")) {
//            System.out.println("Rezultat oduyimanja je: " + (operand1 - operand2));
//
//        } else if (operator.equals("/")) {
//            if (operand2==0) {
//                System.out.println("Deljenje nije dozvoljeno");
//            }else {
//                System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
//            }
//        } else if (operator.equals("*")) {
//            System.out.println("Rezultat mnozenja je: " + (operand1 * operand2));
//        }else {
//            System.out.println("Greska pri unosu");
//        }


//        switch (operator) {
//            case "+": {
//                System.out.println("Rezultat sabiranja je: " + (operand1 + operand2));
//            }
//            break;
//            case "-": {
//                System.out.println("Rezultat oduzimanja je: " + (operand1 - operand2));
//            }
//            break;
//            case "*": {
//                System.out.println("Rezultat mnozenja je: " + (operand1 * operand2));
//            }
//            break;
//            case "/": {
//                if (operand2==0){
//                    System.out.println("Deljenje nije dozvoljeno");
//                }else
//                System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
//            }
//            break;
//            default:
//                System.out.println("Greska pri unosu");
//        }

//        String carMake = "Ford";
//        int doors = 4;


//        if (carMake.equals("Ford") && doors==4) {
//            System.out.println("Automobil je Ford i ima 4 vrata");
//        } else {
//            System.out.println("Nesto od navedenog nije tacno");
//        }


        int x = 325424;
        int y = 325423;

        if (x % y == 0) {
            System.out.println("Ostatak pri deljenju ne postoji");
        } else if (x % y > 1000) {
            System.out.println("Ostatak je veci od 1000");
        } else if (x%y<1000) {
            System.out.println("Ostatak je manji od 1000");
        }



        
    }
}
