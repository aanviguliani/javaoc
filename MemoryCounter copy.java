
public class MemoryCounter extends Counter
{
	private int memoryCount;
	
	//constructor
	public MemoryCounter()
	{
		this.memoryCount = 0;
	}
	
	//constructor
	public MemoryCounter(int m, int c)
	{
		super(c);
		this.memoryCount = m;
		
	}
	
	
	//Reset the memoryCount
	public void resetMemCount()
	{
		//sets memory counter to 0
		memoryCount = 0;
	}
	
	//Setter
	public void setMemCount(int c)
	{
		//sets memory count
		memoryCount = c;
	}
		
	//Getter
	public int getMemCount()
	{
		//return memory count
		return memoryCount;
	}
	
	public int addCountToMem()
	{
		
		memoryCount = memoryCount + getCount();
		return memoryCount;
	}
}
