diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/Source.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/Source.java
index 831640c..f2bfd34 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/Source.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/Source.java
@@ -772,7 +772,8 @@
          }
       };
 
-      if (event.getFile().getLength() < 0)
+      // Warning: event.getFile() can be null (e.g. new Sweave document)
+      if (event.getFile() != null && event.getFile().getLength() < 0)
       {
          // If the file has no size info, stat the file from the server. This
          // is to prevent us from opening large files accidentally.
