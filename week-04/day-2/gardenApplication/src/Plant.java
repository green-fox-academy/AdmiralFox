public class Plant {


    private String name;
    private String color;
    private int waterLevel;
    private boolean needsOrNot;

    public Plant(String name, String color, int waterLevel, boolean needsOrNot ) {
        this.name = name;
        this.color = color;
        this.waterLevel = waterLevel;
        this.needsOrNot = needsOrNot;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void waterLevelPlant() {
        System.out.println("The " + this.color + this.name + this.needsOrNot + " water");
    }

}
