package by.epam.dragon_сave.controller;

import java.util.List;

import by.epam.dragon_сave.model.Jewelry;

public class Response
{
	private String commandName;
	private List<Jewelry> listJewelry;
	private String errorMessage;

	public Response()
	{

	}

	public Response(String commandName, List<Jewelry> listJewelry)
	{
		this.commandName = commandName;
		this.listJewelry = listJewelry;
	}

	public Response(String commandName, String errorMessage)
	{
		this.commandName = commandName;
		this.errorMessage = errorMessage;
	}

	public void setCommandName(String commandName)
	{
		this.commandName = commandName;
	}

	public String getCommandName()
	{
		return commandName;
	}

	public void setListJewelry(List<Jewelry> listJewelry)
	{
		this.listJewelry = listJewelry;
	}

	public List<Jewelry> getListJewelry()
	{
		return listJewelry;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}
}
