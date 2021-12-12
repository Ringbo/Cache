diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java
index f024635..e0acbcd 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java
@@ -885,7 +885,7 @@
                 // Wrong OS or architecture
                 continue;
             }
-            final File libraryFile = file.getLocalFile();
+            final File libraryFile = file.getFile();
             if (!libraryFile.exists()) {
                 downloadCandidates.add(file);
             }
@@ -943,7 +943,7 @@
         // User must accept all licenses before actual drivers download
         for (final DriverFileDescriptor file : getFiles()) {
             if (file.getType() == DBPDriverFileType.license) {
-                final File libraryFile = file.getLocalFile();
+                final File libraryFile = file.getFile();
                 if (!libraryFile.exists()) {
                     try {
                         DBeaverUI.runInProgressService(new DBRRunnableWithProgress() {
@@ -1054,7 +1054,7 @@
         //final String contentType = connection.getContentType();
         monitor.beginTask("Download " + file.getExternalURL(), contentLength);
         boolean success = false;
-        final File localFile = file.getLocalFile();
+        final File localFile = file.getFile();
         final File localDir = localFile.getParentFile();
         if (!localDir.exists()) {
             if (!localDir.mkdirs()) {
