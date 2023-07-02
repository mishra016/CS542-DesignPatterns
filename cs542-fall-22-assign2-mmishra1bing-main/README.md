# cs542-fall-22-assign2
Mohi Mishra
Note: build.xml is present in studentRecordsBackupTree/src folder.
________________________________________
Number of SlackDays used in this Assignment:
0
________________________________________
Instruction to clean:
####Command: 
```
ant -buildfile studentRecordsBackupTree/src/build.xml clean
```
Description: It cleans up all the .class files that were generated when you compiled your code.
________________________________________
Instruction to compile:
####Command: 
```
ant -buildfile studentRecordsBackupTree/src/build.xml all
```
Description: Compiles your code and generates .class files inside the BUILD folder.
________________________________________
Instruction to run:
####Command: 
```
ant -buildfile studentRecordsBackupTree/src/build.xml run -Darg0=bstInput.txt -Darg1=bstOutput.txt -Darg2=errorLog.txt -Darg3=2 -Darg4=1
```
________________________________________

Problem Statement: The project demands to Apply the design principles we have learned so far to develop and test code for Backup System for Student Record.

Files used: 
* Driver.java: Displays Inorder traversal, sum and sum after increment for the main Tree, backup-1 and backup-2 tree. 
* BST.java: It keeps the track of the methods such as insert(), inorder(), update() and addBST(). 
* Node.java: It keeps track of the B-Number and Description and further implements SubjectI and ObserverI . 
* SubjectInterface: It keeps track of the methods of registering, unregistering and notifying the observers.
* ObsereverInterface: It keeps track of the method of updating the observers of the change in nodes.
* FileProcessor.java: It keeps track of reading bstInput.txt file and inserting the data in the tree.

Choice of Data Structure:
* Chose Binary Search Tree(BST) to directly insert the input data as BST is efficient in the insertion process with the time complexity of O(log N) for a balanced tree scenario.
* Also used Arraylist of Nodes to store my observers because it is a dynamic data structure which gives user the flexibility of adding or removing elements anytime. It also implements lists Interface so we can use all the methods of list with it.

Description of Design:
* ObserverPattern: One-to-many dependency between objects so that when sub object changes, all the observer objects are notified and updated automatically.
* One-to-many relation between the main BST node(subject) -> backup-1(observer) and backup-2(observer) nodes.

Output:
* Output will get generated as required for this assignment.

________________________________________

Academic Honesty statement:

"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to anyone else. I understand that if I am involved in plagiarism or cheating, I will have to sign an official form that I have cheated and that this form will be stored in my official university record. I also understand that I will receive a grade of 0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense. "Mohi Mishra" Date: 10/222/2022
