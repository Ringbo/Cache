diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java
index 8e26012..8be36c3 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java
@@ -39,6 +39,6 @@
   }
 
   public void testEntryPointUnusedParameter() throws Exception {
-    doTest("unusedMethodParameter/" + getTestName(false), myTool, true, true);
+    doTest("unusedMethodParameter/" + getTestName(true), myTool, true, true);
   }
 }
