working process:



how java will work na code vandhu java code send into **java compiler adhu byte code aah maatudhu** and then that will send to **jvm (java virtual machine) it change the byte code to machine readbale code and and then it execute this is step how java code work.**



java is **object oriented** thats why we put **class** in every starting of the code.



semicolon must ;;;;;



variable and data types:



variable are containers adhu vadnhu nambalku oru value va store panradu. oru place like number 10 store in a variable .



eg;



int ten = 10;

System.out.print(ten); ##10



**ten is a variable that store the value 10.**



same as worked for string , int and every data type like bool char just like this.



**variable name aah namba duplicate panna mudiyadhu.



string value must be in "" double quotation.**

**how to get input form user:**



java la vandhu namba kudukura op already adhulaiye irukum implicity pacakage


**import java.lang.System** idhu pre built aah irukum 
 but when we get input form user na we have to import package **(import java.util.Scanner).**



eg:**import java.util.Scanner after importing this in the top of the code 

Scanner sc = new Scanner(System.In);  ##System.In is used for inputing value.##**



**int a = sc.nextInt(); ##a variable kulla user store panra value store aagum. idhula () brackets open and close must use pannunam nextint ku paakkathula and then Int la i must be caps

adha namba op code line use panni show pannulaam.

System.out.print(a);


eg;
import java.util.Scanner;**



**public class user\_input {**

    **public static void main(String arg \[]){**

        **Scanner sc = new Scanner(System.in);**

        **int a = sc.nextInt();**



        

        **int b = sc.nextInt();**



        **System.out.println("addition is:" + (a+b));**



    **}**

**}**



**imp using same one scanner with more than two value.

nextInt() reads only the number.**



**The ENTER key (\\n) stays in buffer.**



**nextLine() reads the whole line including ENTER.**



**If nextLine() is not used after nextInt(), the string input is skipped.**



**So, use sc.nextLine() to clear the buffer before reading a String.**



**Exam line:**

**nextLine() is used to consume the leftover newline character after numeric input.


eg code:import java.util.Scanner;**



**public class UserInput {**

    **public static void main(String\[] args) {**



        **Scanner sc = new Scanner(System.in);**



        **System.out.print("Enter age: ");**

        **int a = sc.nextInt();**

        **sc.nextLine(); // clear buffer**



        **System.out.print("Enter name: ");**

        **String b = sc.nextLine();**



        **System.out.println("age : " + a + " name : " + b);**

    **}**

**}**



 **System.out.println("age :" + a + "\\nname :" + b);

indha line "(\\n)name**



&nbsp;adhukulla namba potomn anew line line print aagum




=============day 2===========


start with 43:00 (https://www.youtube.com/watch?v=kGxSyqKbzsc&t=4s)


dat types it divided into two type primitive and reference or data object types.


primituve - int ,float , short , long,Boolean , decimal and reference na array. string . Boolean idhu pola.

byte na value must be inside -127 to 128 

most aah int use pannuvom romba periya number naa only we use long .

inte contains 4 bytes and long contain 8 bytes.

float na adter . we can use only 6 digit we must put f with number epdin 

this how float look like float a =9.1212f;

we did not use f in float value that will b consider as double.


double can take upto 15 decimal point .


char can store single character with sigle quote '',

for char we did not use double quotaion.

if we use double quotation ma that will consider as string.


char ellam serndha taan oru string value .

string vandhu oru object.

eg string a = "jafran";

System.out.print(a.charAt(0));

op will be j because that will take the first letter of variable a .

numbers start with 0 always in program in some place that will change so this is the method how string will work.

.

Boolean mean either true or false .

this mostly work in if else condition
.

=====IF ELSE IN JAVA====
WE SEE about 


idhu epdi work aaagum naa based on true or false statement.

sample code .

[public class basic {
    public static void main(String args []){
        boolean rain =true;
        boolean no =false;

        if(rain){
            System.out.print("take a umbrella");
        }
        else{
            System.out.print("no need to take a umbrella!!");
        }
    }
}].


we use comparison operator in if else statement 
like yedhuku laam na student mark and grase idhu pola dhuku laam use pannuvom 

comparison operator >,<,>=,


java has two types error compile time and run time.

compile time error occurred when we complie the code using javac filename.java.
like when we miss the semicolom (;)

run time error occurred during run the code java filename.java  .
like we type word in int variables
======== this imp======.


====== compare the string value=======


this is little bit comples task to understand so summa apdi taan you can ok va  


HOW TO COMPARE TWO STRINGS

In Java, when you compare two strings with '==', it checks for the references rather than comparing the actual content value inside them. So, if you want to compare the content between two strings, always use the equals() function.

references data typ namba early yaa paathom la types of data laa?


idhula equal() function must ok vaa

first we have to understand how memory will work  for that let we see some 
eg;

a big memory city inside that stack irukum adhula enna laam stor aagumna like int a =10;

idhulaam stack la store aagum like quick accessing.

andh indise memory nambalku heap nu oru block irukum adhulaam refernce data type kulla vandhurom   array list string la stored in heap memory.

string laam  heap block kulla stored in string pool.





