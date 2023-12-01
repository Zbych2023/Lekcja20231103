import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Pracownik>pracownicy = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String userName = myObj.nextLine();




        for ( int i = 0; i < 4; i++ ) {
            System.out.println("Podaj dane pracownika: Nazwisko, Imię, pesel, staż, wysokość pensji  ");
            String nazwisko = sc.next();
            String imie = sc.next();
            String pesel = sc.next();
            int staz = sc.nextInt();
            double pensja = sc.nextDouble();
            Pracownik pracownik1 = new Pracownik(nazwisko, imie, pesel, staz, pensja);
//            pracownik1.wyswietl();
          pracownicy.add(pracownik1);
        }
  //      tabela();

        for(int i = 0; i < 4; i++ ){
            pracownicy.get(i).zwiekszStaz();

        } tabela();
    }
    public static void tabela (){
        System.out.println("|     nazwisko  |     imie      |    pesel      |     plec      |     staz      |    pensja     |");
        for(int i = 0; i < 97; i++){
            System.out.print("-");
        }
        System.out.println();

        for(int i = 0; i < 4; i++){
            pracownicy.get(i).wyswietl();
        }
    }
}