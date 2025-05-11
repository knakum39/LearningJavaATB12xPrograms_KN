package ex_01_Java_Basics;

//#### How many Java keywords are currently used? 53 keywords

/*🔑 Keyword
Definition: A keyword is a reserved word in Java with a predefined meaning.

Role: Tells the compiler what to do.
Cannot be used as variable, class, or method names.

Examples:public, class, static, if, else, while, int, return

 🆔 Identifier
Definition: An identifier is the name used to identify a variable, class, method, package, etc.

Role: Tells the compiler which item you're referring to.
Can be chosen by the programmer, but must follow naming rules.

Examples:
main, TestExample, count, display, args, myVariable*/

public class Lab009_Keywords_Identifiers {
    public static void main(String[] args) {
        System.out.println("Hi, Keyword!");
        //Here there are 6 keywords, Total number of unique keywords used: 5
/*        Java Keywords in This Program:
package
public (appears twice: once for class, once for method)
class
static
void
Even though public appears twice, it is counted once when counting unique keywords.*/
    }
}
