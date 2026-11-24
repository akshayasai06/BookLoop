import org.mindrot.jbcrypt.BCrypt;

public class GenerateHash {
    public static void main(String[] args) {
        String hash = BCrypt.hashpw("Admin@123", BCrypt.gensalt(10));
        System.out.println(hash);
        System.out.println(BCrypt.checkpw("Admin@123", hash));
    }
}