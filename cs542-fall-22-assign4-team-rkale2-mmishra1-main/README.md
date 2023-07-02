# cs542-fall-22-assign4-team-rkale2-mmishra1

Group Members:
Mohi Mishra
Ritika Kale

-----------------------------------------------------------------------
-----------------------------------------------------------------------

Number of SlackDays Used in this Assignment: 3
Number of SlackDays remaining: 0

-----------------------------------------------------------------------

Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: 
```
ant -buildfile visitorArray/src/build.xml clean
```
Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: 
```
ant -buildfile visitorArray/src/build.xml all
```
Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: 
```
ant -buildfile visitorArray/src/build.xml run -Darg0=<input1.txt> -Darg1=<input2.txt> -Darg3=<output1.txt> -Darg1=<output2.txt> -Darg4=<DEBUG_VALUE> -Darg5=<Kth_Value>
```

## you can run it in the following manner:
####command:
```
ant -buildfile visitorArray/src/build.xml run -Darg0=input1.txt -Darg1=input2.txt -Darg2=output1.txt -Darg3=output2.txt -Darg4=3 -Darg5=3
```
Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:


## Choice of Data Structure: 
Used HashMap for finding kfrequentWords as Hashmap allows insertion of key value pair. Also used iterator as it is an object that manages the iteration through a data structure efficiently.


## Description of Design:
Used Programming to an Interface and not Implementation principle.
Having implemented Visitor Pattern gives the idea how to add new operations to existing object structures without modifying the structures. Strategy Pattern for implementing two different strategies.

Sample Output: Generated according to my specific choices.
```
Output1:
Most-freq-word: the 
2 Most-freq-word: was 
3 Most-freq-word: is 

Output2:
-------STRATEGY1: CASE- SENSITIVE------
 The flats can never be too many cherries on an ice cream sundae.
 The elephant didn't want to talk about the person in the room.
 Nory was a foodie because her mother was a foodie.
 I will get djinns that can outdjinn them.
 Almost nothing was more annoying than having our wasted time wasted on something not worth wasting it on.
 There are some things that are so unforgivable that they make other things easily forgivable.
 She was young the way an actual young person is young.
 No heart is so hard as the timid heart.
 The mind is what the mind is fed.
 Over and over again there were commotions created in the office.
 Time after time there are promotions in my company.
 It makes me happy to see others happy and cheerful.
 She wore a black dress because black is her happy color.
 Death brings the death of a life.
 The names of the trainees are the same names that have been selected for the new job post.
 Peter Piper picked a peck of pickled peppers.
 Susie suddenly whistled to call the cats to supper.
 But these dark times are just like those dark times.
 We forget all too soon the things we thought we could never forget.
 The apartment was on the top floor.

-------STRATEGY2: CASE-INSENSITIVE------
 The flats can never be too many cherries on an ice cream sundae.
 The elephant didn't want to talk about the person in the room.
 Nory was a foodie because her mother was a foodie.
 I will get djinns that can outdjinn them.
 Almost nothing was more annoying than having our wasted time wasted on something not worth wasting it on.
 There are some things that are so unforgivable that they make other things easily forgivable.
 She was young the way an actual young person is young.
 No heart is so hard as the timid heart.
 The mind is what the mind is fed.
 Over and over again there were commotions created in the office.
 Time after time there are promotions in my company.
 It makes me happy to see others happy and cheerful.
 She wore a black dress because black is her happy color.
 Death brings the death of a life.
 The names of the trainees are the same names that have been selected for the new job post.
 Peter Piper picked a peck of pickled peppers.
 Susie suddenly whistled to call the cats to supper.
 But these dark times are just like those dark times.
 We forget all too soon the things we thought we could never forget.
 The apartment was on the top floor.


```
-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to anyone else. I understand that if I am involved in plagiarism or cheating I will have to sign an official form that I have cheated and that this form will be stored in my official university record. I also understand that I will receive a grade of 0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense.
"Mohi Mishra"
"Ritika Kale"
Date: 11/17/2022
