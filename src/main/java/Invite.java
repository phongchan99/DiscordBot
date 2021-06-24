import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Invite extends ListenerAdapter {

    String url = "https://discord.com/oauth2/authorize?client_id=%s&scope=bot";

    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("invite")) {
            event.getChannel().sendMessage(String.format(url, event.getJDA().getSelfUser().getId())).queue();
        }
    }
}
