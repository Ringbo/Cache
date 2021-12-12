diff --git a/src/main/org/testng/TestNGAntTask.java b/src/main/org/testng/TestNGAntTask.java
index b0669a0..7a15272 100644
--- a/src/main/org/testng/TestNGAntTask.java
+++ b/src/main/org/testng/TestNGAntTask.java
@@ -951,7 +951,7 @@
    *
    */
   private static String doubleQuote(String pCommandLineArg) {
-    if(pCommandLineArg.indexOf(" ") != -1) {
+    if(pCommandLineArg.indexOf(" ") != -1 && !(pCommandLineArg.startsWith("\"") && pCommandLineArg.endsWith("\""))) {
       return "\"" + pCommandLineArg + "\"";
     }
 
