package abstract_and_interfaces;

public class Housecat extends Animal {
    String eat(String food) {
        return "nom nom nom";
    }

    @Override
    String move() {
        return null;
    }
}
