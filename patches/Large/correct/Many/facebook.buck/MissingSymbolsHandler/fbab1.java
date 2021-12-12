diff --git a/src/com/facebook/buck/cli/MissingSymbolsHandler.java b/src/com/facebook/buck/cli/MissingSymbolsHandler.java
index 5088657..1aac785 100644
--- a/src/com/facebook/buck/cli/MissingSymbolsHandler.java
+++ b/src/com/facebook/buck/cli/MissingSymbolsHandler.java
@@ -221,6 +221,6 @@
   }
 
   private void print(String line) {
-    console.getStdOut().println(console.getAnsi().asWarningText(line));
+    console.getStdErr().println(console.getAnsi().asWarningText(line));
   }
 }
