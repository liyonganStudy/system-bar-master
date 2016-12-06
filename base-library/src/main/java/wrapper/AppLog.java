package wrapper;

import com.example.base_library.BuildConfig;
import com.orhanobut.logger.Logger;

public class AppLog {

    private static final String TAG = "landyApp";

    /**
     * initialize the logger.
     */
    public static void init() {
        Logger.init(TAG);
    }

    /**
     * log.i
     * @param msg
     */
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.i(msg);
        }
    }

    /**
     * log.d
     * @param msg
     */
    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.d(msg);
        }
    }

    /**
     * log.w
     * @param msg
     */
    public static void w(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.w(msg);
        }
    }

    /**
     * log.e
     * @param msg
     */
    public static void e(String msg) {
        Logger.e(msg);
    }

    public static void e(Throwable e) {
        Logger.e(e, "");
    }
}