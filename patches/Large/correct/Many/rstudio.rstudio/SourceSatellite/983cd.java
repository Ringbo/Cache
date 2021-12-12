diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceSatellite.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceSatellite.java
index 1aad3bb..181ed90 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceSatellite.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/SourceSatellite.java
@@ -38,7 +38,7 @@
    }
 
    @Inject
-   public void initialize(ChunkSatelliteView view,
+   public void initialize(SourceSatelliteView view,
                           Satellite satellite,
                           Provider<AceThemes> pAceThemes,
                           ApplicationUncaughtExceptionHandler exHandler)
