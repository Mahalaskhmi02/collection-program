import java.util.*;
class CollectionTest1{
public static void main(String args[]){
List<String> l=new ArrayList<String>();
l.add("Ravi");
l.add("Vijay");
l.add("Ravi");
l.add("Ajay");
l.forEach(n->System.out.println(n)); }}