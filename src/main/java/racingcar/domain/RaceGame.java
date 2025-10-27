package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class RaceGame {
    private List<Car> cars;

    public void ready(String[] carsString){
        cars = new ArrayList<>();
        for(int i = 0; i < carsString.length; i++){
            cars.add(new Car(0, carsString[i]));
        }
    }

    public void play(){
        for(Car car : cars){
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            car.move(randomNumber);
        }
    }

    public List<Car> findWinner(){
        int max = 0;
        for(Car car : cars){
            max = Math.max(max ,car.getCurrent());
        }

        ArrayList<Car> winners = new ArrayList<>();
        for(Car car : cars){
            if(car.getCurrent() == max){
                winners.add(car);
            }
        }
        return winners;
    }

    public List<Car> getCars(){
        return cars;
    }
}
