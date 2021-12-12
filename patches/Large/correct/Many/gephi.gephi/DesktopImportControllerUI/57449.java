diff --git a/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java b/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java
index 70cf4d1..64fb1b6 100644
--- a/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java
+++ b/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java
@@ -175,7 +175,7 @@
             }
 
             //Execute task
-            final String containerSource = "Stream " + importer;
+            final String containerSource = "Stream " + importerName;
             executor.execute(task, new Runnable() {
 
                 public void run() {
@@ -234,7 +234,7 @@
             }
 
             //Execute task
-            final String containerSource = "Stream " + importer;
+            final String containerSource = "Stream " + importerName;
             executor.execute(task, new Runnable() {
 
                 public void run() {
