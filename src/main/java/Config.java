import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

public class Config {
    private String databaseUrl;
    private String username;
    private String password;

    public Config(String env) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("config/config." + env + ".json")));
            JSONObject json = new JSONObject(content);

            this.databaseUrl = json.getString("database_url");
            this.username = json.getString("username");
            this.password = json.getString("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}