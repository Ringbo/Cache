diff --git a/Dart/testSrc/com/jetbrains/lang/dart/ide/moveCode/DartCodeMoverTest.java b/Dart/testSrc/com/jetbrains/lang/dart/ide/moveCode/DartCodeMoverTest.java
index ebbb98a..23114bf 100644
--- a/Dart/testSrc/com/jetbrains/lang/dart/ide/moveCode/DartCodeMoverTest.java
+++ b/Dart/testSrc/com/jetbrains/lang/dart/ide/moveCode/DartCodeMoverTest.java
@@ -7,7 +7,7 @@
 abstract public class DartCodeMoverTest extends DartCodeInsightFixtureTestCase {
 
   protected void doTest() {
-    final String testName = getTestName(true);
+    final String testName = getTestName(false);
     myFixture.configureByFile(testName + ".dart");
     myFixture.performEditorAction(IdeActions.ACTION_MOVE_STATEMENT_UP_ACTION);
     myFixture.checkResultByFile(testName + "_afterUp.dart", true);
