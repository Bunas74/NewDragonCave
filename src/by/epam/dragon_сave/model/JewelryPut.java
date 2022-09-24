package by.epam.dragon_сave.model;

import java.util.ArrayList;
import java.util.List;

public class JewelryPut
{

	public static Treasury putJewelry()
	{

		Treasury treasury = null;

		List<Jewelry> listJewelry = new ArrayList<>();

		listJewelry.add(new Jewelry(1, "Arkenstone", "Stone", "diamond", 100));
		listJewelry.add(new Jewelry(2, "Iron Crown", "Crown", "iron", 88));
		listJewelry.add(new Jewelry(3, "Nauglamir", "Dwarf necklace", "emerald", 67));
		listJewelry.add(new Jewelry(4, "Nimphelos", "Pearl", "pearl", 46));
		listJewelry.add(new Jewelry(5, "Girion's necklace", "Necklace", "emerald", 35));
		listJewelry.add(new Jewelry(6, "Star of the Dunedain", "Brooch", "silver", 55));
		listJewelry.add(new Jewelry(7, "Star of Elendil", "Diadem", "mithril", 72));
		listJewelry.add(new Jewelry(8, "Ring of Barahir", "Ring", "gold", 20));
		listJewelry.add(new Jewelry(9, "Crown of Gondor", "Crown", "silver", 58));
		listJewelry.add(new Jewelry(10, "Sceptre of Annuminas", "Sceptre", "silver", 66));
		listJewelry.add(new Jewelry(11, "Elessar", "Stone", "beryl", 49));

		treasury = new Treasury(listJewelry);

		return treasury;

	}

}
