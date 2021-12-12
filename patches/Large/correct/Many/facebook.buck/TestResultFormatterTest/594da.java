diff --git a/test/com/facebook/buck/event/listener/TestResultFormatterTest.java b/test/com/facebook/buck/event/listener/TestResultFormatterTest.java
index 83fe83b..68ce21d 100644
--- a/test/com/facebook/buck/event/listener/TestResultFormatterTest.java
+++ b/test/com/facebook/buck/event/listener/TestResultFormatterTest.java
@@ -43,7 +43,7 @@
   @Before
   public void createFormatter() {
     formatter = new TestResultFormatter(
-        new Ansi(true),
+        new Ansi(false),
         /* isAnAssumptionViolationAnError) */ false);
   }
 
