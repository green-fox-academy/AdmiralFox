public class Animal {

  String name;
  int healCost;
  boolean isHealthy;

  public Animal() {
  }

  public Animal(String name, int healCost, boolean isHealthy) {
    this.name = name;
    this.healCost = healCost;
    this.isHealthy = isHealthy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void heal() {
    this.isHealthy = true;
    }


  public boolean isAdoptable() {
    if (isHealthy == true) {
      return true;
    }
    return false;
  }

  public String toString() {
    if (isHealthy == true) {
      return name + "is not healthy" + healCost + "€, and not adoptable";
    }
    return name + "is healthy, and adoptable";
  }

}
