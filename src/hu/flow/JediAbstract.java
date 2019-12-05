package hu.flow;

public abstract class JediAbstract implements ForceSensitive{
    private double force;
    private boolean canTurn;

    public JediAbstract(double force, boolean canTurn) {
        this.force = force;
        this.canTurn = canTurn;
    }

    public abstract boolean canCreateBalance();

    @Override
    public double howMuchForceIsWithHim() {
        return this.force;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public boolean getCanTurn() {
        return canTurn;
    }

    public void setCanTurn(boolean canTurn) {
        this.canTurn = canTurn;
    }

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        if(this.force > forceSensitive.howMuchForceIsWithHim() && ((JediAbstract) forceSensitive).canTurn)
        {return true;}
        else { return false;}

/*       Az Uralkodo objektumot csak
        akkor tudja legyőzni, ha ereje kétszer nagyobb.*/

    }



}
  /*  .****** • Írj egy Jedi absztrakt osztályt, ami implementálja az EroErzekeny interfészt.
       ****** – Az osztály a következő private láthatóságú adattagokkal rendelkezik:
       ****** egy lebegőpontos ero, és egy logikai atallhatE (átállhat -e a sötét oldalra).
       ****** – Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat.
       ****** Legyen egy public megteremtiAzEgyensulyt absztrakt metódusa, ami egy logikai értékkel
       ****** tér vissza.
         Valósítsd meg továbbá az interfész metódusait. Az erő lekérdezésekor add
        vissza a Jedi erejét. Egy Jedi egy másik Jedi objektumot akkor tud legyőzni, ha az
        átállhat a sötét oldalra, és ereje kisebb, mint az övé. Az Uralkodo objektumot csak
        akkor tudja legyőzni, ha ereje kétszer nagyobb.
        – Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen
        szöveges formára alakítható, kiírva az adattagok értékét.*/