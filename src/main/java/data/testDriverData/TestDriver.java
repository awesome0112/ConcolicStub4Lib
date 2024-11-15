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
public static int testStub(int x, int y, int max_call_1)
{
mark("int max=0;\n", false, false);
int max=0;
if (((max_call_1 == x) && mark("max_call_1 == x", true, false)) || mark("max_call_1 == x", false, true))
{
{
mark("max=x;\n", false, false);
max=x;
}
}
else {
{
mark("max=y;\n", false, false);
max=y;
}
}
mark("return max;\n", false, false);
return max;
}

public static void main(String[] args) {
writeDataToFile("", "src/main/java/data/testDriverData/runTestDriverData.txt", false);
long startRunTestTime = System.nanoTime();
Object output = testStub(0, 1, 1);
long endRunTestTime = System.nanoTime();
double runTestDuration = (endRunTestTime - startRunTestTime) / 1000000.0;
writeDataToFile(runTestDuration + "===" + output, "src/main/java/data/testDriverData/runTestDriverData.txt", true);
}
}