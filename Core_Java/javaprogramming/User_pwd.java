package hari.javaprogramming;
import java.util.*;
public class User_pwd {

	public static void main(String[] args) {
		String userid,pwd;
		Scanner key=new Scanner(System.in);
		System.out.println(" enter userid and password");
		userid=key.next();
		pwd=key.next();
		String uid="Af0123";
		String password="STU@123";
		System.out.println(userid);
		System.out.println(pwd);
		if(userid.equalsIgnoreCase(uid) & pwd.equalsIgnoreCase(password)) {
			System.out.println("succesfull login");
		}else {
			System.out.println("login failed");
		}

	}

}
