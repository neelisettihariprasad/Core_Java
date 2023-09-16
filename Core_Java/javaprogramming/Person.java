package hari.javaprogramming;

public class Person {
    public int id;
    public String name,adress;
    public long mobile;
  public void Addperson(int i,String n,String a,long m) {
	  id=i;
	  name=n;
	  adress=a;
	  mobile=m;
  }
  public void Addperson(int id ,String name, String adress,String mobile) {
	  
  }
  public void Addperson(int id ,String name ) {
	  
  }
  public void Showperson() {
	  System.out.println(" id is :"+ id);
	  System.out.println(" name is :"+ name);
	  System.out.println(" adress is :"+ adress);
	  System.out.println(" mobile is :"+ mobile);
  }
  public static void main(String[] args) {
	Person p =new Person();
	p.Addperson(1, " hari", "ongole", 630553036);
	p.Addperson(2, " deepthi", "hyd", "9838838388");
	p.Addperson(3, " vinay");
	p.Showperson();
}
}
