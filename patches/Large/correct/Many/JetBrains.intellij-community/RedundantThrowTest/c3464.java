diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/RedundantThrowTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/RedundantThrowTest.java
index c7ac979..ac06387 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/RedundantThrowTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/RedundantThrowTest.java
@@ -31,10 +31,10 @@
 
   public void testEntryPoint() throws Exception {
     final RedundantThrows tool = new RedundantThrows();
-    doTest("redundantThrow/" + getTestName(false), tool, false, true);
+    doTest("redundantThrow/" + getTestName(true), tool, false, true);
   }
 
-  public void testInherited() throws Exception {
+  public void testinherited() throws Exception {
     doTest();
   }
 }
