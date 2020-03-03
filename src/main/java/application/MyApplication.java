package application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(MyApplication.class);

    public static void run(String[] args) throws Exception {
        LOGGER.info("[Application] Starting ATM application");
        MyService.withdrawMoney(Integer.parseInt(args[2]));

        Thread.sleep(Long.valueOf(args[1]));

        MyService.withdrawMoney(Integer.parseInt(args[3]));
    }

}
