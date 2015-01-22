package planer.io;

public class BusinessContact extends Contact
{
	
	private String bussinessPhone;
	private String cellPhone;
	
	public BusinessContact(String name, int age, String cellPhone, String bussinessPhone) 
	{
		super(name, age);
		this.cellPhone = cellPhone;
		this.bussinessPhone = bussinessPhone;
	}
	
	public String getBussinessPhone()
	{
		return bussinessPhone;
		
	}
	
	public String getCellPhone()
	{
		return cellPhone;
		
	}
	
	public void setBussinessPhone(String bussinessPhone)
	{
		this.bussinessPhone = bussinessPhone;
	}
	
	public void setCellPhone(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}
	
	public String toString()
	{
		return "Personal Contact: " + getName() + " (" + getAge() + "), " +"Busniess Cell: " 
				+ bussinessPhone + ", Personal Phone: " + cellPhone;
	}
	

}

