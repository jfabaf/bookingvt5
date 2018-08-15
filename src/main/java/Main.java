import org.rapidoid.goodies.ConfigHandler;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;

public class Main {

    public static void main(String[] args) {
        /* Let's take a look at the default configuration in Rapidoid */
        //On.get("/").mvc(new ConfigHandler());

        //On.page("/hi").mvc("Hello <b>world</b>!");
        App.bootstrap(args).adminCenter();
    }

}
