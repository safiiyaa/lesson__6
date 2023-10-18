public class Boss extends GameEntity{

    private Weapon weapon;

    public Boss(String defence, int health, int damage, Weapon weapon) {
        super(defence, health, damage);
        this.weapon = weapon;
    }
    public String printInfo(){
        return " Boss damage: " + getDamage() + " Boss Health: " +getHealth()
                + " Boss Defence: " + getDefence() + " Boss Weapon: " + weapon.getWeaponType() + weapon.getWeaponName();
    }
}
