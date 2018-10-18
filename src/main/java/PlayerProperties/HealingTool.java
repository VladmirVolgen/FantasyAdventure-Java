package PlayerProperties;

public class HealingTool {

    private String name;
    private int healPower;

    public HealingTool(String name, int healPower) {
        this.name = name;
        this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    public String getName() {
        return name;
    }
}
