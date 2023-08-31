package gigskycodes;

public class LearnConstructor {
	String name;
	int age;
	int id;
	
	public LearnConstructor(String n)
	{
		this.name=n;
		System.out.println("Name="+n);
	}
	public LearnConstructor(String n,int a)
	{
		this.name=n;
		this.age=a;
		System.out.println("Name="+n  +  " Age="+a);
	}
	public LearnConstructor(String n,int a,int i)
	{
		this.name=n;
		this.age=a;
		this.id=i;
		System.out.println("Name="+n+" Age="+a + " Id="+i);
	}
	public static void main(String[] args) {
		LearnConstructor ob = new LearnConstructor("Sujan");
		LearnConstructor ob1 = new LearnConstructor("Sujan",22);
		LearnConstructor ob2 = new LearnConstructor("Sujan",22,2000);
		
		
				
	}

}
