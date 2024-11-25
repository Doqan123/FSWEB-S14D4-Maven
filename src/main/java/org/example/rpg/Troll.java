package org.example.rpg;

import org.example.rpg.utils.Constant;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + blead()+ poison();
    }

    @Override
    public double blead() {
        return getDamage() * Constant.BLEED_PERSENTAGE;
    }

    @Override
    public double blead(int level) {
        return level*getDamage()* Constant.BLEED_PERSENTAGE;
    }

    @Override
    public double poison() {
        return getDamage() * Constant.POISON_PERSENTAGE;
    }
}
