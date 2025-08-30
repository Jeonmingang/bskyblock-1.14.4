
package world.bentobox.bskyblock.commands;

import world.bentobox.bentobox.api.commands.CommandSender;
import world.bentobox.bentobox.api.commands.Command;
import world.bentobox.bentobox.api.user.User;

public class IslandInviteCommand extends Command {

    public IslandInviteCommand(CompositeCommand parent) {
        super(parent, "초대", "invite");  // Updated command to Korean "/섬 초대"
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (args.length == 1) {
            String playerName = args[0];
            inviteToIsland(playerName);
        } else {
            sender.sendMessage("잘못된 명령어 형식입니다. /섬 초대 [플레이어 이름]");
        }
    }

    private void inviteToIsland(String playerName) {
        // Logic to invite player to the island as 섬원
        // This would involve adding the player to the island's member list
    }
}
