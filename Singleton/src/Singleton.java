public class Singleton {
    // volatile -> variable's value can be modified by different threads
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.

        // initial check avoids synchronization overhead if the instance is already initialized
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        // even if multiple threads reach the first check at the same time,
        // only one will enter the synchronized block and create the instance.
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
