# For-Loops
Review of For Loops and Nested For Loops

The for loop performs statements a certain number of times.  Recall that a for loop is really a while loop but has a specialized syntax.  

```
    for(initialization; test; update) {
      statement(s); 
    }
```
- The intialization is to declare what variable to use in the loop.  This is performed once as the loop begins.  By convention, i (or j, k) is used as the name of this variable but it can be named whatever we want it to be.  
- The test compares the value of the variable against a limit, which is why we used a comparison operator.  
- If the test passes, the update increases or decreases the variable value by a certain amount.  

We can use for loops to iterate through a String, an array, have it count with a given pattern, etc.  

## Examples:

```
//print out the first 9 perfect squares.  

for(int i = 1; i <= 9; i++){
    System.out.println(i + " squared is: " + i * i);
}
```
Expressions can also be used within the for loop

```
//prints the first half of a String

String school = "Omaha Central";
for(int i = 0; i < school.length() / 2; i++) {
    System.out.println(school[i]); 
}

>>>O
>>>m
>>>a
>>>h
>>>a
>>>
>>>C

```

## Nested For Loops
Nest loop: a loop placed inside another loop.  The following loop would print out a 5 x 10 grid of stars.  

```
	for (int i = 1; i <= 5; i++) {
	    for (int j = 1; j <= 10; j++) {
	        System.out.print("*");
	    }
	    System.out.println();   // to end the line
	}
    
    Output: 
 **********  
 **********  
 **********  
 **********  
 ********** 
```
 
 
 
:pushin: note that the outer loop determines the number of rows (5) and the inner loop determines the number of columns (10)d
We also need to include that System.out.prinln() outside the inner loop so that we a new line can be created for each row.  

## Adding Complexity to Nested For Loops

To print figures like this: 

```
....1  
...2  
..3  
.4  
5  
```

We need to consider any patterns that we see. 
- The number of dots on each line is related to the line number.
- The number on each line is the row number.  

Since the outer loops determines the number of rows there are: 
```
for(int line = 1; line <= 5; line++) {
    // columns go here
}
```
The inner loop is a bit more difficult.  The pattern of dots is:

| line | number to print |
|-------|-----------------|
| 1     | 4               |            
| 2     | 3               |            
| 3     | 2               |            
| 4     | 1               |            
| 5     | 0               |    

In order to print the number of dots correctly, we need to use value of the outer loop to calculate it since the inner value is dependent on which row we are in.  
Think algebraically.  What would be the function that represents this table of values?  Input -> Output.  

`5 - line` would be the expression to represent the number of dots.  Thus:

```
    for(int line = 1; line <= 5; line++) {
        for(int j = 1; j <= 5 - line; j++){
            System.out.print(".");
        } 
        System.out.println(line); 
    }
```

## Exercises:

1.  How would you adjust the code above to print out the following? 
```
....1
...22
..333
.4444
55555

```

2.  How would you adjust the original code to print out the following? 

```
....1
...2.
..3..
.4...
5....

```

3. Create a program that draws a 8 x 4 box made up of stars.  

```
********
*      *
*      *
********

```
Then adjust the program to fit any height and width.  
You can initialize variables at the beginning of your program
`int height, width;`


4. (if time) Create a scalable figure like the following: 

```
Size 5: 
+/\/\/\/\/\/\/\/\/\/\+
|                    |
|                    |
|                    |	
|                    |
|                    |
+/\/\/\/\/\/\/\/\/\/\+

Size 2:
+/\/\/\/\+
|        |
|        |	
+/\/\/\/\+

Size 1: 

+/\/\+
|    |	
+/\/\+


```
