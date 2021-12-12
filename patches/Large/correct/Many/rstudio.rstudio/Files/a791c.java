diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/files/Files.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/files/Files.java
index c8ec7d5..164372c 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/files/Files.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/files/Files.java
@@ -397,7 +397,7 @@
             
             server_.copyFile(selectedFiles.get(0),
                  targetFile,
-                 false,
+                 true,
                  new VoidServerRequestCallback(progress) {
                      @Override
                      protected void onSuccess()
