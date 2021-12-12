diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceWindow.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceWindow.java
index d8e3a3c..98ba7ec 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceWindow.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceWindow.java
@@ -62,7 +62,7 @@
       
       // this class is for satellite source windows only; if an instance gets
       // created in the main window, don't hook up any of its behaviors
-      if (satellite.isCurrentWindowSatellite())
+      if (!satellite.isCurrentWindowSatellite())
          return;
       
       // add event handlers
