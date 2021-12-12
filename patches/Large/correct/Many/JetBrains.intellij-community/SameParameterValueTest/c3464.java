diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/SameParameterValueTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/SameParameterValueTest.java
index 7687b00..9f1890a 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/SameParameterValueTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/SameParameterValueTest.java
@@ -13,7 +13,7 @@
   }
 
   private String getTestDir() {
-    return "sameParameterValue/" + getTestName(false);
+    return "sameParameterValue/" + getTestName(true);
   }
 
   public void testEntryPoint() throws Exception {
