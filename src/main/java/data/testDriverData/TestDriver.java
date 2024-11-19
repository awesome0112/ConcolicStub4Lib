package data.testDriverData;
import java.io.FileWriter;
public class TestDriver {
private static boolean mark(String statement, boolean isTrueCondition, boolean isFalseCondition) {
StringBuilder markResult = new StringBuilder();
markResult.append(statement).append("===");
markResult.append(isTrueCondition).append("===");
markResult.append(isFalseCondition).append("---end---");
writeDataToFile(markResult.toString(), "src/main/java/data/testDriverData/runTestDriverData.txt", true);
if (!isTrueCondition && !isFalseCondition) return true;
return !isFalseCondition;
}
private static void writeDataToFile(String data, String path, boolean append) {
try {
FileWriter writer = new FileWriter(path, append);
writer.write(data);
writer.close();
} catch(Exception e) {
e.printStackTrace();
}
}
public static int getNumberOfDays(int month, int year)
{
mark("int numOfDays=0;\n", false, false);
int numOfDays=0;
mark("int i=1", false, false);
for (int i=1; ((i <= month) && mark("i <= month", true, false)) || mark("i <= month", false, true); mark("i++", false, false),
i++) {
{
if (((i == 2) && mark("i == 2", true, false)) || mark("i == 2", false, true))
{
{
if (((isLeapYear(year)) && mark("isLeapYear(year)", true, false)) || mark("isLeapYear(year)", false, true))
{
{
mark("numOfDays+=29;\n", false, false);
numOfDays+=29;
}
}
else {
mark("numOfDays+=28;\n", false, false);
numOfDays+=28;
}
}
}
else {
if (((i <= 7) && mark("i <= 7", true, false)) || mark("i <= 7", false, true))
{
{
if (((i % 2 == 0) && mark("i % 2 == 0", true, false)) || mark("i % 2 == 0", false, true))
{
mark("numOfDays+=30;\n", false, false);
numOfDays+=30;
}
else {
mark("numOfDays+=31;\n", false, false);
numOfDays+=31;
}
}
}
else {
{
if (((i % 2 == 0) && mark("i % 2 == 0", true, false)) || mark("i % 2 == 0", false, true))
{
mark("numOfDays+=31;\n", false, false);
numOfDays+=31;
}
else {
mark("numOfDays+=30;\n", false, false);
numOfDays+=30;
}
}
}
}
}
}
mark("return numOfDays;\n", false, false);
return numOfDays;
}


public static boolean isLeapYear(int year){
  if (year % 4 == 0) {
    if (year % 100 == 0) {
      if (year % 400 == 0)       return true;
 else       return false;
    }
 else {
      return true;
    }
  }
  return false;
}
public static void main(String[] args) {
writeDataToFile("", "src/main/java/data/testDriverData/runTestDriverData.txt", false);
long startRunTestTime = System.nanoTime();
Object output = getNumberOfDays(8, 8);
long endRunTestTime = System.nanoTime();
double runTestDuration = (endRunTestTime - startRunTestTime) / 1000000.0;
writeDataToFile(runTestDuration + "===" + output, "src/main/java/data/testDriverData/runTestDriverData.txt", true);
}
}