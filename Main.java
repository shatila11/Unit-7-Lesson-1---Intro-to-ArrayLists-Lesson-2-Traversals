import java.util.*;


class Main {
  public static void main(String[] args) {
 Scanner it= new Scanner(System.in);
 
 ArrayList <String> lastNames= new ArrayList <String> ();
 lastNames.add("Shatila");
 lastNames.add("Sareini");
 lastNames.add("Harrity");
 System.out.println(lastNames);
 lastNames.add(1,"Singley");
 System.out.println(lastNames);
 System.out.println("Size of lastNames is "+lastNames.size());
 System.out.println("String removed is " +lastNames.remove(2));
 System.out.println(lastNames);
 System.out.println("Size of lastNames is "+lastNames.size());
 System.out.println("Used the set command to change the String is postion 0"+lastNames.set(0,"Gorsline"));
 System.out.println(lastNames);
 System.out.println("Size of lastNames is "+lastNames.size());
//lastNames.clear();
System.out.println(lastNames);
System.out.println("Size of lastNames is "+lastNames.size());
Integer one=new Integer(1);
Double two= new Double(2.0);
String three="3";
//lastNames.add(one);
//lastNames.add(two);
//lastNames.add(three);
ArrayList demo=new ArrayList();
demo.add(one);
demo.add(two);
demo.add(three);
System.out.println(demo);

//Traversals Start Here
for(int i=0;i<lastNames.size();i++)
{
  System.out.println("Item "+(i+1)+": "+lastNames.get(i));
}

for(int i=lastNames.size()-1;i>=0;i--)
{
  System.out.println("Item "+(i+1)+": "+lastNames.get(i));
}
lastNames.add("Barnett");
lastNames.add("Yaldo");
lastNames.add("McNamara");
for(String x:lastNames)
{
  System.out.println(x);
}
ArrayList <String> letters = new ArrayList <String> ();
letters.add("A");
letters.add("B");
letters.add("C");
letters.add("D");
letters.add("E");
letters.add("F");


for(int i=0; i<letters.size(); i++)
{
for(int j=0; j<lastNames.size(); j++)
{
  if(letters.get(i).equals(lastNames.get(j).substring(0,1)))
  {
    System.out.println(lastNames.get(j)+" starts with "+letters.get(i));
  }
}
}


}
}