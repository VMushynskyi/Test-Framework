package framework.ui.core.utilits.logging;

import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class Log {

    public static void info(String message, Object... params){
        FormattingTuple formattingTuple = MessageFormatter.arrayFormat(message,params);
        info(formattingTuple.getMessage());
    }

    @Step("{0}")
    private static void info(String message){
        getLogger(4).info(message);
    }

    private static Logger getLogger(int stackTraceLength){
        return LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[stackTraceLength].getClassName());
    }
}
