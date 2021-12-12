diff --git a/src/com/fsck/k9/activity/MessageCompose.java b/src/com/fsck/k9/activity/MessageCompose.java
index cec4735..819517a 100644
--- a/src/com/fsck/k9/activity/MessageCompose.java
+++ b/src/com/fsck/k9/activity/MessageCompose.java
@@ -1499,7 +1499,7 @@
         }
         sendMessage();
 
-        if (mMessageReference.flag != null)
+        if (mMessageReference != null && mMessageReference.flag != null)
         {
             if (K9.DEBUG)
                 Log.d(K9.LOG_TAG, "Setting referenced message (" + mMessageReference.folderName + ", " + mMessageReference.uid + ") flag to " + mMessageReference.flag);
