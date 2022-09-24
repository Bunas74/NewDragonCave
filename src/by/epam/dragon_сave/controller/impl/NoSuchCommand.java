package by.epam.dragon_сave.controller.impl;

import by.epam.dragon_сave.controller.Command;
import by.epam.dragon_сave.controller.CommandName;
import by.epam.dragon_сave.controller.Request;
import by.epam.dragon_сave.controller.Response;

public class NoSuchCommand implements Command
{

	@Override
	public Response execute(Request request)
	{

		Response response = null;

		String commandName = request.getCommandName();

		response = new Response(commandName, CommandName.NO_SUCH_COMMAND.name());

		return response;
		
	}
}
