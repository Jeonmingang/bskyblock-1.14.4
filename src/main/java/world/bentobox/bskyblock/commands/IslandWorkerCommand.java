
package world.bentobox.bskyblock.commands;

import world.bentobox.bentobox.api.commands.CommandSender;
import world.bentobox.bentobox.api.commands.Command;
import world.bentobox.bentobox.api.user.User;

public class IslandWorkerCommand extends Command {

    public IslandWorkerCommand(CompositeCommand parent) {
        super(parent, "알바", "worker");  // Updated command to Korean "/섬 알바"
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (args.length == 1) {
            String playerName = args[0];
            hireAsWorker(playerName);
        } else {
            sender.sendMessage("잘못된 명령어 형식입니다. /섬 알바 [플레이어 이름]");
        }
    }

    private void hireAsWorker(String playerName) {
        // Logic to hire player as 섬 알바 (allowing them to place and break blocks)
        // This would involve adding the player to the worker list of the island
    }
}
