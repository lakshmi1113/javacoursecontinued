import java.util.Scanner;

import java.util.HashMap;

class Hashmaps1 {
public static void main(String[] args){
HashMap <String, String> SevenWonders = new HashMap<String, String>();

SevenWonders.put("India", "Taj Mahal");

SevenWonders.put("China", "Great wall of China");

SevenWonders.put("Italy", "Colloseum");

SevenWonders.put("Peru", "Machu picchu");

SevenWonders.put("Brazil", "Christ the Redeemer");

SevenWonders.put("Jordan", "Petra");

SevenWonders.put("Mexico", "Chichen itza");

Scanner sc = new Scanner(System.in);

System.out.println("Enter the country to look for:-");

String s = sc.next();

boolean flag = true;

for(String i : SevenWonders.keySet()){

if(s==i){

System.out.println("The wonder in "+ i+ " is "+ SevenWonders.get(i));

flag = false;

}

}

if(flag){

System.out.println("No wonder in the given country");

}

}

}