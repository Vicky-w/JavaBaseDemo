package com.github.VickyWang.ClassTest02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Player {
    private String name;
    private int hp;
    private int ap;
    private Weapon weapon;

    public Player() {
        super();
    }

    public Player(String name, int hp, int ap) {
        super();
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public Player(String name, int hp, int ap, Weapon weapon) {
        super();
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack() {
        return ap + weapon.getHarm();
    }

    public boolean attack(Player that) {
        int harm = this.ap + this.weapon.getHarm();
        int thatHp = that.getHp();
        thatHp = thatHp - harm;
        that.setHp(thatHp);
        if (that.getHp() <= 0) {
            System.out.println(this.name + "使用" + this.getWeapon().getName() + "对" + that.getName() + "造成了" + harm
                    + "点伤害，" + that.getName() + "还HP还剩" + that.getHp());
            System.out.println(this.name + "击败了" + that.getName());
            return true;
        } else {
            System.out.println(this.name + "使用" + this.getWeapon().getName() + "对" + that.getName() + "造成了" + harm
                    + "点伤害，" + that.getName() + "还HP还剩" + that.getHp());
            return false;
        }
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", hp=" + hp + ", ap=" + ap + ", weapon=" + weapon + "]";
    }
}
