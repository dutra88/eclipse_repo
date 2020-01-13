package list;

public class StudentList
{

	public static void main(String[] args)
	{
		Student[] s = new Student[2];
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i<s.length; i++)
		{
			System.out.println("Enter Id: ");
			s[i].setId(scan.nextInt());
			System.out.println("Enter Name: ");
			s[i].setName(scan.nextLine());
		}
	}
}