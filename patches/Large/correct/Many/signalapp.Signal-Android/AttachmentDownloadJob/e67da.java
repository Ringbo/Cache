diff --git a/src/org/thoughtcrime/securesms/jobs/AttachmentDownloadJob.java b/src/org/thoughtcrime/securesms/jobs/AttachmentDownloadJob.java
index 38795dc..ce04e40 100644
--- a/src/org/thoughtcrime/securesms/jobs/AttachmentDownloadJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/AttachmentDownloadJob.java
@@ -124,7 +124,7 @@
 
   private File createTempFile() throws InvalidPartException {
     try {
-      File file = File.createTempFile("push-attachment", "tmp");
+      File file = File.createTempFile("push-attachment", "tmp", context.getCacheDir());
       file.deleteOnExit();
 
       return file;
