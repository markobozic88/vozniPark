import java.util.Scanner;
public class FirmaVP extends VozniPark {
    Vozilo[] nizVozila;
    FirmaVP(String adresa, Vozilo[] nizVoz){
        super.setAdresa(adresa);
        this.nizVozila = nizVoz;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<nizVozila.length; i++){
            nizVozila[i] = new Vozilo();
            System.out.println("Unesite tip vozila " + (i+1) +" (p - putnicko ili m - motocikl):");
            String pOrM = sc.next();
            nizVozila[i].setTipVozila(pOrM);
            System.out.println("Unesite zapreminu motora vozila " + (i+1) + ":");
            int zapremina = sc.nextInt();
            nizVozila[i].setZapreminaMotora(zapremina);
            System.out.println("Unesite godinu proizvodnje vozila " + (i+1) + ":");
            int godinaProiz = sc.nextInt();
            nizVozila[i].setGodinaProizvodnje(godinaProiz);
        }
    }
    @Override
    double porezNaCeneRegistracije(int godina) {
        double cenaPorezaGod;
        double cenaPoreza = 0;
        double ukupnaCenaPoreza = 0;
        for (int k=0; k<nizVozila.length; k++) {
            switch (nizVozila[k].getTipVozila()) {
                case "p":
                    if (nizVozila[k].getZapreminaMotora() > 1 && nizVozila[k].getZapreminaMotora() <= 2000) {
                        cenaPorezaGod = 10150;
                        if ((godina - nizVozila[k].getGodinaProizvodnje()) > 5 && (godina - nizVozila[k].getGodinaProizvodnje()) <= 10) {
                            cenaPoreza = cenaPorezaGod * 0.75;
                        } else if ((godina - nizVozila[k].getGodinaProizvodnje()) > 10) {
                            cenaPoreza = cenaPorezaGod * 0.60;
                        } else {
                            cenaPoreza = cenaPorezaGod;
                        }
                    } else if (nizVozila[k].getZapreminaMotora() > 2000 && nizVozila[k].getZapreminaMotora() <= 3000) {
                        cenaPorezaGod = 50350;
                        if ((godina - nizVozila[k].getGodinaProizvodnje()) > 5 && (godina - nizVozila[k].getGodinaProizvodnje()) <= 10) {
                            cenaPoreza = cenaPorezaGod * 0.75;
                        } else if ((godina - nizVozila[k].getGodinaProizvodnje()) > 10) {
                            cenaPoreza = cenaPorezaGod * 0.60;
                        } else {
                            cenaPoreza = cenaPorezaGod;
                        }
                    } else {
                        cenaPorezaGod = 210920;
                        if ((godina - nizVozila[k].getGodinaProizvodnje()) > 5 && (godina - nizVozila[k].getGodinaProizvodnje()) <= 10) {
                            cenaPoreza = cenaPorezaGod * 0.75;
                        } else if ((godina - nizVozila[k].getGodinaProizvodnje()) > 10) {
                            cenaPoreza = cenaPorezaGod * 0.60;
                        } else {
                            cenaPoreza = cenaPorezaGod;
                        }
                    }
                    break;
                case "m":
                    if (nizVozila[k].getZapreminaMotora() > 1 && nizVozila[k].getZapreminaMotora() <= 500) {
                        cenaPorezaGod = 3400;
                        if ((godina - nizVozila[k].getGodinaProizvodnje()) > 5 && (godina - nizVozila[k].getGodinaProizvodnje()) <= 10) {
                            cenaPoreza = cenaPorezaGod * 0.75;
                        } else if ((godina - nizVozila[k].getGodinaProizvodnje()) > 10) {
                            cenaPoreza = cenaPorezaGod * 0.60;
                        } else {
                            cenaPoreza = cenaPorezaGod;
                        }
                    } else if (nizVozila[k].getZapreminaMotora() > 500 && nizVozila[k].getZapreminaMotora() <= 1100) {
                        cenaPorezaGod = 8800;
                        if ((godina - nizVozila[k].getGodinaProizvodnje()) > 5 && (godina - nizVozila[k].getGodinaProizvodnje()) <= 10) {
                            cenaPoreza = cenaPorezaGod * 0.75;
                        } else if ((godina - nizVozila[k].getGodinaProizvodnje()) > 10) {
                            cenaPoreza = cenaPorezaGod * 0.60;
                        } else {
                            cenaPoreza = cenaPorezaGod;
                        }
                    } else {
                        cenaPorezaGod = 11890;
                        if ((godina - nizVozila[k].getGodinaProizvodnje()) > 5 && (godina - nizVozila[k].getGodinaProizvodnje()) <= 10) {
                            cenaPoreza = cenaPorezaGod * 0.75;
                        } else if ((godina - nizVozila[k].getGodinaProizvodnje()) > 10) {
                            cenaPoreza = cenaPorezaGod * 0.60;
                        } else {
                            cenaPoreza = cenaPorezaGod;
                        }
                    }
                    break;
                default:
                    System.out.println("Podrazumeva se da unos moze biti samo p ili m");
            }
            ukupnaCenaPoreza += cenaPoreza;
        }
        return ukupnaCenaPoreza;
    }
    @Override
    public String toString() {
        String str = "\nVozni park: poslovni\nAdresa: " + super.getAdresa() + "\n\n";
        for (int j=0; j<nizVozila.length; j++){
            str += (j+1) + ". vozilo:\n";
            str += nizVozila[j].toString() + "\n";
        }
        return str;
    }
}
