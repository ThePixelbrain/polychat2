package club.moddedminecraft.polychat.client.clientbase.logging;

public class DefaultLogger implements Logger {
    @Override
    public void error(String message) {
        System.err.println(message);
    }

    @Override
    public void error(String message, Throwable t) {
        System.err.println(message);
        t.printStackTrace();
    }

    @Override
    public void warn(String message) {
        error(message);
    }

    @Override
    public void warn(String message, Throwable t) {
        error(message, t);
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public void info(String message, Throwable t) {
        System.out.println(message);
        t.printStackTrace(System.out);
    }

    @Override
    public void debug(String message) {
        info(message);
    }

    @Override
    public void debug(String message, Throwable t) {
        info(message, t);
    }
}
