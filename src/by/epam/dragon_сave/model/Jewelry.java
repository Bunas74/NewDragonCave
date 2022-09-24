package by.epam.dragon_сave.model;

import java.io.Serializable;
import java.util.Objects;

public class Jewelry implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int id;
	private String jewelryName;
	private String description;
	private String material;
	private double price;


	public Jewelry()
	{

	}

	public Jewelry(int id, String jewelryName, String description, String material, double price)
	{
		this.id = id;
		this.jewelryName = jewelryName;
		this.description = description;
		this.material = material;
		this.price = price;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setJewelryName(String jewelryName)
	{
		this.jewelryName = jewelryName;
	}

	public String getJewelryName()
	{
		return jewelryName;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getPrice()
	{
		return price;
	}
	

	@Override
	public int hashCode()
	{
		return Objects.hash(description, id, jewelryName, material, price);
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
		Jewelry other = (Jewelry) obj;
		return Objects.equals(description, other.description) && id == other.id
			&& Objects.equals(jewelryName, other.jewelryName) && Objects.equals(material, other.material)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString()
	{
		return "Jewelry [id=" + id + ", jewelryName=" + jewelryName + ", description=" + description + ", material="
			+ material + ", price=" + price + "]";
	}

}
