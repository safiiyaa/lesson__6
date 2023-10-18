public class Skeleton extends Boss{
    private int arrows;
    public Skeleton(String defence, int health, int damage, Weapon weapon, int arrows) {
        super(defence, health, damage, weapon);
        this.setArrows(arrows);
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printInfo() {
        return super.printInfo() + "Num of arrows: " + arrows;
    }
}
