public class StudentInformation
{
	public String name;
	public int regnum;
	public String subject[] = new String[2];
	public int marks[]  = new int[2];

	StudentInformation(String name, int regnum, String[] subject, int[] marks)
	{
		this.name = name;
		this.regnum = regnum;
		for (int index=0;index<2;index++)
		{
			this.subject[index] = subject[index];
			this.marks[index] = marks[index];
		}
	}

	public void printDatabyReg(int index)
	{
		System.out.printf("Name : " + name + "\n");
		for (int index1=0;index1<2;index1++)
		{
			System.out.printf("Subject : " + subject[index1] + "\n" + "Marks : " + marks[index1] + "\n");
		}
	}
	public void printDatabySubName(int index1)
	{
		System.out.printf("Name : " + name + "\n" + "Reg. No. : " + regnum + "\n");		
		System.out.printf("Marks in " + subject[index1] + " is " + marks[index1] + "\n");
	}
}
