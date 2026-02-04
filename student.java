class Student
{
	int rollno;
	String name;
	String branch;
	int marks;

	void getdata(int rollno,String name,String branch,int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}
	void display()
	{
		System.out.println("Rollno : " +rollno);
		System.out.println("Name : " +name);
		System.out.println("Branch : " +branch);
		System.out.println("Marks : " +marks);
	}
	public static void main(String args[])
	{
		Student S1 = new Student();
		Student S2 = new Student();
	    S1.getdata(1,"ram","CSE",75);
	    S2.getdata(2,"keerthi","IT",85);
	    S1.display();
	    S2.display();
	}
}