package hu.flow;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StarWars {
    public static List<ForceSensitive> collection = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("characters.txt");
        Scanner scanner = new Scanner(file);


        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] strArr = str.split(" ");
            if (strArr[0].equals("anakin")) {
                AnakinSkywalker anakin = new AnakinSkywalker();
                for (int i = 0; i < Integer.parseInt(strArr[1]); i++) {
                    anakin.letYourAngerGo();
                }
                collection.add(anakin);

            }
            if (strArr[0].equals("uralkodo")) {
                RulerClass ruler = new RulerClass();
                for (int i = 0; i < Integer.parseInt(strArr[1]); i++) {
                    ruler.letYourAngerGo();
                }
                collection.add(ruler);

            }
        }


        sith();
    }




    public static void sith(){
        for (ForceSensitive p: collection) {
            System.out.println(p);
        }
    }
}

/*
        • Írj egy StarWars nevű futtatható osztályt. Az osztály rendelkezzen egy szereplok statikus függvénnyel,
         ami egy fájl elérési útját várja paraméterül, visszatérése pedig void.
         A metódus feladata, hogy a fájlból beolvasott sorokat feldolgozza, és létrehozzon belőlük
        AnakinSkywalker, vagy Uralkodo objektumpéldányokat, majd ezekre meghívja
        az engeddElAHaragod metódust annyiszor, ahányszor az aktuális sor írja.
        Ezeket egy közös kollekcióban tárold le. Készíts továbbá egy sithek statikus metódust,
         ami végigmegy a tárolóban tárolt objektumokon, és kiírja őket. Hívd meg a main függvényben sorban a
        fenti két metódust. Minden esetleges kivételt (főleg: IOException) kezelj le vagy kivétel
        specifikációval, vagy try blokkban!
        Egy minta fájl felépítése az alábbi:
        Anakin 5
        Uralkodo 8*/
