package planer.io;

public class BusinessContact 
{
	
	private int bussinessPhone;
	private int cellPhone;
	
	public BusinessContact(int cellPhone, int bussinessPhone) 
	{
		super();
		this.cellPhone = cellPhone;
		this.bussinessPhone = bussinessPhone;
	}
	
	public int getBussinessPhone()
	{
		return bussinessPhone;
		
	}
	
	public int getCellPhone()
	{
		return cellPhone;
		
	}
	
	public void setBussinessPhone(int bussinessPhone)
	{
		this.bussinessPhone = bussinessPhone;
	}
	
	public void setCellPhone(int cellPhone)
	{
		this.cellPhone = cellPhone;
	}
	
	public String toString()
	{
		return null;
	}
	

}

