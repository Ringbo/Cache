diff --git a/DesktopImport/src/org/gephi/desktop/importer/DesktopImportController.java b/DesktopImport/src/org/gephi/desktop/importer/DesktopImportController.java
index 28d3b0e..fbbb070 100644
--- a/DesktopImport/src/org/gephi/desktop/importer/DesktopImportController.java
+++ b/DesktopImport/src/org/gephi/desktop/importer/DesktopImportController.java
@@ -494,7 +494,7 @@
                 return true;
             }
         }
-        if (fileObject.hasExt("zip")) {
+        if (fileObject.hasExt("zip") || fileObject.hasExt("ZIP")) {
             return true;
         }
         return false;
