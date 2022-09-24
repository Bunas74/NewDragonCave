package by.epam.dragon_сave.controller;

public class Controller
{

	private final Provider provider = new Provider();

	public Response send(Request request)
	{

		String commandName = request.getCommandName();
		Command command = provider.getCommand(commandName);

		Response response = command.execute(request);

		return response;

	}
}
