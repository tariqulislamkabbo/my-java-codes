public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
//setter
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }


//getter
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public double getCgpa(){
		return cgpa;
	}
	
		
	public static void main(String[]args)
	{
		
		
		Student s1 = new Student();
		
		s1.setId(125);
		s1.setName("john");
		s1.setCgpa(3.8);
		
	
		System.out.println("Student Id: "+ s1.getId());
		System.out.println("Student Name: "+s1.getName());
		System.out.println("Student CGPA: "+s1.getCgpa());
	}
}

