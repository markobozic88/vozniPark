import java.util.Scanner;
public class PrivatniVP extends VozniPark {
    Vozilo vozilo;
    PrivatniVP(String adresa, Vozilo voz){
        super.setAdresa(adresa);
        this.vozilo = voz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tip vozila (p - putnicko ili m - motocikl):");
        String pOrM = sc.next();
        vozilo.setTipVozila(pOrM);
        System.out.println("Unesite zapreminu motora:");
        int zapremina = sc.nextInt();
        vozilo.setZapreminaMotora(zapremina);
        System.out.println("Unesite godinu proizvodnje:");
        int godinaProiz = sc.nextInt();
        vozilo.setGodinaProizvodnje(godinaProiz);
    }
    @Override
    double porezNaCeneRegistracije(int godina) {
        double cenaPorezaGod;
        double ukupnaCenaPoreza = 0;
        switch (vozilo.getTipVozila()){
            case "p":
                if (vozilo.getZapreminaMotora() > 1 && vozilo.getZapreminaMotora() <= 2000){
                    cenaPorezaGod = 10150;
                    if ((godina - vozilo.getGodinaProizvodnje()) > 5 && (godina - vozilo.getGodinaProizvodnje()) <= 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.75;
                    } else if ((godina - vozilo.getGodinaProizvodnje()) > 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.60;
                    } else {
                        ukupnaCenaPoreza = cenaPorezaGod;
                    }
                } else if (vozilo.getZapreminaMotora() > 2000 && vozilo.getZapreminaMotora() <= 3000){
                    cenaPorezaGod = 50350;
                    if ((godina - vozilo.getGodinaProizvodnje()) > 5 && (godina - vozilo.getGodinaProizvodnje()) <= 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.75;
                    } else if ((godina - vozilo.getGodinaProizvodnje()) > 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.60;
                    } else {
                        ukupnaCenaPoreza = cenaPorezaGod;
                    }
                } else {
                    cenaPorezaGod = 210920;
                    if ((godina - vozilo.getGodinaProizvodnje()) > 5 && (godina - vozilo.getGodinaProizvodnje()) <= 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.75;
                    } else if ((godina - vozilo.getGodinaProizvodnje()) > 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.60;
                    } else {
                        ukupnaCenaPoreza = cenaPorezaGod;
                    }
                }
                break;
            case "m":
                if (vozilo.getZapreminaMotora() > 1 && vozilo.getZapreminaMotora() <= 500){
                    cenaPorezaGod = 3400;
                    if ((godina - vozilo.getGodinaProizvodnje()) > 5 && (godina - vozilo.getGodinaProizvodnje()) <= 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.75;
                    } else if ((godina - vozilo.getGodinaProizvodnje()) > 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.60;
                    } else {
                        ukupnaCenaPoreza = cenaPorezaGod;
                    }
                } else if (vozilo.getZapreminaMotora() > 500 && vozilo.getZapreminaMotora() <= 1100){
                    cenaPorezaGod = 8800;
                    if ((godina - vozilo.getGodinaProizvodnje()) > 5 && (godina - vozilo.getGodinaProizvodnje()) <= 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.75;
                    } else if ((godina - vozilo.getGodinaProizvodnje()) > 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.60;
                    } else {
                        ukupnaCenaPoreza = cenaPorezaGod;
                    }
                } else {
                    cenaPorezaGod = 11890;
                    if ((godina - vozilo.getGodinaProizvodnje()) > 5 && (godina - vozilo.getGodinaProizvodnje()) <= 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.75;
                    } else if ((godina - vozilo.getGodinaProizvodnje()) > 10){
                        ukupnaCenaPoreza = cenaPorezaGod * 0.60;
                    } else {
                        ukupnaCenaPoreza = cenaPorezaGod;
                    }
                }
                break;
            default:
                System.out.println("Podrazumeva se da unos moze biti samo p ili m");
        }
        return ukupnaCenaPoreza;
    }
    @Override
    public String toString() {
        return "Vozni park: privatni\nAdresa: " + super.getAdresa() + "\n\n" + vozilo.toString();
    }
}
