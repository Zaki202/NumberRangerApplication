### How to run Application

## Compile (after every change)
javac -d .  NumberRanger/*.java

## Run (after compilation)
java -cp . NumberRanger.Main 

## Compile test
javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" Test/*.java

## Run test
java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Test.NumberRangeSummarizerImplTest 
