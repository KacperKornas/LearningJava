class Refrigerator {

    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood() {
        hasWorkToDo = true;
    }
}



class DishWasher {

    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes() {
        hasWorkToDo = true;
    }
}



class CoffeeMaker {

    private boolean hasWorkToDo;

    public void doDishes() {
        hasWorkToDo = true;
    }
    public void brewCoffee() {
        hasWorkToDo = true;
    }
}
