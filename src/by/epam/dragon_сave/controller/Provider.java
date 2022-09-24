package by.epam.dragon_сave.controller;

import java.util.HashMap;
import java.util.Map;

import by.epam.dragon_сave.controller.impl.BySumCommand;
import by.epam.dragon_сave.controller.impl.JewelListCommand;
import by.epam.dragon_сave.controller.impl.MaxPriceCommand;
import by.epam.dragon_сave.controller.impl.NoSuchCommand;

public class Provider
{

	private Map<CommandName, Command> commands = new HashMap<>();

	public Provider()
	{
		commands.put(CommandName.JEWEL_LIST, new JewelListCommand());
		commands.put(CommandName.MAX_PRICE, new MaxPriceCommand());
		commands.put(CommandName.BY_SUM, new BySumCommand());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
	}

	public Command getCommand(String nameCommand)
	{

		CommandName commandName;
		Command command;

		try
		{

			commandName = CommandName.valueOf(nameCommand);
			command = commands.get(commandName);

			if (command == null)
			{
				command = commands.get(CommandName.NO_SUCH_COMMAND);
			}

		}
		catch (Exception e)
		{
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}

		return command;

	}

}
