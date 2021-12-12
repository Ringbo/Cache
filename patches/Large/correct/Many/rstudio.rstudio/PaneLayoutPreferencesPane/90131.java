diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/PaneLayoutPreferencesPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/PaneLayoutPreferencesPane.java
index 5309690..1e0c610 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/PaneLayoutPreferencesPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/PaneLayoutPreferencesPane.java
@@ -173,7 +173,7 @@
       }
 
       PaneConfig value = uiPrefs.paneConfig().getValue();
-      if (value == null || value.isValid())
+      if (value == null || !value.isValid())
          uiPrefs.paneConfig().setValue(PaneConfig.createDefault());
 
       JsArrayString origPanes = uiPrefs.paneConfig().getValue().getPanes();
