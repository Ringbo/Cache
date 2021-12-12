diff --git a/java/java-tests/testData/inspection/dataFlow/compileTimeConst/src/Test.java b/java/java-tests/testData/inspection/dataFlow/compileTimeConst/src/Test.java
index 0e9c03b..0d302a7 100644
--- a/java/java-tests/testData/inspection/dataFlow/compileTimeConst/src/Test.java
+++ b/java/java-tests/testData/inspection/dataFlow/compileTimeConst/src/Test.java
@@ -3,7 +3,7 @@
 
     public void foo(boolean param) {
         boolean b = CONST || param;
-        if (CONST) {
+        if (b) {
         }
     }
 }
