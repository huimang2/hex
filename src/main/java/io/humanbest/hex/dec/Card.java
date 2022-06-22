package io.humanbest.hex.dec;

public class Card {

    public static enum Type {
        ATTACK, DEFNSE, BUFF, DEBUFF
    }

    public Type type;
    public int cost;
    public String name;
    public String description;

    public Card(Type type, int cost, String name) {
        this.type = type;
        this.cost = cost;
        this.name = name;
    }
}
