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
public static int checkTriangleType(double a, double b, double c, double max_call_1, double max_call_2, double min_call_3, double min_call_4, double pow_call_5, double pow_call_6, double pow_call_7)
{
if (((a + b <= c || a + c <= b || b + c <= a) && mark("a + b <= c || a + c <= b || b + c <= a", true, false)) || mark("a + b <= c || a + c <= b || b + c <= a", false, true))
{
{
mark("return -1;\n", false, false);
return -1;
}
}
if (((a == b && b == c) && mark("a == b && b == c", true, false)) || mark("a == b && b == c", false, true))
{
{
mark("return 3;\n", false, false);
return 3;
}
}
else {
if (((a == b || b == c || a == c) && mark("a == b || b == c || a == c", true, false)) || mark("a == b || b == c || a == c", false, true))
{
{
mark("return 2;\n", false, false);
return 2;
}
}
else {
{
mark("double maxBC=max_call_1;\n", false, false);
double maxBC=max_call_1;
mark("double hypotenuse=max_call_2;\n", false, false);
double hypotenuse=max_call_2;
mark("double minAB=min_call_3;\n", false, false);
double minAB=min_call_3;
mark("double side1=min_call_4;\n", false, false);
double side1=min_call_4;
mark("double side2=a + b + c - hypotenuse - side1;\n", false, false);
double side2=a + b + c - hypotenuse - side1;
mark("double hypotenuseSquared=pow_call_5;\n", false, false);
double hypotenuseSquared=pow_call_5;
mark("double side1Squared=pow_call_6;\n", false, false);
double side1Squared=pow_call_6;
mark("double side2Squared=pow_call_7;\n", false, false);
double side2Squared=pow_call_7;
if (((hypotenuseSquared - (side1Squared + side2Squared) < 0.0001) && mark("hypotenuseSquared - (side1Squared + side2Squared) < 0.0001", true, false)) || mark("hypotenuseSquared - (side1Squared + side2Squared) < 0.0001", false, true))
{
{
mark("return 1;\n", false, false);
return 1;
}
}
}
}
}
mark("return 0;\n", false, false);
return 0;
}

public static void main(String[] args) {
writeDataToFile("", "src/main/java/data/testDriverData/runTestDriverData.txt", false);
long startRunTestTime = System.nanoTime();
Object output = checkTriangleType(0.0, 0.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
long endRunTestTime = System.nanoTime();
double runTestDuration = (endRunTestTime - startRunTestTime) / 1000000.0;
writeDataToFile(runTestDuration + "===" + output, "src/main/java/data/testDriverData/runTestDriverData.txt", true);
}
}