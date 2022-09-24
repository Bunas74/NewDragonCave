package by.epam.dragon_сave.controller;

import java.util.ArrayList;
import java.util.List;

import by.epam.dragon_сave.dao.Repository;
import by.epam.dragon_сave.model.Jewelry;
import by.epam.dragon_сave.model.Treasury;

public class Logic
{

	private final Treasury treasury = Repository.getTreasury();

	private static final Logic instance = new Logic();

	private Logic()
	{

	}

	public static Logic getInstance()
	{
		return instance;
	}

	public List<Jewelry> jewelList()
	{
		return treasury.getListJewelry();
	}

	public List<Jewelry> maxPrice()
	{
		List<Jewelry> list = treasury.getListJewelry();
		List<Jewelry> temp = new ArrayList<>();
		double max = list.get(0).getPrice();
		int index = 0;

		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getPrice() > max)
			{
				max = list.get(i).getPrice();
				index = i;
			}
		}
		temp.add(list.get(index));
		return temp;
	}

	public List<Jewelry> limitPrice(double limitPrice)
	{
		List<Jewelry> list = treasury.getListJewelry();
		List<Jewelry> temp = new ArrayList<>();
		for (Jewelry element : list)
		{
			if (element.getPrice() <= limitPrice)
			{
				temp.add(element);
			}
		}
		return temp;
	}
}
