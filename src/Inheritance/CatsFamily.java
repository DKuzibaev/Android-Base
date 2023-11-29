package Inheritance;

public class CatsFamily {
    /*
    Если нам нужно что бы наследники могли изменять свойства private то нужно их заменить на protected
    Вeрнее не только наследники, а все кто находится с super классом в одной упаковке(package);

    protected int legs;
    protected int eyes;
    protected boolean canEatPersone;
    */
    protected int legs;
    protected int eyes;
    protected boolean canEatPersone;


    public CatsFamily(int legs, int eyes, boolean canEatPersone) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPersone = canEatPersone;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPersone() {
        return canEatPersone;
    }
}
