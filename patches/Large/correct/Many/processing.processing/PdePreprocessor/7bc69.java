diff --git a/app/PdePreprocessor.java b/app/PdePreprocessor.java
index 76d5c9c..4a82ff9 100644
--- a/app/PdePreprocessor.java
+++ b/app/PdePreprocessor.java
@@ -81,7 +81,8 @@
                       String extraImports[]) throws java.lang.Exception {
     // if the program ends with no CR or LF an OutOfMemoryError will happen.
     // not gonna track down the bug now, so here's a hack for it:
-    if (program.charAt(program.length()-1) != '\n') {
+    if ((program.length() > 0) &&
+        program.charAt(program.length()-1) != '\n') {
       program += "\n";
     }
 
