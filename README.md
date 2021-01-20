# HigherAverageAttendanceTask

The school cricket team wants to calculate the average attendance at their 8 home games in the season, the attendance should be displayed without a decimal value even if it is .0 as that is how they collect the data and dont want to imagine half a fan!

This program makes use of casting to change between data types, you can change between types as long as the value would be a valid value for both types. 

**example of uses**

double averageWage = 12.75;

int averageRounded = (int) Math.round(averageWage); //rounds like maths so 13 is stored\
int averageDown = (int) Math.floor(averageWage); // forces a round down so 12 is stored\
int averageUp = (int) Math.ceil(averageWage); //force round up so 13 is stored

// each of the above examples converts the real number to an integer removing the decimal point from displaying

double fraction = 3/4; //as both 3 and 4 are integer values this will store 0.0 we need to change before division\
fraction = (double) 3/4; // will store the expected 0.75  

// this can lead to errors in programs as unexpected answers are calculated

## Your Task

Write the Java in Main.java to calculate the average of the 8 attendances

## The Algorithm Design

**Step 1:** set total initially to 0\
**Step 2:**	Start a fixed loop for 8 atttendances\
**Step 3:**	  ask user for attendance\
**Step 4:**	  add value of attendance to total\
**Step 5:**	End ixed loop\
**Step 6:**	Round average and convert to integer\
**Step 7:** display the "Average cricket attendance is " concantenated with the calue of the average and followed by " this year"

Test your program and submitt through a version control commit!

