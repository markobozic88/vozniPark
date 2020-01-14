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
            System.out.println("Unesite godinu za koju zelite izracunavanje iznosa poreza za vozila voznog parka:");
            int godP = sc.nextInt();
            System.out.println();
            System.out.println(pvp.toString());
            System.out.println("Ukupni porez koji treba da bude placen je " + pvp.porezNaCeneRegistracije(godP));
        }
        if(pOrF.equals("f")){
            System.out.println("Unesite broj vozila u voznom parku:");
            int brVoz = sc.nextInt();
            FirmaVP fvp = new FirmaVP(adr, new Vozilo[brVoz]);
            System.out.println("Unesite godinu za koju zelite izracunavanje iznosa poreza za vozila voznog parka:");
            int godF = sc.nextInt();
            System.out.println();
            System.out.println(fvp.toString());
            System.out.println("Ukupni porez koji treba da bude placen je " + fvp.porezNaCeneRegistracije(godF));
        }
    }
}
