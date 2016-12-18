class countingObjects
{
	static int count=0;
	countingObjects()
	{
		count++;
	}
	public static void counts()
	{
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		countingObjects obj1=new countingObjects();
		countingObjects obj2=new countingObjects();
		countingObjects obj3=new countingObjects();
		countingObjects obj4=new countingObjects();
		countingObjects obj5=new countingObjects();


		obj1.counts();


	}
}