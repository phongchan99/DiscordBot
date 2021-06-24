import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODU3NjQxMzE3NzY3OTcwODY3.YNSiuA.chgbDNXHoS40D5yw8XVK_fFz6qk");
        JDA jda;
        jda = jdaBuilder.build();
    }
}
