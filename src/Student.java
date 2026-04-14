import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {


        System.out.println("Intrare in program...");

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("Introducere facultate(Matematica/Informatica): ");
            String facultate = scan.nextLine();

            //nextLine - citeste toata propozitia
            //next - doar primul cuvant

            if (facultate.equalsIgnoreCase("matematica") || facultate.equalsIgnoreCase("informatica")) {
                System.out.println("A fost aleasa Facultatea " + facultate);
                break;
            } else {
                System.out.println("Optiune invalida!");

            }
        }

        System.out.print("Doriti sa introduceti studenti noi? ");

        String decizie = scan.nextLine();

        if(decizie.equalsIgnoreCase("da")) {
            System.out.println("Creati numele grupei noi");
        }else {
            System.out.println("Iesire din program...");
            return;
        }

        System.out.print("Numele grupei: ");

        String letter = scan.nextLine();
        int number = scan.nextInt();

        System.out.println(letter + number);

        scan.nextLine();

        System.out.print("Introduceti numele studentului: ");
         String name = scan.nextLine();

         while(true) {

             System.out.print("Introduceti anul nasterii studentului: ");
             int yearOfBirth = scan.nextInt();

             int curentYear = LocalDate.now().getYear();

             int age = curentYear - yearOfBirth;

             if (age <= 0 || age > 120)
                 System.out.println("Reintroduceti anul nasterii: ");
             else {
                 System.out.println("Student: " + name + " " + "Varsta: " + age + " ani.");
                 break;
             }


         }

         System.out.print("Introduceti specialitatea(Algebra/ Geometrie/ Calcul_Integral: ");
         scan.nextLine();
         String specialitate = scan.nextLine();

         if(specialitate.equalsIgnoreCase("algebra") || specialitate.equalsIgnoreCase("geometrie") || specialitate.equalsIgnoreCase("calcul_integral"))
            System.out.println("A fost aleasa specialitatea " + specialitate);

         while(true) {
             System.out.print("Introduceti nota test1: ");
             int test1 = scan.nextInt();

             if (test1 < 1 || test1 > 10)
                 System.out.println("Nota invalida! Reintroduceti: ");
             else
                 break;

         }


        while(true) {
            System.out.print("Introduceti nota test2: ");
            int test2 = scan.nextInt();

            if (test2 < 1 || test2 > 10)
                System.out.println("Nota invalida! Reintroduceti: ");
            else
                break;

        }

        while(true) {
            System.out.print("Introduceti nota examen: ");
            int examen = scan.nextInt();

            if (examen < 1 || examen > 10)
                System.out.println("Nota invalida! Reintroduceti: ");
            else
                break;

        }

        System.out.println("Iesire din program...");







    }
}