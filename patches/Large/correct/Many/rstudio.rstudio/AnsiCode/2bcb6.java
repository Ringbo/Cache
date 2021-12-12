diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/AnsiCode.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/AnsiCode.java
index 952756f..fe138ee 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/AnsiCode.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/AnsiCode.java
@@ -354,7 +354,7 @@
          }
          else if (codeVal == HIDDEN_OFF)
          {
-            clazzes_.remove(HIDDEN_OFF);
+            clazzes_.remove(HIDDEN_STYLE);
          }
          else if (codeVal == STRIKETHROUGH)
          {
