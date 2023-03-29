package ru.netology;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger logger;
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(new Date()) + " " + num++ + "] " + msg);
    }
}