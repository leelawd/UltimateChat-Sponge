package br.net.fabiozumbi12.UltimateChat.config;

import java.util.List;

import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.ArgumentParseException;
import org.spongepowered.api.command.args.CommandArgs;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.args.CommandElement;
import org.spongepowered.api.text.Text;

import br.net.fabiozumbi12.UltimateChat.UChat;

public class ChannelCommandElement extends CommandElement {

	public ChannelCommandElement(Text key) {
		super(key);
	}

	@Override
	protected Object parseValue(CommandSource source, CommandArgs args)
			throws ArgumentParseException {		
		return UChat.get().getConfig().getChannel(args.next());
	}

	@Override
	public List<String> complete(CommandSource src, CommandArgs args,
			CommandContext context) {
		return UChat.get().getConfig().getChAliases();
	}
	
	@Override
    public Text getUsage(CommandSource src) {
        return Text.of("<channel>");
    }
}
