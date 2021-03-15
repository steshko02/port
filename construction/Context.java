package construction;

import com.elenemts.Ocean;
import com.elenemts.Port;

public class Context {
    public static Port port;
    public static Ocean ocean;

    public static Port getPort() {
        return port;
    }

    public static void setPort(Port port) {
        Context.port = port;
    }

    public static Ocean getOcean() {
        return ocean;
    }

    public static void setOcean(Ocean ocean) {
        Context.ocean = ocean;
    }

}
