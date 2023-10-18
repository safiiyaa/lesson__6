public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.MELEE, " Excalibur");
        Boss boss = new Boss("Magic", 400, 40, weapon);
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Defence: " + boss.getDefence());
        System.out.println("Boss Weapon: " + weapon.getWeaponType() + weapon.getWeaponName());
        System.out.println(boss.printInfo());
        Weapon bomb = new Weapon(WeaponType.BOMB, " FAB");
        Skeleton skeleton = new Skeleton("Kinetic", 380, 32, bomb, 18 );
        System.out.println(skeleton.printInfo());
        Weapon firearm = new Weapon(WeaponType.FIREARM, " revolver");
        Skeleton skeleton2 = new Skeleton("Physical", 230, 21, firearm, 25);
        System.out.println(skeleton2.printInfo());
    }
}