package planer.io;

public class PersonalContact extends Contact
{
	private String address;
	private String state;
	private String city;
	private int zip;
	
	public PersonalContact( String name, int age, String address, String city, String state, int zip) 
	{
		super(name, age);
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}
	
	public String getAddress()
	{
		return address;
		
	}
	
	public String getState()
	{
		return state;
		
	}
	
	public String getCity()
	{
		return city;
		
	}
	
	public int getZip()
	{
		return zip;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setZip(int zip)
	{
		this.zip = zip;
		
	}
	
	public String toString()
	{
		return "Personal Contact: " + getName() + " (" + getAge() + "), " + address +
				", " + city + ", " + state + ", " + zip;
	}
	

}
