package racingcar.global.utils;

import camp.nextstep.edu.missionutils.Console;

import java.util.NoSuchElementException;

public class ConsoleUtils {

    private ConsoleUtils() {}

    public static String inputData() {
        String inputData;
        try {
            inputData = Console.readLine();
        } catch (NoSuchElementException e){
            inputData = "";
        }
        return inputData;
    }
}
