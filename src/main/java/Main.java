import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    //https://discord.com/oauth2/authorize?client_id=(clientID)&scope=bot

    public static void main(String[] args){
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODU3NjQxMzE3NzY3OTcwODY3.YNSiuA.vKQTc-4NALjYt3mLluh4gBazWUs");
        JDA jda = null;
        PingPong pingPong = new PingPong();
        jdaBuilder.addEventListeners(pingPong);
        Invite invite = new Invite();
        jdaBuilder.addEventListeners(invite);
        jdaBuilder.setActivity(Activity.watching("Chris' Tutorial Series"));

        try {
            jda = jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

        try {
            jda.awaitReady();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
