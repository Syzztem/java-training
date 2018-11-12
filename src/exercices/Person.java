package exercices;

public class Person 
{
	private String name;
	private int age;
	private boolean wilder;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public boolean isWilder()
	{
		return this.wilder;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setWilder(boolean wilder)
	{
		this.wilder = wilder;
	}

	public String whoAmI()
	{
		return ("My name is " + name + " and I'm " + age);
	}

    public Person() {
    }
}
