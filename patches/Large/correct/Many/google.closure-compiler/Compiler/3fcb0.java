diff --git a/src/com/google/javascript/jscomp/Compiler.java b/src/com/google/javascript/jscomp/Compiler.java
index b226f86..0db8a9a 100644
--- a/src/com/google/javascript/jscomp/Compiler.java
+++ b/src/com/google/javascript/jscomp/Compiler.java
@@ -2799,7 +2799,7 @@
    * Report an internal error.
    */
   @Override
-  void throwInternalError(String message, Exception cause) {
+  void throwInternalError(String message, Throwable cause) {
     String finalMessage = "INTERNAL COMPILER ERROR.\nPlease report this problem.\n\n" + message;
 
     RuntimeException e = new RuntimeException(finalMessage, cause);
