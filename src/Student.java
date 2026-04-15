import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {


        System.out.println("Intrare in program...");

        Scanner scan = new Scanner(System.in);
        ArrayList<String> studenti = new ArrayList<>();

        //Facultate
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

        if (decizie.equalsIgnoreCase("da")) {
            System.out.println("Creati numele grupei noi");
        } else {
            System.out.println("Iesire din program...");
            return;
        }

        while(true){
        System.out.print("Numele grupei: ");
        String letter = scan.nextLine();
        int number = scan.nextInt();
        scan.nextLine();

        System.out.println(letter + number);


        String name;
        while (true) {
            System.out.print("Introduceti numele studentului: ");
            name = scan.nextLine();

            if (!name.matches("[a-zA-Z]+"))
                System.out.println("Nume invalid! Reintroduceti numele");
            else
                break;
        }


        int age;
        while (true) {

            System.out.print("Introduceti anul nasterii studentului: ");
            int yearOfBirth = scan.nextInt();

            int curentYear = LocalDate.now().getYear();
            age = curentYear - yearOfBirth;

            if (age <= 0 || age > 120)
                System.out.println("Reintroduceti anul nasterii: ");
            else {
                System.out.println("Student: " + name + " " + "Varsta: " + age + " ani.");
                break;
            }


        }

        //Specialitate
        String specialitate;
        while (true) {
            System.out.print("Introduceti specialitatea(Algebra/ Geometrie/ Calcul_Integral): ");
            scan.nextLine();
            specialitate = scan.nextLine();

            if (specialitate.equalsIgnoreCase("algebra") || specialitate.equalsIgnoreCase("geometrie") || specialitate.equalsIgnoreCase("calcul_integral")) {
                System.out.println("A fost aleasa specialitatea " + specialitate);
                break;
            } else {
                System.out.println("Optiune invalida!");

            }
        }


        int test1;
        while (true) {
            System.out.print("Introduceti nota test1: ");
            test1 = scan.nextInt();

            if (test1 < 1 || test1 > 10)
                System.out.println("Nota invalida! Reintroduceti: ");
            else
                break;

        }

        int test2;
        while (true) {
            System.out.print("Introduceti nota test2: ");
            test2 = scan.nextInt();

            if (test2 < 1 || test2 > 10)
                System.out.println("Nota invalida! Reintroduceti: ");
            else
                break;

        }


        int examen;
        while (true) {
            System.out.print("Introduceti nota examen: ");
            examen = scan.nextInt();

            if (examen < 1 || examen > 10)
                System.out.println("Nota invalida! Reintroduceti: ");
            else
                break;

        }

        int notaFinala = (test1 + test2 + examen) / 3;

        if (notaFinala > 9)
            System.out.println("Esti promovat!");
        else
            System.out.println("Nu ati trecut cu brio, incercati in semestrul urmator");


        String studentInfo = "Student: " + name + ", Varsta: " + age + ", Specialitate: " +
                specialitate + ", Media: " + notaFinala;

        studenti.add(studentInfo);
        System.out.print("Doriti sa mai introduceti un student? ");
        scan.nextLine();
        String raspuns = scan.nextLine();

        if (raspuns.equalsIgnoreCase("nu")) {
            break;
        }
    }

        System.out.println("Lista studentilor");
        for (String s : studenti) {
            System.out.println(s);
        }

        System.out.println("Iesire din program...");







    }
}