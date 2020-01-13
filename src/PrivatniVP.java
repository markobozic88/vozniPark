import java.util.Scanner;
public class PrivatniVP extends VozniPark {
    Vozilo vozilo;
    PrivatniVP(String adresa, Vozilo voz){
        super.setAdresa(adresa);
        this.vozilo = voz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tip vozila (p - putnicko ili m - motocikl):");
        String pOrM = sc.nextLine();
        vozilo.setTipVozila(pOrM);
        System.out.println("Unesite zapreminu motora:");
        int zapremina = sc.nextInt();
        vozilo.setZapreminaMotora(zapremina);
        System.out.println("Unesite godinu proizvodnje:");
        int godinaProiz = sc.nextInt();
        vozilo.setGodinaProizvodnje(godinaProiz);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Vozni park: privatni\nAdresa: " + super.getAdresa() + "\n\n" + vozilo.toString();
    }
}
