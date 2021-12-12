diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java
index 740fffa..ada53e0 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java
@@ -210,7 +210,7 @@
          globalDisplay_.showYesNoMessage(GlobalDisplay.MSG_QUESTION,
                "Close " + visibleTerminal.getTitle(),
                "Are you sure you want to exit the terminal named \"" +
-               visibleTerminal.getTitle() + "\"? Any running jobs will be terminated.",
+               visibleTerminal.getCaption() + "\"? Any running jobs will be terminated.",
                false,
                new Operation()
                {
