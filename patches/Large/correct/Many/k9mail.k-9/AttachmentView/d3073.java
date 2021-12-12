diff --git a/src/com/fsck/k9/view/AttachmentView.java b/src/com/fsck/k9/view/AttachmentView.java
index 1fc9bec..c4558d3 100644
--- a/src/com/fsck/k9/view/AttachmentView.java
+++ b/src/com/fsck/k9/view/AttachmentView.java
@@ -236,13 +236,13 @@
             out.flush();
             out.close();
             in.close();
-            attachmentSaved(file.toString());
+            displayAttachmentSavedMessage(file.toString());
             new MediaScannerNotifier(context, file);
         } catch (IOException ioe) {
             if (K9.DEBUG) {
                 Log.e(K9.LOG_TAG, "Error saving attachment", ioe);
             }
-            attachmentNotSaved();
+            displayAttachmentNotSavedMessage();
         }
     }
 
@@ -264,12 +264,12 @@
         }
     }
 
-    public void attachmentSaved(final String filename) {
+    private void displayAttachmentSavedMessage(final String filename) {
         String message = context.getString(R.string.message_view_status_attachment_saved, filename);
         displayMessageToUser(message);
     }
 
-    public void attachmentNotSaved() {
+    private void displayAttachmentNotSavedMessage() {
         String message = context.getString(R.string.message_view_status_attachment_not_saved);
         displayMessageToUser(message);
     }
