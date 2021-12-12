diff --git a/src/functions/org/apache/jmeter/functions/StringFromFile.java b/src/functions/org/apache/jmeter/functions/StringFromFile.java
index cc141b8..6a89e68 100644
--- a/src/functions/org/apache/jmeter/functions/StringFromFile.java
+++ b/src/functions/org/apache/jmeter/functions/StringFromFile.java
@@ -91,11 +91,13 @@
     // @GuardedBy("this")
     private Object[] values;
 
+    // @GuardedBy("this")
     private BufferedReader myBread = null; // Buffered reader
 
     // @GuardedBy("this")
     private boolean firstTime = false; // should we try to open the file?
 
+    // @GuardedBy("this")
     private String fileName; // needed for error messages
 
     // @GuardedBy("this")
@@ -116,7 +118,7 @@
     /**
      * Close file and log
      */
-    private void closeFile() {
+    private synchronized void closeFile() {
         if (myBread == null) {
             return;
         }
