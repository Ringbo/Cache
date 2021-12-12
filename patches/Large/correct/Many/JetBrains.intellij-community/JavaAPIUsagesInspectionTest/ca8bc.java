diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/JavaAPIUsagesInspectionTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/JavaAPIUsagesInspectionTest.java
index 37d10d4..3bd0411 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/JavaAPIUsagesInspectionTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/JavaAPIUsagesInspectionTest.java
@@ -16,7 +16,7 @@
   }
 
   private void doTest() throws Exception {
-    doTest("usage1.5/" + getTestName(false), new LocalInspectionToolWrapper(new Java15APIUsageInspection()), "java 1.5");
+    doTest("usage1.5/" + getTestName(true), new LocalInspectionToolWrapper(new Java15APIUsageInspection()), "java 1.5");
   }
 
   public void testConstructor() throws Exception {
