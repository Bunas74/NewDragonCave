package by.epam.dragon_сave.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Treasury implements Serializable
{
	private static final long serialVersionUID = 1L;


	private List<Jewelry> listJewelry;


	public Treasury()
	{
		listJewelry = new ArrayList<>();
	}


	public Treasury(List<Jewelry> listJewelry)
	{
		this.listJewelry = listJewelry;
	}


	public void setListJewelry(List<Jewelry> listJewelry)
	{
		this.listJewelry = listJewelry;
	}


	public List<Jewelry> getListJewelry()
	{
		return listJewelry;
	}


	public void add(Jewelry jewelry)
	{
		listJewelry.add(jewelry);
	}


	public void delete(Jewelry jewelry)
	{
		listJewelry.remove(jewelry);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(listJewelry);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasury other = (Treasury) obj;
		return Objects.equals(listJewelry, other.listJewelry);
	}

	@Override
	public String toString()
	{
		return "Treasury [listJewelry=" + listJewelry + "]";
	}

}
