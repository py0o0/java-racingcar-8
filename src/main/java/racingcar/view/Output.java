package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class Output {
    public void putStartMessage() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public void putCurrentStatus(List<Car> cars) {
        for(Car car : cars){
            System.out.println(car.getName() + " : " + car.printStatus());
        }
    }

    public void putWinner(List<Car> winner) {
        StringBuilder winnerName = new StringBuilder();
        for(Car car : winner){
            winnerName.append(car.getName());
            winnerName.append(", ");
        }
        winnerName.setLength(winnerName.length()-2);

        System.out.println("최종 우승자 : " + winnerName.toString());
    }
}
