# cs542-fall-22-assign3
## Name: Mohi Mishra

-----------------------------------------------------------------------
-----------------------------------------------------------------------

Number of SlackDays Used in this Assignment: 1
Number of SlackDays remaining:3

-----------------------------------------------------------------------

Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: 
```
ant -buildfile myCampusTour/src/build.xml clean
```
Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: 
```
ant -buildfile myCampusTour/src/build.xml all
```
Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<bstError.txt> -Darg1=<DEBUG_Value> 

## you can run it in the following manner:
```
ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=2
```
Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
The project demands to develop a program for Campus Tours at Binghamton University.
Note: This is an Error-free Design.

## Choice of Data Structure:
Used Arraylist to store my Cost, Time, Co2 and Efforts for each activity because it is a dynamic data structure which gives user the flexibility of adding or removing elements anytime. It also implements lists Interface so we can use all the methods of list with it.


## Description of Design:

Builder Pattern: When we want to have cntrol over how complex objects would be created at run-time.


Sample Output: Generated according to my specific choices.
```
-------------First CampusTour---------------
    Total Cost of Tour: $20.0
    Total Duration of Tour: 130 minutes
    Total CarbonFootPrints of Tour: 13500 tonnes
    Total Efforts of Tour: 15500 calories

-------------Second CampusTour---------------
    Total Cost of Tour: $19.0
    Total Duration of Tour: 80 minutes
    Total CarbonFootPrints of Tour: 14500 tonnes
    Total Efforts of Tour: 16800 calories
```
-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.
"Mohi Mishra"
Date: 11/17/2022



