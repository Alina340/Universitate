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


    }
}