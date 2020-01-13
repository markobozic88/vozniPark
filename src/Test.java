import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite adresu voznog parka:");
        String adr = sc.nextLine();
        System.out.println("Unesite vozni park koji zelite (p-privatni, f-poslovni):");
        String pOrF = sc.nextLine();
        if(pOrF.equals("p")){
            PrivatniVP pvp = new PrivatniVP(adr, new Vozilo());
            System.out.println(pvp.toString());
        }
        if(pOrF.equals("f")){
            System.out.println("Unesite broj vozila u voznom parku:");

        }
    }
}
