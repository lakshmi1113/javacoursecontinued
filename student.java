// public class student {
//      static String cllgname;
//      int rollno;
//      String name;
     
//      public student(String name){
//         this.name = name;
//         this.rollno = setrollno();
//      }

//      static int counter = 0;
//      public static int setrollno(){
//         counter ++;
//         return counter;
//      }

//      public static void setcllg(String name){
//          cllgname = name;

//      }

//      public  void getstudentinfo(){
//          System.out.println("student name:" + this.name);
//          System.out.println("Student rollno:" + this.rollno);
//          System.out.println("college name:" + cllgname);
//      }

//      public static void main(String[] args){
//         student.setcllg("XYZ");
//         student s1 = new student("Lakshmi");
//         student s2 = new student("abc");

//         s1.getstudentinfo();
//         s2.getstudentinfo();
//      }
// }

public class student{
   private static String str = "GeeksforGeekss";
   static class nestedclass{
      public void disp(){
         System.out.println(str);
      }
    }
   public static void main(String[] args){
      student.nestedclass obj = new student.nestedclass();
      obj.disp();
   }
}