diff --git a/DesktopExport/src/org/gephi/desktop/io/export/api/VectorialFileExporterUI.java b/DesktopExport/src/org/gephi/desktop/io/export/api/VectorialFileExporterUI.java
index ed37f48..493697b 100644
--- a/DesktopExport/src/org/gephi/desktop/io/export/api/VectorialFileExporterUI.java
+++ b/DesktopExport/src/org/gephi/desktop/io/export/api/VectorialFileExporterUI.java
@@ -147,7 +147,7 @@
                 }
 
                 //Selected file extension change
-                if (selectedFile != null) {
+                if (selectedFile != null && fileFilter != null) {
                     String filePath = selectedFile.getAbsolutePath();
                     filePath = filePath.substring(0, filePath.lastIndexOf("."));
                     filePath = filePath.concat(fileFilter.getExtensions().get(0));
