import java.util.*;
import java.io.*;

public class ZohoTask {
	public static int total_stu;
	public static String subject;

	public static void main(String[] args) {
		System.out.println("Welcome to Student Mark Entry Portal");
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number of students:");
		total_stu = sc.nextInt();
		//ZohoTask zoho = new ZohoTask();
		StudentInformation stuinfo[] = new StudentInformation[total_stu];

		String name;
		int regnum;
		String subject[] = new String[2];
		int marks[] = new int[2];

		for (int index = 0; index < total_stu; index++) 
		{
			System.out.println("Enter details for student " + (index+1) + " : ");
			System.out.println("Enter Name : ");
			name = sc.next();
			System.out.println("Enter Reg. No. : ");
			regnum = sc.nextInt();
			for (int index1 = 0; index1 < subject.length; index1++)
			{
				System.out.println("Enter Subject : ");
				subject[index1] = sc.next();
				System.out.println("Enter Mark of " + subject[index1] + " for " + name + " : ");
				marks[index1] = sc.nextInt();
				//stuinfo[index] = new StudentInformation(name, regnum, subject, marks);
			}
			stuinfo[index] = new StudentInformation(name, regnum, subject, marks);
		}

		int choice = 1;
		while(choice == 1)
		{
			System.out.println("Press 1 to view marks by Reg. No. :\nPress 2 to view marks by Subject name :\nPress 3 to exit.\n");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter Reg. No. : ");
				int search = sc.nextInt();

				for (int index = 0; index < stuinfo.length; index++)
				{
					if(search == stuinfo[index].regnum)
					{
						stuinfo[index].printDatabyReg(index);
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter Subject : ");
				String search = sc.next();

				for (int index = 0; index < stuinfo.length; index++)
				{
					for (int index1=0;index1<subject.length;index1++)
					{
						if(search.equals(stuinfo[index].subject[index1]))
						{
							stuinfo[index].printDatabySubName(index1);
						}
					}
				}
				break;
			}
			case 3:
			{
				choice = 0;
				break;
			}
			}
		}

	}
}
