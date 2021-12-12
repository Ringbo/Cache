diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/GeneralPreferencesPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/GeneralPreferencesPane.java
index 9db12f0..6d35aca 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/GeneralPreferencesPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/views/GeneralPreferencesPane.java
@@ -132,7 +132,8 @@
                  "never"
             },
             false,
-            true);
+            true,
+            false);
       if (session_.getSessionInfo().getShowUserHomePage())
       {
          spaced(showServerHomePage_);
