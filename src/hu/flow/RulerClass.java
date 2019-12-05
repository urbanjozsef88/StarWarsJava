package hu.flow;

public class RulerClass implements ForceSensitive, Sith {

    private double evilness;

    public RulerClass() {
                this.evilness = 100;
    }

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        if(this.evilness > forceSensitive.howMuchForceIsWithHim())
        {return true;
        } else {return false;}
    }

    @Override
    public double howMuchForceIsWithHim() {
        return this.evilness * 2;
    }

    @Override
    public void letYourAngerGo() {
        this.evilness = this.evilness + 50;
    }


    @Override
    public String toString() {
        return "Ruler " +
                "evilness= " + evilness ;
    }
}


/*
     *****  • Írj egy Uralkodo osztályt, ami implementálja az EroErzekeny és Sith interfészeket.
     *****  – Az osztálynak legyen egy lebegőpontos gonoszsag adattagja.
     *****  – Az osztály rendelkezzen egy default konstruktorral, ami 100-ra állítja az adattag értékét.
     *****   A metódusai az alábbiak szerint legyenek megvalósítva: az Uralkodo ereje a
        gonoszságának kétszeresével egyezik meg, és bármilyen EroErzekeny-t képes legyőzni,
        akinek ereje kisebb, mint az Uralkodó gonoszsága. Ha az Uralkodo elengedi a haragját,
        akkor gonoszsága 50-el nő.
        – Az osztály legyen szöveges formára alakítható, ami kiírja, hogy az Uralkodóról van
        szó, és megadja a gonoszságát.*/
