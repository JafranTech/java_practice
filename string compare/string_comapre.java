public class string_comapre {
    public static void main(String args[]){
        /*idhula namba compare the string value 
         */

        String a1 = new String ("apple");
        String a2 = new String ("apple");

        String f1 = "apple";
        String f2 = "apple";

        System.out.print(a1==a2);
        System.out.print(f1==f2);
    }
}


/*Case 1️⃣ Using new String()
String a1 = new String("apple");
String a2 = new String("apple");
What happens?
•	new String() creates new objects in heap
•	So two different memory addresses
a1 == a2        // false  ❌ (address different)
a1.equals(a2)  // true   ✅ (content same)
👉 == checks reference (address)
👉 equals() checks content
________________________________________
Case 2️⃣ Using String literal
String f1 = "apple";
String f2 = "apple";
What happens?
•	Java uses String Pool
•	"apple" created only once
•	Both variables point to same object
f1 == f2        // true  ✅
f1.equals(f2)  // true  ✅
 */