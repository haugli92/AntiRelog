package pl.jeremi.antirelog;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.inventivetalent.bossbar.BossBarAPI;

/**
 * Created by Jeremiasz N. on 2016-04-28.
 */
public class BarVanishTimeoutTask extends BukkitRunnable {
    Player player;

    public BarVanishTimeoutTask(Player player) {
        this.player = player;
    }

    public void run() {
        BossBarAPI.removeAllBars(player);
    }
}
