diff --git a/python/src/com/jetbrains/python/console/PyConsoleHighlightingUtil.java b/python/src/com/jetbrains/python/console/PyConsoleHighlightingUtil.java
index 6367aa5..d9a4f84 100644
--- a/python/src/com/jetbrains/python/console/PyConsoleHighlightingUtil.java
+++ b/python/src/com/jetbrains/python/console/PyConsoleHighlightingUtil.java
@@ -64,7 +64,7 @@
     final TextAttributes attributes = TextAttributes.merge(type.getAttributes(), ConsoleHighlighter.OUT.getDefaultAttributes());
     ApplicationManager.getApplication().invokeLater(new Runnable() {
       public void run() {
-        console.printToHistory(string, attributes);
+        console.addToHistory(string, attributes);
       }
     }, ModalityState.stateForComponent(console.getComponent()));
   }
