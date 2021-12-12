diff --git a/src/org/thoughtcrime/securesms/jobs/PushSendJob.java b/src/org/thoughtcrime/securesms/jobs/PushSendJob.java
index 6f79d5f..ca23d00 100644
--- a/src/org/thoughtcrime/securesms/jobs/PushSendJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/PushSendJob.java
@@ -63,7 +63,7 @@
           ContentType.isVideoType(attachment.getContentType()))
       {
         try {
-          if (attachment.getDataUri() == null) throw new IOException("Assertion failed, outgoing attachment has no data!");
+          if (attachment.getDataUri() == null || attachment.getSize() == 0) throw new IOException("Assertion failed, outgoing attachment has no data!");
           InputStream is = PartAuthority.getAttachmentStream(context, masterSecret, attachment.getDataUri());
           attachments.add(SignalServiceAttachment.newStreamBuilder()
                                                  .withStream(is)
