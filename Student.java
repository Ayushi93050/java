 import java.lang.String;
 class Student{
	int rno;
	String name;
	double gpa;
	String course;
	static String org ="CDAC";

Student (int r , String n , double g ){
	name = n;
	rno = r;
	gpa = g;
}
void getStudent(){
	System.out.println(rno+" "+name+" "+gpa+" ");
}
}