package racingcar.view;
import camp.nextstep.edu.missionutils.Console;


public class Input {
    private String[] rowCars;
    private String rowCnt;
    public void readInput(){
        readCar();
        readCnt();
    }

    private void readCar(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        rowCars = Console.readLine().split(",");
    }

    private void readCnt(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        rowCnt = Console.readLine();
    }

    public String[] getRowCars(){
        return rowCars;
    }

    public String getRowCnt(){
        return rowCnt;
    }
}
