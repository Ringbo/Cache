diff --git a/java/java-tests/testData/inspection/deadCode/localVariables/src/A.java b/java/java-tests/testData/inspection/deadCode/localVariables/src/A.java
index f803ed7..11b77fe 100644
--- a/java/java-tests/testData/inspection/deadCode/localVariables/src/A.java
+++ b/java/java-tests/testData/inspection/deadCode/localVariables/src/A.java
@@ -1,7 +1,7 @@
 class A {
   public static void main(String[] args) {
     int i = 0;
-    @SuppressWarning("unused") int j = 0;
+    @SuppressWarnings("unused") int j = 0;
   }
 }
 
