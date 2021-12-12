diff --git a/src/functions/org/apache/jmeter/functions/StringFromFile.java b/src/functions/org/apache/jmeter/functions/StringFromFile.java
index deb23c0..8b1fb6b 100644
--- a/src/functions/org/apache/jmeter/functions/StringFromFile.java
+++ b/src/functions/org/apache/jmeter/functions/StringFromFile.java
@@ -136,7 +136,7 @@
         }
     }
     
-    private void openFile() {
+    private synchronized void openFile() {
         String tn = Thread.currentThread().getName();
         fileName = ((CompoundVariable) values[0]).execute();
 
