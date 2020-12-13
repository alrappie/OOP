package com.tutorial;

class Player{
    private String namePlayer;
    private int baseHealthPlayer;
    private int levelPlayer;
    private int baseDamage;
    private int baseDefense;
    private int baseMagicDefense;
    private Armor armor;
    private Weapon weapon;
    private int incrementLvlUpHealth;
    private int incrementLvlUpbaseDamage;
    private int incrementLvlUpPhysicalDef;
    private int incrementLvlUpMagicDef;

    Player(String namePlayer){
        this.namePlayer = namePlayer;
        this.levelPlayer= 1;
        this.baseHealthPlayer =120;
        this.baseDamage = 50;
        this.baseDefense=20;
        this.baseMagicDefense=10;
        this.incrementLvlUpbaseDamage=3;
        this.incrementLvlUpHealth=7;
        this.incrementLvlUpPhysicalDef=2;
        this.incrementLvlUpMagicDef=1;

    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public int levelUp(){
        return this.levelPlayer++;
    }
    public int setIncrementHealth(){
        return this.baseHealthPlayer+this.levelPlayer*incrementLvlUpHealth+this.armor.getAddHealth();
    }
    public int setIncrementPyshicalDef(){
        return this.baseDefense+this.levelPlayer*incrementLvlUpPhysicalDef+this.armor.getAddPhysicalDef();
    }
    public int setIncrementMagicDef(){
        return this.baseMagicDefense+this.levelPlayer*incrementLvlUpMagicDef+this.armor.getAddMagicDef();
    }
    public int setAttackBonus(){
        return this.baseDamage+this.weapon.getAttackBonus()+this.levelPlayer*incrementLvlUpbaseDamage;
    }

    public void displayBase(){
        System.out.println("Player Name\t\t : "+this.namePlayer);
        System.out.println("Player Level\t : "+this.levelPlayer +" Lvl");
        System.out.println("Health Player\t : "+(this.baseHealthPlayer+this.levelPlayer*incrementLvlUpHealth) +" Hp");
        System.out.println("Base Damage\t\t : "+(this.baseDamage+this.levelPlayer*incrementLvlUpbaseDamage)+" ATK");
        System.out.println("Physical Defense : "+(this.baseDefense+this.levelPlayer*incrementLvlUpPhysicalDef)+" Deff");
        System.out.println("Magic Defense\t : "+(this.baseMagicDefense+this.levelPlayer*incrementLvlUpMagicDef)+" Resistance");
    }

    public void displayBaseAfter(){
        System.out.println("Player Name\t\t : "+this.namePlayer);
        System.out.println("Player Level\t : "+this.levelPlayer +" Lvl");
        if (this.levelPlayer==1) {
            System.out.println("Health Player\t : " + this.setIncrementHealth() + " (+" + (this.armor.getAddHealth() + ") Hp"));
            System.out.println("Base Damage\t\t : " + this.setAttackBonus() + " (+" + (this.weapon.getAttackBonus() + ") ATK"));
            System.out.println("Physical Defense : " + this.setIncrementPyshicalDef() + " (+" + (this.armor.getAddPhysicalDef()) + ") Deff");
            System.out.println("Magic Defense\t : " + this.setIncrementMagicDef() + " (+" + (this.armor.getAddMagicDef()) + ") Resistance");
        }else {
            System.out.println("Health Player\t : " + this.setIncrementHealth() + " (+" + (this.armor.getAddHealth() +(this.levelPlayer-1)*incrementLvlUpHealth) +") Hp");
            System.out.println("Base Damage\t\t : " + this.setAttackBonus() + " (+" + (this.weapon.getAttackBonus() +(this.levelPlayer-1)*incrementLvlUpbaseDamage)+ ") ATK");
            System.out.println("Physical Defense : " + this.setIncrementPyshicalDef() + " (+" + (this.armor.getAddPhysicalDef()+(this.levelPlayer-1)*incrementLvlUpPhysicalDef) + ") Deff");
            System.out.println("Magic Defense\t : " + this.setIncrementMagicDef() + " (+" + (this.armor.getAddMagicDef()+(this.levelPlayer-1)*incrementLvlUpMagicDef) + ") Resistance");
        }
    }

}

class Armor{
    private String armorName;
    private int healthBonus;
    private int armorDefBonus;
    private int magicDefBonus;

    public Armor(String armorName, int healthBonus, int armorDefBonus, int magicDefBonus){
        this.armorName = armorName;
        this.healthBonus=healthBonus;
        this.armorDefBonus=armorDefBonus;
        this.magicDefBonus=magicDefBonus;
    }
    public int getAddHealth(){
        return this.healthBonus;
    }
    public int getAddPhysicalDef(){
        return this.armorDefBonus;
    }
    public int getAddMagicDef(){
        return this.magicDefBonus;
    }
    public void displayArmor(){
        System.out.println("Armor Name  : "+this.armorName);
    }
}

class Weapon{
    private String weaponName;
    private int attackBonus;

    public Weapon(String weaponName, int attackBonus){
        this.weaponName=weaponName;
        this.attackBonus=attackBonus;
    }
    public int getAttackBonus() {
        return attackBonus;
    }
    public void displayWeapon(){
        System.out.println("Weapon Name : "+this.weaponName);
    }
}


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("alrappie");
        System.out.println("-----------------------------\nBase Heroes\n-----------------------------");
        player1.displayBase();
        Armor armor1 = new Armor("Kaos",30,5,1);
        Weapon weapon1 = new Weapon("Pisau",30);
        System.out.println("-----------------------------\nHeroes Using Equipments");
        weapon1.displayWeapon();
        armor1.displayArmor();
        System.out.println("-----------------------------");
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.displayBaseAfter();
        System.out.println("-----------------------------\nHeroes Level Up\n-----------------------------");
        player1.levelUp();
        player1.displayBaseAfter();
    }
}
