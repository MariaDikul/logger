package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer num : source) {
            if (num >= f) {
                result.add(num);
            } else {
                logger.log("Элемент " + num + " не проходит");
            }

        }

        int lastChar = result.size() % 10;
        String ending = null;
        if (lastChar == 1) ending = "";
        if (lastChar == 2 || lastChar == 3 || lastChar == 4) ending = "а";
        if (lastChar == 5 || lastChar == 6 || lastChar == 7 || lastChar == 8 || lastChar == 9) ending = "ов";

        logger.log(String.format("Прошло фильтр %d элемент%s из %d", result.size(), ending, source.size()));
        return result;
    }
}
