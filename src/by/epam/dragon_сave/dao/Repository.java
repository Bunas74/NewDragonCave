package by.epam.dragon_сave.dao;

import by.epam.dragon_сave.model.JewelryPut;
import by.epam.dragon_сave.model.Treasury;

public class Repository
{
	private static Treasury treasury = JewelryPut.putJewelry();

	public static Treasury getTreasury()
	{
		return treasury;
	}

	public static void setTreasury(Treasury treasury)
	{
		Repository.treasury = treasury;
	}
}
