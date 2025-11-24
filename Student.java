public class Student
{
    int roll_num,mar;
    
    Student(int roll){
        roll_num=roll;
    }
    
    Student(int roll,int marks){
        roll_num=roll;
        mar=marks;
    }
    
    void display(){
        System.out.println("Roll number of student 1:"+roll_num);
        
        System.out.println("Marks of s1:"+mar);
    }
    
    
	public static void main(String[] args) {
	    String str="85";
	    int a =Integer.parseInt(str);
	    
	    Student s1=new Student(101);
	    Student s2=new Student(102,a);
	    
	    s1.display();
	    s2.display();
		
	}
}
