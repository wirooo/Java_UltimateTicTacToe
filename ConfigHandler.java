import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigHandler {

    private static ConfigHandler configHandler;
    private Properties prop;
    private InputStream in;

    private ConfigHandler() throws IOException{
        String propFileName = "config.properties";
        prop = new Properties();
        in = getClass().getClassLoader().getResourceAsStream(propFileName);

        if(in != null){
            prop.load(in);
        }else{
            throw new FileNotFoundException(propFileName + " not found.");
        }
    }

    public static ConfigHandler getInst() throws IOException{
        if(configHandler == null){
            configHandler = new ConfigHandler();
        }
        return configHandler;
    }

    public  String getPropertyValue(String key) throws Exception{
        String result = "";
        try{
            result = prop.getProperty(key);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            in.close();
        }
        return result;
    }

}
