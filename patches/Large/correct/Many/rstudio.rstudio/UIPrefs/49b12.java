diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefs.java b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefs.java
index b5ecf38..e356c5c 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefs.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefs.java
@@ -181,7 +181,7 @@
          // Configure R Linter
          
          enableStyleDiagnostics().setGlobalValue(
-               newUiPrefs.enableBackgroundDiagnostics().getGlobalValue());
+               newUiPrefs.enableStyleDiagnostics().getGlobalValue());
          
          diagnosticsInRFunctionCalls().setGlobalValue(
                newUiPrefs.diagnosticsInRFunctionCalls().getGlobalValue());
