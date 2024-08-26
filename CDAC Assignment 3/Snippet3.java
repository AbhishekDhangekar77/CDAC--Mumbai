Snippet 1:  
public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) //use i++ instead of i++
		{ 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?
 
 //Answer 
 /*The loop ran infinitely because the loop control variable
 i was decrementing (i--), which caused it to move further away 
 from the condition that would end the loop (i < 10).
 Change the update expression to i++ so that i increments and 
 eventually reaches a value where i < 10 becomes false, allowing
 the loop to terminate*/
 
 Snippet 2:  
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
/* Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop?*/
Answer
The loop did not execute because the condition used the
 assignment operator = instead of the comparison operator ==.
 As a result, the loop condition always evaluated to false.
 Replace the assignment operator with the correct comparison
 operator (==) or use a condition like count != 0 to control
 the loop's execution.
 
 Snippet 3: 
 public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0);
		} 
} 
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do
while` loop? 

Answer
The loop does not execute only once under normal conditions with num > 0 
as the condition. It will keep executing because num is always greater
than 0 after the first iteration.

public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the 
expected output? 
Answer
The issue with the original loop is the condition i <= 10, which allows the
 loop to include 10 in its output. By changing the condition to i < 10, the 
 loop will correctly print numbers from 1 to 9, meeting the expected output.

Snippet 5: 
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop? 

Answer
The incorrect i++ (increment) was the problem. It should be i-- (decrement) 
to count down from 10 to 0.

Snippet 6:  
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
} 
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to 
include all statements within the loop? 

Answer
To include both System.out.println(i); and System.out.println("Done"); within
the loop body, you should enclose them in curly braces {}:



Snippet 7:  
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
//variable properly?
Answer
The compilation error occurs because count is used before being initialized. 
To fix the error, you should initialize count with a starting value before 
the while loop.Initialize count = 0 to get the output


Snippet 8:  

public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; //num++
        } while (num > 0); // (num<=5)
    } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5? 
Answer
By changing num-- to num++ and adjusting the loop condition to num <= 5, the loop will 
correctly print numbers from 1 to 5.


Snippet 9:  
public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) // change i<=20 to print table of 2
		{ 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected? 
Answer
The statement is true it will print 0,2,4 but to correct the for loop need to change by
 i<=20 it will print table of 2.
 
Snippet 10:  
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition
Answer
The original loop runs indefinitely because num = 10 is an assignment,
not a comparison. The loop condition should be a boolean expression that 
eventually evaluates to false to allow the loop to terminate. Using num > 0
as the condition allows the loop to run until num becomes 0.

Snippet 11:  
public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
} 
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
desired result?

Answer
This snippet is same as 9th so if we want to print value from 0 to 4 then 
change i+=2 to i++ then it will print 0 to 4 .Their is no error in this code.


Snippet 12:  
public class LoopVariableScope { 
    public static void main(String[] args) 
	//int x = 0
	{ 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Declare x outside the loop or print statement should be in for loop so their will be error 
    } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

Answer
Declare x outside the loop or print statement should be in for loop so their will be error 


SECTION 2: Guess the Output
Snippet 1:
public class NestedLoopOutput { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(i + " " + j + " "); 
            } 
            System.out.println(); 
 
 
        } 
    } 
} 
// Guess the output of this nested loop.
Answer
1112
2122
3132

Snippet 2:  
public class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 
// Guess the output of this loop.
Answer
Total = 11

Snippet 3: 
public class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
// Guess the output of this while loop.
Answer 
0 1 2 3 
 
Snippet 4:  
public class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
// Guess the output of this do-while loop. 
Answer
1 2 3 4 5

Snippet 5:  
public class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 
// Guess the output of this loop. 
Answer
3

Snippet 6: 
public class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++;  //6-6 + 4+4 = 8
        System.out.println(y); 
    } 
} 
// Guess the output of this code snippet.
Answer
8

Snippet 7:  
public class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; // 11 * 5 - 10 + 4
        System.out.println(result);         //    55 - 10 + 4
    }                                       //     45 + 4 = 49
} 
// Guess the output of this code snippet.
Answer
49

Snippet 8:  
public class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i;    
        }                          //  first iteration  0 += 0 - 2 = -2  count= -2
		                           //  second iteration -2 += 3 - 5 = -2  count= -4
        System.out.println(count); 
    }
	
Answer
	count = -4