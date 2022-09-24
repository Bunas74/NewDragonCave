package by.epam.dragon_сave.controller;

public class Request
{
	private String commandName;
	private double limitPrice;

	public Request(String commandName)
	{
		this.commandName = commandName;
	}

	public Request(String commandName, double limitPrice)
	{
		this.commandName = commandName;
		this.limitPrice = limitPrice;
	}

	public void setCommandName(String commandName)
	{
		this.commandName = commandName;
	}

	public String getCommandName()
	{
		return commandName;
	}

	public void setLimitPrice(double limitPrice)
	{
		this.limitPrice = limitPrice;
	}

	public double getLimitPrice()
	{
		return limitPrice;
	}
}
