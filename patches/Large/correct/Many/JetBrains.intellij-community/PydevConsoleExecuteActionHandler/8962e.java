diff --git a/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java b/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java
index 20e8655..7721db2 100644
--- a/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java
+++ b/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java
@@ -67,10 +67,10 @@
 
   @Override
   public void processLine(final String text) {
-    processLine(text, true);
+    processLine(text, false);
   }
 
-  public void processLine(final String text, boolean execAnyway) {
+  public void processLine(@NotNull final String text, boolean execAnyway) {
     int indentBefore = myCurrentIndentSize;
     if (text.isEmpty()) {
       processOneLine(text);
