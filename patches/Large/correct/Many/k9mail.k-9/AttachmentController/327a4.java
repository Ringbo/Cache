diff --git a/k9mail/src/main/java/com/fsck/k9/ui/messageview/AttachmentController.java b/k9mail/src/main/java/com/fsck/k9/ui/messageview/AttachmentController.java
index 38d2269..45d8946 100644
--- a/k9mail/src/main/java/com/fsck/k9/ui/messageview/AttachmentController.java
+++ b/k9mail/src/main/java/com/fsck/k9/ui/messageview/AttachmentController.java
@@ -84,7 +84,7 @@
             @Override
             public void run() {
                 messageViewFragment.refreshAttachmentThumbnail(attachment);
-                saveAttachmentTo(directory);
+                saveLocalAttachmentTo(directory);
             }
         });
     }
