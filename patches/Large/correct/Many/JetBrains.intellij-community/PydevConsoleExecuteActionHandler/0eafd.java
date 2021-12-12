diff --git a/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java b/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java
index c8c946e..b928f13 100644
--- a/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java
+++ b/python/src/com/jetbrains/python/console/PydevConsoleExecuteActionHandler.java
@@ -149,7 +149,7 @@
           myInputBuffer = null;
           // Handle prompt
           if (interpreterResponse.need_input) {
-            if (!PyConsoleUtil.INPUT_PROMPT.equals(console.getPrompt())) {
+            if (!PyConsoleUtil.INPUT_PROMPT.equals(console.getPrompt()) && !PyConsoleUtil.HELP_PROMPT.equals(console.getPrompt())) {
               console.setPrompt(PyConsoleUtil.INPUT_PROMPT);
               PyConsoleUtil.scrollDown(currentEditor);
             }
@@ -205,7 +205,7 @@
     }
   }
 
-  public String getPrevCommandRunningMessage() {
+  public static String getPrevCommandRunningMessage() {
     return "Previous command is still running. Please wait or press Ctrl+C to interrupt.";
   }
 
