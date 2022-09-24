package by.epam.dragon_сave.controller.impl;

import java.util.List;

import by.epam.dragon_сave.controller.Command;
import by.epam.dragon_сave.controller.Logic;
import by.epam.dragon_сave.controller.Request;
import by.epam.dragon_сave.controller.Response;
import by.epam.dragon_сave.model.Jewelry;


public class BySumCommand implements Command
{

	private final Logic logic = Logic.getInstance();

	@Override
	public Response execute(Request request)
	{

		Response response = null;

		String commandName = request.getCommandName();
		double limitPrice = request.getLimitPrice();

		List<Jewelry> byLimitPrice = logic.limitPrice(limitPrice); 

		response = new Response(commandName, byLimitPrice);

		return response;
		
	}
}

