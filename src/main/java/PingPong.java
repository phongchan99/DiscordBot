import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("!Phong")) {
            event.getChannel().sendMessage("rất đẹp trai.").queue();
        }
        if (event.getMessage().getContentRaw().equals("!Luan")) {
            event.getChannel().sendMessage("vip pro.").queue();
        }
        if (event.getMessage().getContentRaw().equals("!Jimmy")) {
            event.getChannel().sendMessage("ăn đòn.").queue();
        }
    }
}
