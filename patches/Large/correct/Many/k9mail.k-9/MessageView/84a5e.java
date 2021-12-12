diff --git a/src/com/fsck/k9/activity/MessageView.java b/src/com/fsck/k9/activity/MessageView.java
index 1e3e663..3ebd01e 100644
--- a/src/com/fsck/k9/activity/MessageView.java
+++ b/src/com/fsck/k9/activity/MessageView.java
@@ -447,7 +447,7 @@
 
     private void showNextMessage() {
         findSurroundingMessagesUid();
-        if (mMessageReferences == null) {
+        if (mMessageReferences != null) {
             mMessageReferences.remove(mMessageReference);
         }
         if (mLastDirection == NEXT && mNextMessage != null) {
