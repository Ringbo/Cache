diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/DefaultFileTemplateInspectionTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/DefaultFileTemplateInspectionTest.java
index 5acf76e..3365055 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/DefaultFileTemplateInspectionTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/DefaultFileTemplateInspectionTest.java
@@ -11,7 +11,7 @@
   }
 
   private void doTest() throws Exception {
-    doTest("defaultFileTemplateUsage/" + getTestName(false), new DefaultFileTemplateUsageInspection());
+    doTest("defaultFileTemplateUsage/" + getTestName(true), new DefaultFileTemplateUsageInspection());
   }
 
   public void testDefaultFile() throws Exception{
