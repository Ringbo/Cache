diff --git a/java/java-tests/testSrc/com/intellij/refactoring/inline/InlineLocalTest.java b/java/java-tests/testSrc/com/intellij/refactoring/inline/InlineLocalTest.java
index 7c7b398..6650bb7 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/inline/InlineLocalTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/inline/InlineLocalTest.java
@@ -156,7 +156,7 @@
   }
 
   public void testArrayMethodCallInitialized() throws Exception {
-    doTest(true);
+    doTest(false);
   }
 
   public void testArrayIndex() throws Exception {
