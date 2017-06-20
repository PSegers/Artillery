package model;

/**
 * All hail His Grace, Pieterjan of House Segers and Huygen,
 * First of His Name, King of the Andals and the First Men,
 * Lord of the Seven Kingdoms, and Protector of the Realm.
 * --------------------------------------------------------
 *
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 15:50
 */
public class Player {
    private String name;
    private Faction faction;

    public Player(String name, Faction faction) {
        this.name = name;
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }
}
