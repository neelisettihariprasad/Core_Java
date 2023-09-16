package hari.javaprogramming;

public class Marks extends Student{
	private float s1,s2,s3;
	private float total,avg,res;
	public void addstudent(int id, String na, String cou,float su1, float su2,float su3,float tot,float a,float r)
	{
		super.addstudent(id,na,cou);
		s1=su1;
		s2=su2;
		s3=su3;
		total=tot;
		avg=a;
		res=r;
	
	}
	public void addmarks()
	{
		int s1,s2,s3;
		s1=40;
		s2=54;
		s3=64;
		total=s1+s2+s3;
		avg=total/3;
		if(avg>40) {
			System.out.println("pass");
		}
	}
	public void display()
	{
		System.out.println("idno  "+idno);
		System.out.println("name  "+name);
		System.out.println("course  "+course);
		System.out.println("s1  "+s1+"\n"+"s2  "+s2+"\n"+"s3  "+s3);
		System.out.println("total  "+ total);
		System.out.println("avg  "+ total);
	}
	public static void main(String[] args)
	{
		Marks obj = new Marks();
		obj.addstudent(1001, "hari", "java");
		obj.addmarks();
		obj.display();
	
	}



}
