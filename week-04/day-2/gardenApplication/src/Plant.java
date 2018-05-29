public class Plant {


    private int name;
    private String color;
    private int waterLevel;
    private boolean needsOrNot;

    public Plant() {
        this.color = color;
        this.waterLevel = waterLevel;
        this.name = name;
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
