diff --git a/DesktopExport/src/org/gephi/desktop/io/export/api/GraphFileExporterUI.java b/DesktopExport/src/org/gephi/desktop/io/export/api/GraphFileExporterUI.java
index c45c685..a8d30e6 100644
--- a/DesktopExport/src/org/gephi/desktop/io/export/api/GraphFileExporterUI.java
+++ b/DesktopExport/src/org/gephi/desktop/io/export/api/GraphFileExporterUI.java
@@ -153,7 +153,7 @@
                 }
 
                 //Selected file extension change
-                if (selectedFile != null) {
+                if (selectedFile != null && fileFilter != null) {
                     String filePath = selectedFile.getAbsolutePath();
                     filePath = filePath.substring(0, filePath.lastIndexOf("."));
                     filePath = filePath.concat(fileFilter.getExtensions().get(0));
