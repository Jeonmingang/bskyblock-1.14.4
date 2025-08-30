
package world.bentobox.bskyblock.commands;

import world.bentobox.bentobox.api.commands.CompositeCommand;
import world.bentobox.bentobox.api.commands.CommandSender;
import world.bentobox.bentobox.api.user.User;

public class IslandManagerCommand extends CompositeCommand {

    public IslandManagerCommand(CompositeCommand parent) {
        super(parent, "관리", "manage");  // Updated command to Korean "/섬 관리"
    }

    @Override
    public void setup() {
        setDescription("섬 관리: 섬장, 부섬장, 섬원 권한 관리.");
        new IslandManageRoleCommand(this);   // Add roles management (섬장, 부섬장, 섬원)
        new IslandInviteCommand(this);       // Add invite functionality (섬원 초대)
        new IslandWorkerCommand(this);       // Add worker functionality (섬 알바 고용)
    }
}
