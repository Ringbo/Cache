diff --git a/src/core/org/apache/jmeter/gui/action/Save.java b/src/core/org/apache/jmeter/gui/action/Save.java
index d163319..938e9af 100644
--- a/src/core/org/apache/jmeter/gui/action/Save.java
+++ b/src/core/org/apache/jmeter/gui/action/Save.java
@@ -315,7 +315,7 @@
      *         has performed successfully
      */
     private List<File> createBackupFile(File fileToBackup) {
-        if (!BACKUP_ENABLED) {
+        if (!BACKUP_ENABLED || !fileToBackup.exists()) {
             return EMPTY_FILE_LIST;
         }
         char versionSeparator = '-'; //$NON-NLS-1$
