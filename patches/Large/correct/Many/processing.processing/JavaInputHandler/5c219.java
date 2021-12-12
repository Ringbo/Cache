diff --git a/java/src/processing/mode/java/JavaInputHandler.java b/java/src/processing/mode/java/JavaInputHandler.java
index 9e3ae59..0c02a44 100644
--- a/java/src/processing/mode/java/JavaInputHandler.java
+++ b/java/src/processing/mode/java/JavaInputHandler.java
@@ -164,7 +164,7 @@
         event.consume();
       }
 
-    } else if (c == 10 || c == 13) {  // auto-indent
+    } else if (code == 10 || code == 13) {  // auto-indent
       if (Preferences.getBoolean("editor.indent")) {
         char contents[] = textarea.getText().toCharArray();
         int tabSize = Preferences.getInteger("editor.tabs.size");
