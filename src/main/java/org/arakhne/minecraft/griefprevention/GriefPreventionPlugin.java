/*
    GriefPrevention Server Plugin for Minecraft
    Copyright (C) 2012 Ryan Hamshire
    Copyright (C) 2021 Stephane Galland

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.arakhne.minecraft.griefprevention;

import java.util.Arrays;

import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.TextMode;
import org.arakhne.afc.vmutil.locale.Locale;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/** Main Grief Prevention Plugin, adaptation for {@code Arakhne.org}.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
public class GriefPreventionPlugin extends GriefPrevention {

	@SuppressWarnings("unused")
	private static GriefPreventionPlugin singleton;

	@Override
	public void onEnable() {
		super.onEnable();
		singleton = (GriefPreventionPlugin) GriefPrevention.instance;
	}

	@Override
	public void onDisable() {
		super.onDisable();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] arguments) {
		final Player player = (sender instanceof Player) ? (Player) sender : null;
		if (player == null) {
			return true;
		}

		if ("claimrelease".equalsIgnoreCase(cmd.getName())) {
			onClaimReleaseCommand(player, cmd, alias, arguments);
			return true;
		}

		if ("pvponclaim".equalsIgnoreCase(cmd.getName())) {
			onPvpOnClaimCommand(player, cmd, alias, arguments);
			return true;
		}

		if ("claimworldconfig".equalsIgnoreCase(cmd.getName())) {
			onClaimWorldConfigCommand(player, cmd, alias, arguments);
			return true;
		}

		return super.onCommand(sender, cmd, alias, arguments);
	}

	/** Invoked when "/ClaimRelease" command is sent.
	 *
	 * @param player the player description.
	 * @param cmd the command description.
	 * @param alias Alias of the command which was used
	 * @param args the arguments to the command.
	 * @return {@code true} if it is a valid command, {@code false} otherwise. 
	 */
	protected void onClaimReleaseCommand(Player player, Command cmd, String alias, String[] args) {
		sendMessage(player, TextMode.Instr, Locale.getString("NOT_IMPLEMENTED", alias, Arrays.toString(args)), 0l);
	}

	/** Invoked when "/PvpOnClaim" command is sent.
	 *
	 * @param player the player description.
	 * @param cmd the command description.
	 * @param alias Alias of the command which was used
	 * @param args the arguments to the command.
	 * @return {@code true} if it is a valid command, {@code false} otherwise. 
	 */
	protected void onPvpOnClaimCommand(Player player, Command cmd, String alias, String[] args) {
		sendMessage(player, TextMode.Instr, Locale.getString("NOT_IMPLEMENTED", alias, Arrays.toString(args)), 0l);
	}

	/** Invoked when "/ClaimWorldConfig" command is sent.
	 *
	 * @param player the player description.
	 * @param cmd the command description.
	 * @param alias Alias of the command which was used
	 * @param args the arguments to the command.
	 * @return {@code true} if it is a valid command, {@code false} otherwise. 
	 */
	protected void onClaimWorldConfigCommand(Player player, Command cmd, String alias, String[] args) {
		sendMessage(player, TextMode.Instr, Locale.getString("NOT_IMPLEMENTED", alias, Arrays.toString(args)), 0l);
	}

}
