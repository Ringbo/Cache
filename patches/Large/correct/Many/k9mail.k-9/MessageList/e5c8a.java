diff --git a/src/com/fsck/k9/activity/MessageList.java b/src/com/fsck/k9/activity/MessageList.java
index 35413b8..535ddee 100644
--- a/src/com/fsck/k9/activity/MessageList.java
+++ b/src/com/fsck/k9/activity/MessageList.java
@@ -1861,7 +1861,7 @@
             menu.findItem(R.id.archive).setVisible(false);
         }
 
-        if (!mAccount.hasSpamFolder()) {
+        if (!account.hasSpamFolder()) {
             menu.findItem(R.id.spam).setVisible(false);
         }
 
