package by.epam.dragon_сave.controller.impl;

import java.util.List;

import by.epam.dragon_сave.controller.Command;
import by.epam.dragon_сave.controller.Logic;
import by.epam.dragon_сave.controller.Request;
import by.epam.dragon_сave.controller.Response;
import by.epam.dragon_сave.model.Jewelry;

public class JewelListCommand implements Command
{

	private final Logic logic = Logic.getInstance();

	@Override
	public Response execute(Request request)
	{

		Response response = null;

		List<Jewelry> jewelList = logic.jewelList();
		String commandName = request.getCommandName();

		response = new Response(commandName, jewelList);

		return response;

	}
}

