diff --git a/app/PdeCompiler.java b/app/PdeCompiler.java
index eedf3d6..efc9316 100644
--- a/app/PdeCompiler.java
+++ b/app/PdeCompiler.java
@@ -183,8 +183,9 @@
    * and line number, which is then reported back to PdeEditor.
    */
   public void message(String s) {
-    //System.err.println("MSG: " + s);
-    System.err.print(s);
+    // This receives messages as full lines, so a newline needs 
+    // to be added as they're printed to the console.
+    System.err.println(s);
 
     // ignore cautions
     if (s.indexOf("Caution") != -1) return;
