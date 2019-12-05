package hu.flow;

public class AnakinSkywalker extends JediAbstract implements Sith{

    public AnakinSkywalker() {
        super(150, true);
    }

    @Override
    public void letYourAngerGo() {
        this.setForce(this.getForce() * (Math.random() * 10));

    }

    @Override
    public boolean canCreateBalance() {
        return this.getForce() > 1000;
    }

    @Override
    public String toString() {
        return "Jedi's name: Anakin Skywalker, force "+ super.getForce() + ", can he turn: "+ super.getCanTurn();
    }
}
