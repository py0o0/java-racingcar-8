package racingcar.controller;

import racingcar.domain.RaceGame;
import racingcar.util.Parser;
import racingcar.view.Input;
import racingcar.view.Output;

public class RaceGameController {
    private final Input input;
    private final Parser parser;
    private final RaceGame raceGame;
    private final Output output;

    public RaceGameController() {
        input = new Input();
        parser = new Parser();
        raceGame = new RaceGame();
        output = new Output();
    }
    public void run(){
        input.readInput();
        output.putStartMessage();

        parser.parse(input.getRowCars(), input.getRowCnt());
        raceGame.ready(parser.getCars());
        int cnt = parser.getCnt();

        while(cnt-- > 0){
            raceGame.play();
            output.putCurrentStatus(raceGame.getCars());
        }

        output.putWinner(raceGame.findWinner());

    }
}
