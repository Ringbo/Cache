diff --git a/graal/com.oracle.graal.printer/src/com/oracle/graal/printer/CompilationPrinter.java b/graal/com.oracle.graal.printer/src/com/oracle/graal/printer/CompilationPrinter.java
index 1f80a05..b87ed22 100644
--- a/graal/com.oracle.graal.printer/src/com/oracle/graal/printer/CompilationPrinter.java
+++ b/graal/com.oracle.graal.printer/src/com/oracle/graal/printer/CompilationPrinter.java
@@ -183,7 +183,7 @@
     }
 
     public void printMachineCode(String code, String label) {
-        if (code.length() == 0) {
+        if (code == null || code.length() == 0) {
             return;
         }
         if (label != null) {
