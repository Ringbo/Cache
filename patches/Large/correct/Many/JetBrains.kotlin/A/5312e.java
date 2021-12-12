diff --git a/idea/testData/codeInsight/overrideImplement/overrideJavaMethod/foo/A.java b/idea/testData/codeInsight/overrideImplement/overrideJavaMethod/foo/A.java
index fdd6435..ade0d22 100644
--- a/idea/testData/codeInsight/overrideImplement/overrideJavaMethod/foo/A.java
+++ b/idea/testData/codeInsight/overrideImplement/overrideJavaMethod/foo/A.java
@@ -17,7 +17,7 @@
 package foo;
 
 class A {
-    int getAnswer(String[] array, int number, Object value) {
+    public int getAnswer(String[] array, int number, Object value) {
         return 42;
     }
 }
