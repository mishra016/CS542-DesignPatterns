CSx42: Assignment1
Mohi Mishra
Note: build.xml is present in studentCoursesBackup/src folder.
________________________________________
Instruction to clean:
####Command: 
```
ant -buildfile studentCoursesBackup/src/build.xml clean
```
Description: It cleans up all the .class files that were generated when you compiled your code.
________________________________________
Instruction to compile:
####Command: 
```
ant -buildfile studentCoursesBackup/src/build.xml all
```
Description: Compiles your code and generates .class files inside the BUILD folder.
________________________________________
Instruction to run:
####Command: 
```
ant -buildfile studentCoursesBackup/src/build.xml run -Darg0=courseInfo.txt -Darg1=coursePrefs.txt -Darg2=outPutFile.txt -Darg3=courseConflict.txt -Darg4=scheduleConflict.txt
```
________________________________________
Description:
The project demands to develop a Course Allocator system to assign courses to students on bases of their preference.

Files used: 
Main.java: program which calls other classes.
CourseInfo.java: It keeps the track to names, capacity & schedule of all 9 courses.
StudentInfo.java: It keeps track of the student Id & preferences of 50 students.
FileProcessor.java: It keeps a track of reading both courseInfo.txt and coursePrefs.txt and function to assign the three preferences according to capacity and schedule restrictions.
InputRead.java: This program keeps the track to all the information read from the courseInfo.txt and coursePrefs.txt. 
ResultWrite.java: It keeps the track of function to write conflicts generated in capacity and schedule to the text file.

Note: Was not able to design the solution to Interface and generate the satisfaction score.

Approach:
•	Used the Scanner object to iterate through each line of the courseInfo.txt and coursePrefs.txt 
file, removed the delimiters and stored that information into two different ArrayLists.
•	Used ArrayList for storing the information because it is a dynamic data structure which gives user the flexibility of adding or removing elements anytime. It also implements lists Interface so we can use all the methods of list with it
•	After reading and storing all the information we started assigning the courses according to preference on the basis of FCFS.
•	Used nested for loop for iterating through each student’s all 9 preferences and used if conditional checks for the capacity, schedule, seats availability in the desired course and if the student has been enrolled in 3 courses.
•	With every assignment the capacity is decremented by 1.
•	Then added those three assigned courses to the preference array list.
•	Finally iterated through that preference list to added it to new assigned list and added the information into the outPutFile.

Sample Output:
```
[101:[H, A, F], 102:[D, G, B], 103:[I, A, B], 104:[A, H, C], 105:[B, F, A], 106:[C, A, H], 107:[H, A, G], 108:[B, F, C], 109:[E, B, I], 110:[H, C, D], 111:[G, B, A], 112:[A, E, H], 113:[E, D, H], 114:[D, C, A], 115:[H, E, D], 116:[D, H, G], 117:[A, D, C], 118:[E, F, I], 119:[E, A, F], 120:[F, G, H], 121:[C, E, H], 122:[B, I, E], 123:[A, G, F], 124:[B, A, G], 125:[F, D, G], 126:[E, F, A], 127:[H, F, E], 128:[G, C, H], 129:[G, E, D], 130:[A, E, B], 131:[F, E, D], 132:[C, D, E], 133:[E, H, G], 134:[C, A, I], 135:[H, F, G], 136:[F, D, A], 137:[D, G, C], 138:[I, A, C], 139:[A, E, C], 140:[D, H, C], 141:[A, I, H], 142:[D, B, I], 143:[B, F, D], 144:[I, B, F], 145:[I, E, C], 146:[H, D, F], 147:[I, D, H], 148:[B, E, G], 149:[F, E, H], 150:[I, E, C]]
```
________________________________________
Academic Honesty statement:
________________________________________
"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to anyone else. I understand that if I am involved in plagiarism or cheating, I will have to sign an official form that I have cheated and that this form will be stored in my official university record. I also understand that I will receive a grade of 0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense.
"Mohi Mishra"
Date: 09/29/2022


