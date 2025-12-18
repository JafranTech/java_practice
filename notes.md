working process:



how java will work na code vandhu java code send into **java compiler adhu byte code aah maatudhu** and then that will send to **jvm (java virtual machine) it change the byte cide to machine readbale code and and then it execute this is step how java code work.**



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



sring value must be in "" double quotation.**

**how to get input form user:**



java la vandhu namba kudukura op already adhulaiye irukum implicity pacakage


**import java.lang.System** idhu pre built aah irukum
 but when we get input form user na we have to import package **(import java.util.Scanner).**



eg:**import java.util.Scanner after importing this in the top of the code 

Scanner sc = new Scanner(System.In);  ##System.In is used for inputing value.##**



**int a = sc.nextInt(); ##a variable kulla user store panra value store aagum. idhula ()must use pannunam nextint ku paakkathula and then Int la i must be caps

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

