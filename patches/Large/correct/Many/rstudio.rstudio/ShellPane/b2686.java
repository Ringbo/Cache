diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/ShellPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/ShellPane.java
index 7db12bb..effc750 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/ShellPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/ShellPane.java
@@ -132,7 +132,7 @@
 
    public void consoleWriteInput(String input)
    {
-      output(input, styles_.input() + KEYWORD_CLASS_NAME, false);
+      output(input, styles_.command() + KEYWORD_CLASS_NAME, false);
       scrollToBottomAsync();
    }
 
