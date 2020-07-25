package Creational_FactoryMethodPattern;

public class SelectChocolate 
{
	public Chocolate ChocoType(String choco_name)
	{
		if(choco_name==null)
		{
			return null;
		}
		if(choco_name.equalsIgnoreCase("Dairy Milk"))
		{
			return new DairyMilk();
		}
		else if(choco_name.equalsIgnoreCase("Ferrero Rocher"))
		{
			return new FerreroRocher();
		}
		else if(choco_name.equalsIgnoreCase("KitKat"))
		{
			return new KitKat();
		}
		
		return null;
	}

}