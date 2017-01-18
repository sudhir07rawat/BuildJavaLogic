/**
 * Created by sudhir.rawat on 16-01-2017.
 */
public class MySinglton {
    private static MySinglton ourInstance = new MySinglton();

    public static MySinglton getInstance() {
        return ourInstance;
    }

    private MySinglton() {
    }
}
