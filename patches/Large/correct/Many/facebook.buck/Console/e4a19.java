diff --git a/src/com/facebook/buck/util/Console.java b/src/com/facebook/buck/util/Console.java
index 7ce4109..98ec619 100644
--- a/src/com/facebook/buck/util/Console.java
+++ b/src/com/facebook/buck/util/Console.java
@@ -69,7 +69,7 @@
    * Prints an error message to stderr that will be highlighted in red if stderr is a tty.
    */
   public void printErrorText(String message) {
-    stdErr.print(ansi.asErrorText(message));
+    stdErr.println(ansi.asErrorText(message));
   }
 
   /**
