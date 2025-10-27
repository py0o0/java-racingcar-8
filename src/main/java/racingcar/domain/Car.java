package racingcar.domain;

public class Car {
    private int current;
    private String name;

    public Car(int current, String name) {
        this.current = current;
        this.name = name;
    }

    public void move(int randomNumber){
        if(randomNumber >= 4)
            current++;
    }

    public int getCurrent(){
        return current;
    }

    public String getName() {
        return name;
    }

    public String printStatus(){
        return "-".repeat(current);
    }
}
