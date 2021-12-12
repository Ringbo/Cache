diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/EqualsAndHashCodeTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/EqualsAndHashCodeTest.java
index 405ba90..935d90e 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/EqualsAndHashCodeTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/EqualsAndHashCodeTest.java
@@ -34,7 +34,7 @@
   }
 
   private void doTest() throws Exception {
-    doTest("equalsAndHashcode/" + getTestName(false), myTool);
+    doTest("equalsAndHashcode/" + getTestName(true), myTool);
   }
 
 
