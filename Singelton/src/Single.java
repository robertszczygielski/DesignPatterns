/**
 * Created by Robert Szczygielski on 14.11.16.
 */
public class Single {
    private Single() {}

    private static class PrepareSingle {
        static final Single INSTANCE = new Single();
    }

    public static Single getInstance() {
        return PrepareSingle.INSTANCE;
    }

    public String getSillyText() {
        return "Silly text";
    }
}
