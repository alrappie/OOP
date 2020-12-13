
package com.tutorial;

import java.util.Scanner;

class Player{
    private String namePlayer;
    private int baseHealthPlayer;
    private int levelPlayer;
    private int baseDamage;
    private int baseDefense;
    private int baseMagicDefense;
    private int incrementLvlUpHealth;
    private int incrementLvlUpbaseDamage;
    private int incrementLvlUpPhysicalDef;
    private int incrementLvlUpMagicDef;
    private int totalDamage;
    private Armor armor;
    private Weapon weapon;

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
    public void attack(Player opponent){
        int damage = this.setAttackBonus();
        System.out.println(this.namePlayer+" Attacking "+opponent.namePlayer +" With "+ damage);
        opponent.defence(damage);
    }
    public void defence(int damage){
        int totalDefense = this.setIncrementPyshicalDef();
        int deltaDamage;
        System.out.println(this.namePlayer+" has "+totalDefense+" Physical Defense");
        if (damage>totalDefense){
            deltaDamage=damage-totalDefense;
        }else {
            deltaDamage=0;
        }
        System.out.println("damage earned = "+deltaDamage);
        this.totalDamage += deltaDamage;
    }
    public int levelUp(){
        return this.levelPlayer++;
    }
    public int getHealth(){
        return this.setIncrementHealth()-this.totalDamage;
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
            System.out.println("Health Player\t : " +this.getHealth()+"/"+ this.setIncrementHealth() + " (+" + (this.armor.getAddHealth() + ") Hp"));
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
        Scanner GG = new Scanner(System.in);
        System.out.print("Input Your Heroes Name :");
        String namaPlayer = GG.next();
        Player player1 = new Player(namaPlayer);
        Player player2 = new Player("Siput");
        Armor armor1 = new Armor("Kaos",30,5,1);
        Armor armor2 = new Armor("Siput Armor",0,0,0);
        Weapon weapon2 = new Weapon("Siput weapon",0);
        Weapon weapon1 = new Weapon("Pisau",30);
        player2.setWeapon(weapon2);
        player2.setArmor(armor2);

        int index=0;
        int pilihan;
        do {
        System.out.println("\n1.\tStatus");
        System.out.println("2.\tEquipment");
        System.out.println("3.\tJourney!");
        pilihan = GG.nextInt();
            switch (pilihan) {
                case 1:
                    if (index == 0) {
                        while (pilihan != 2) {
                            System.out.println("\n-----------------------------\nBase Heroes\n-----------------------------");
                            player1.displayBase();
                            System.out.println("\nInput '2' to Back!");
                            pilihan = GG.nextInt();
                            if (pilihan!=2)
                                System.err.println("CHOOSE WISELY");
                        }
                    } else {
                        while (pilihan!=2) {
                            System.out.println("-----------------------------\nHeroes Using Equipments");
                            weapon1.displayWeapon();
                            armor1.displayArmor();
                            System.out.println("-----------------------------");
                            player1.displayBaseAfter();
                            System.out.println("\nInput '2' to Back!");
                            pilihan = GG.nextInt();
                        }
                    }
                    break;
                case 2:
                        System.out.print("Item list:\n1.\tPisau\n2.\tKaos\nUse it ? (1/2)");
                        int pilihan2 = GG.nextInt();
                    if (pilihan2 == 1) {
                        while (pilihan2 != 2) {
                            index++;
                            player1.setWeapon(weapon1);
                            player1.setArmor(armor1);
                            System.out.println("------------------------\nNow you are using Pisau as Weapon\nand Kaos as an Armor\n------------------------");
                            System.out.println("\nInput '2' to Back!");
                            pilihan2 = GG.nextInt();
                        }
                    } else {
                        System.err.println("Back!");
                    }
            }
        }while (pilihan!=3);

        System.out.println("================\nYou found enemies\n================");
        do {
            System.out.println("\nWhat you want to do? :\n1.\tSelf status\n2.\tEnemis Identity\n3.\tAttack!\n4.\tRun!!");
            pilihan = GG.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\n-----------------------------\nHeroes Attribut\n-----------------------------");
                    player1.displayBaseAfter();
                    break;
                case 2:
                    player2.displayBaseAfter();
                    break;
                case 3:
                    player1.attack(player2);
                    break;
                case 4:
                    System.out.println("Byee..");
                    break;
            }
            if (player2.getHealth()<=0){
                System.out.println("================\nENEMIES DIED!\nVICTORY IS OURS!!\n================");
                System.out.println("================\nLEVEL UP\nCurrent Status\n================");
                player1.levelUp();
                player1.displayBaseAfter();
                return;
            }
        }while (pilihan!=4);
    }
}
