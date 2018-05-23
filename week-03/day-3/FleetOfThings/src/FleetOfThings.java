public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing listToDo = new Thing("Get Milk");
        Thing listToDo1 = new Thing("Remove the obstacles");
        Thing listToDo2 = new Thing("Stand up");
        Thing listToDo3 = new Thing("Eat lunch");

        fleet.add(listToDo);
        fleet.add(listToDo1);
        fleet.add(listToDo2);
        fleet.add(listToDo3);

        listToDo2.complete();
        listToDo3.complete();

        System.out.println(fleet);
    }
}