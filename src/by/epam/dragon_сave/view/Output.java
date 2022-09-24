package by.epam.dragon_сave.view;

import java.util.List;

import by.epam.dragon_сave.controller.Response;
import by.epam.dragon_сave.model.Jewelry;

public class Output
{

	private static final Output instance = new Output();

	private Output()
	{

	}

	public static Output getInstance()
	{
		return instance;
	}

	public void printMenu()
	{
		System.out.println("Menu.");
		System.out.println("Enter:");
		System.out.println("\t 1 - if you want to see a jewel list.");
		System.out.println("\t 2 - if you want to see the description of the jewel with the maximum price.");
		System.out.println("\t 3 - if you want to see a list of jewels in a certain price range.");
	}

	public void print(String title, List<Jewelry> listJewelry)
	{
		System.out.println(title);
		System.out.println("----------------------------------------------------------");
		System.out.printf("|%-2s|%-20s|%-15s|%-10s|%-5s|\n", "ID", "NAME", "DESCRIPTION", "MATERIAL", "PRICE");
		System.out.println("----------------------------------------------------------");
		for (Jewelry element : listJewelry)
		{
			System.out.printf("|%-2d|%-20s|%-15s|%-10s|%-5.1f|\n", element.getId(), element.getJewelryName(),
							  element.getDescription(), element.getMaterial(), element.getPrice());
		}
		System.out.println("----------------------------------------------------------");
	}

	public void print(Response response)
	{
		System.out.println("\t" + response.getCommandName() + "??? Error, You have entered an invalid value.");
	}
}
