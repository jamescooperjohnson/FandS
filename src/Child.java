
public class Child extends parent
	{
		int num = 5;
		
		public Child()
			{
				
			}
		
		public void displayChildA()
			{
			System.out.println("Child Method A");
			}

		public void displayParentB()
			{
			System.out.println("Child Method B");
			}
		
		public void printDisplayMessages()
			{
			displayParentA();
			displayParentB();
			displayChildA();
			}
		
		public void  printNumber_ChildClass()
		
			{
			System.out.println("The number is " + super.num);
			}
	}
