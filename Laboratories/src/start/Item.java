package start;

public class Item 
{
	private String name;
	private double weight;
	public Item()
	{
		name = "noname";
		weight = 1.0;
	}
	public Item(String new_name, double new_weight)
	{
		if(new_weight<=10.0 && new_weight>0.0)
		{
			name = new_name;
			weight = new_weight;
		}
	}
	public String toStringl()
	{
		return this.name + ' ' + this.weight;
	}
}
