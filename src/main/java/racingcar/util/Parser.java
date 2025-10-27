package racingcar.util;

import java.util.HashSet;
import java.util.Set;

public class Parser {

    private String[] cars;
    private int cnt;

    public void parse(String[] rowCars, String rowCnt){
        cars = rowCars;

        Set<String> nameSet = new HashSet<>();
        for(String car : cars){
            car = car.trim();
            if(car.length() > 5){
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }

            else if(car.isEmpty()){
                throw new IllegalArgumentException("자동차 이름은 비어있을 수 없습니다.");
            }

            else if(nameSet.contains(car)){
                throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
            }
            nameSet.add(car);
        }

        try{
            cnt = Integer.parseInt(rowCnt);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("1 이상의 숫자만 입력 가능합니다.");
        }
        if(cnt < 1){
            throw new IllegalArgumentException("1 이상의 숫자만 입력 가능합니다.");
        }
    }

    public String[] getCars(){
        return cars;
    }

    public int getCnt(){
        return cnt;
    }
}
