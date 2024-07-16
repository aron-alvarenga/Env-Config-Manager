import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String env = "development"; // Valor padrão
        try {
            env = new String(Files.readAllBytes(Paths.get(".env"))).trim().split("=")[1];
        } catch (IOException e) {
            e.printStackTrace();
        }

        Config config = new Config(env);
        System.out.println("Database URL: " + config.getDatabaseUrl());
        System.out.println("Username: " + config.getUsername());
        System.out.println("Password: " + config.getPassword());
    }
}